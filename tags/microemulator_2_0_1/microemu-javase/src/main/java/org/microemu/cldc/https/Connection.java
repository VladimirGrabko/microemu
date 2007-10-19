/*
 *  MicroEmulator
 *  Copyright (C) 2006 Bartek Teodorczyk <barteo@barteo.net>
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.microemu.cldc.https;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import javax.microedition.io.HttpsConnection;
import javax.microedition.io.SecurityInfo;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

import org.microemu.cldc.CertificateImpl;
import org.microemu.cldc.SecurityInfoImpl;
import org.microemu.log.Logger;

public class Connection extends org.microemu.cldc.http.Connection implements HttpsConnection {

	private SSLContext sslContext;

	private SecurityInfo securityInfo;

	public Connection() {
	    try {
			sslContext = SSLContext.getInstance("SSL");
		} catch (NoSuchAlgorithmException ex) {
			Logger.error(ex);
		}

		securityInfo = null;
	}

	public SecurityInfo getSecurityInfo() throws IOException {
		if (securityInfo == null) {
		    if (cn == null) {
				throw new IOException();
			}
			if (!connected) {
				cn.connect();
				connected = true;
			}
			HttpsURLConnection https = (HttpsURLConnection) cn;

			Certificate[] certs = https.getServerCertificates();
			if (certs.length == 0) {
				throw new IOException();
			}
			securityInfo = new SecurityInfoImpl(
					https.getCipherSuite(),
					sslContext.getProtocol(),
					new CertificateImpl((X509Certificate) certs[0]));
		}

		return securityInfo;
	}

	public String getProtocol() {
		return "https";
	}


    /**
     * Returns the network port number of the URL for this HttpsConnection
     *
     * @return  the network port number of the URL for this HttpsConnection. The default HTTPS port number (443) is returned if there was no port number in the string passed to Connector.open.
     */
	public int getPort() {
		if (cn == null) {
			return -1;
		}
		int port = cn.getURL().getPort();
		if (port == -1) {
			return 443;
		}
		return port;
	}

}