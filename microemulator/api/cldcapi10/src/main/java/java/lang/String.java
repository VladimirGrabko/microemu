/*
 *
 *
 * Copyright  1990-2007 Sun Microsystems, Inc. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version
 * 2 only, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details (a copy is
 * included at /legal/license.txt).
 *
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa
 * Clara, CA 95054 or visit www.sun.com if you need additional
 * information or have any questions.
 */

package java.lang;

import java.io.UnsupportedEncodingException;

/**
 * The <code>String</code> class represents character strings. All
 * string literals in Java programs, such as <code>"abc"</code>, are
 * implemented as instances of this class.
 * <p>
 * Strings are constant; their values cannot be changed after they
 * are created. String buffers support mutable strings.
 * Because String objects are immutable they can be shared. For example:
 * <p><blockquote><pre>
 *     String str = "abc";
 * </pre></blockquote><p>
 * is equivalent to:
 * <p><blockquote><pre>
 *     char data[] = {'a', 'b', 'c'};
 *     String str = new String(data);
 * </pre></blockquote><p>
 * Here are some more examples of how strings can be used:
 * <p><blockquote><pre>
 *     System.out.println("abc");
 *     String cde = "cde";
 *     System.out.println("abc" + cde);
 *     String c = "abc".substring(2,3);
 *     String d = cde.substring(1, 2);
 * </pre></blockquote>
 * <p>
 * The class <code>String</code> includes methods for examining
 * individual characters of the sequence, for comparing strings, for
 * searching strings, for extracting substrings, and for creating a
 * copy of a string with all characters translated to uppercase or to
 * lowercase.
 * <p>
 * The Java language provides special support for the string
 * concatenation operator (&nbsp;+&nbsp;), and for conversion of
 * other objects to strings. String concatenation is implemented
 * through the <code>StringBuffer</code> class and its
 * <code>append</code> method.
 * String conversions are implemented through the method
 * <code>toString</code>, defined by <code>Object</code> and
 * inherited by all classes in Java. For additional information on
 * string concatenation and conversion, see
 * <i>The Java Language Specification</i>.
 *
 * @version 1.121, 10/06/99 (CLDC 1.0, Spring 2000)
 * @see     java.lang.Object#toString()
 * @see     java.lang.StringBuffer
 * @see     java.lang.StringBuffer#append(boolean)
 * @see     java.lang.StringBuffer#append(char)
 * @see     java.lang.StringBuffer#append(char[])
 * @see     java.lang.StringBuffer#append(char[], int, int)
 * @see     java.lang.StringBuffer#append(int)
 * @see     java.lang.StringBuffer#append(long)
 * @see     java.lang.StringBuffer#append(java.lang.Object)
 * @see     java.lang.StringBuffer#append(java.lang.String)
 * @since   JDK1.0
 */
public final
class String {

    /**
     * Initializes a newly created <code>String</code> object so that it
     * represents an empty character sequence.
     */
    public String() {
    }

    /**
     * Initializes a newly created <code>String</code> object so that it
     * represents the same sequence of characters as the argument; in other
     * words, the newly created string is a copy of the argument string.
     *
     * @param   value   a <code>String</code>.
     */
    public String(String value) {
    }

    /**
     * Allocates a new <code>String</code> so that it represents the
     * sequence of characters currently contained in the character array
     * argument. The contents of the character array are copied; subsequent
     * modification of the character array does not affect the newly created
     * string.
     *
     * @param  value   the initial value of the string.
     * @throws NullPointerException if <code>value</code> is <code>null</code>.
     */
    public String(char value[]) {
    }

    /**
     * Allocates a new <code>String</code> that contains characters from
     * a subarray of the character array argument. The <code>offset</code>
     * argument is the index of the first character of the subarray and
     * the <code>count</code> argument specifies the length of the
     * subarray. The contents of the subarray are copied; subsequent
     * modification of the character array does not affect the newly
     * created string.
     *
     * @param      value    array that is the source of characters.
     * @param      offset   the initial offset.
     * @param      count    the length.
     * @exception  IndexOutOfBoundsException  if the <code>offset</code>
     *               and <code>count</code> arguments index characters outside
     *               the bounds of the <code>value</code> array.
     * @exception NullPointerException if <code>value</code> is
     *               <code>null</code>.
     */
    public String(char value[], int offset, int count) {
    }

    /**
     * Construct a new <code>String</code> by converting the specified
     * subarray of bytes using the specified character encoding.  The length of
     * the new <code>String</code> is a function of the encoding, and hence may
     * not be equal to the length of the subarray.
     *
     * @param  bytes   The bytes to be converted into characters
     * @param  off     Index of the first byte to convert
     * @param  len     Number of bytes to convert
     * @param  enc     The name of a character encoding
     *
     * @exception  UnsupportedEncodingException
     *             If the named encoding is not supported
     * @since      JDK1.1
     */
    public String(byte bytes[], int off, int len, String enc)
        throws UnsupportedEncodingException {
    }

    /**
     * Construct a new <code>String</code> by converting the specified array
     * of bytes using the specified character encoding.  The length of the new
     * <code>String</code> is a function of the encoding, and hence may not be
     * equal to the length of the byte array.
     *
     * @param  bytes   The bytes to be converted into characters
     * @param  enc     The name of a supported character encoding
     *
     * @exception  UnsupportedEncodingException
     *             If the named encoding is not supported
     * @since      JDK1.1
     */
    public String(byte bytes[], String enc)
        throws UnsupportedEncodingException {
    }

    /**
     * Construct a new <code>String</code> by converting the specified
     * subarray of bytes using the platform's default character encoding.  The
     * length of the new <code>String</code> is a function of the encoding, and
     * hence may not be equal to the length of the subarray.
     *
     * @param  bytes   The bytes to be converted into characters
     * @param  off     Index of the first byte to convert
     * @param  len     Number of bytes to convert
     * @since  JDK1.1
     */
    public String(byte bytes[], int off, int len) {
    }

    /**
     * Construct a new <code>String</code> by converting the specified array
     * of bytes using the platform's default character encoding.  The length of
     * the new <code>String</code> is a function of the encoding, and hence may
     * not be equal to the length of the byte array.
     *
     * @param  bytes   The bytes to be converted into characters
     * @since  JDK1.1
     */
    public String(byte bytes[]) {
    }

    /**
     * Allocates a new string that contains the sequence of characters
     * currently contained in the string buffer argument. The contents of
     * the string buffer are copied; subsequent modification of the string
     * buffer does not affect the newly created string.
     *
     * @param   buffer   a <code>StringBuffer</code>.
     * @throws NullPointerException If <code>buffer</code> is
     * <code>null</code>.
     */
    public String (StringBuffer buffer) {
    }

    /**
     * Returns the length of this string.
     * The length is equal to the number of 16-bit
     * Unicode characters in the string.
     *
     * @return  the length of the sequence of characters represented by this
     *          object.
     */
    public int length() {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the character at the specified index. An index ranges
     * from <code>0</code> to <code>length() - 1</code>. The first character
     * of the sequence is at index <code>0</code>, the next at index
     * <code>1</code>, and so on, as for array indexing.
     *
     * @param      index   the index of the character.
     * @return     the character at the specified index of this string.
     *             The first character is at index <code>0</code>.
     * @exception  IndexOutOfBoundsException  if the <code>index</code>
     *             argument is negative or not less than the length of this
     *             string.
     */
    public char charAt(int index) {
        throw new RuntimeException("STUB");
    }

    /**
     * Copies characters from this string into the destination character
     * array.
     * <p>
     * The first character to be copied is at index <code>srcBegin</code>;
     * the last character to be copied is at index <code>srcEnd-1</code>
     * (thus the total number of characters to be copied is
     * <code>srcEnd-srcBegin</code>). The characters are copied into the
     * subarray of <code>dst</code> starting at index <code>dstBegin</code>
     * and ending at index:
     * <p><blockquote><pre>
     *     dstbegin + (srcEnd-srcBegin) - 1
     * </pre></blockquote>
     *
     * @param      srcBegin   index of the first character in the string
     *                        to copy.
     * @param      srcEnd     index after the last character in the string
     *                        to copy.
     * @param      dst        the destination array.
     * @param      dstBegin   the start offset in the destination array.
     * @exception IndexOutOfBoundsException If any of the following
     *            is true:
     *            <ul><li><code>srcBegin</code> is negative.
     *            <li><code>srcBegin</code> is greater than <code>srcEnd</code>
     *            <li><code>srcEnd</code> is greater than the length of this
     *                string
     *            <li><code>dstBegin</code> is negative
     *            <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than
     *                <code>dst.length</code></ul>
     * @exception NullPointerException if <code>dst</code> is <code>null</code>
     */
    public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin) {
    }

    /**
     * Convert this <code>String</code> into bytes according to the specified
     * character encoding, storing the result into a new byte array.
     *
     * @param  enc  A character-encoding name
     * @return      The resultant byte array
     *
     * @exception  UnsupportedEncodingException
     *             If the named encoding is not supported
     * @since      JDK1.1
     */
    public byte[] getBytes(String enc) throws UnsupportedEncodingException {
        throw new RuntimeException("STUB");
    }

    /**
     * Convert this <code>String</code> into bytes according to the platform's
     * default character encoding, storing the result into a new byte array.
     *
     * @return  the resultant byte array.
     * @since   JDK1.1
     */
    public byte[] getBytes() {
        throw new RuntimeException("STUB");
    }

    /**
     * Compares this string to the specified object.
     * The result is <code>true</code> if and only if the argument is not
     * <code>null</code> and is a <code>String</code> object that represents
     * the same sequence of characters as this object.
     *
     * @param   anObject   the object to compare this <code>String</code>
     *                     against.
     * @return  <code>true</code> if the <code>String </code>are equal;
     *          <code>false</code> otherwise.
     * @see     java.lang.String#compareTo(java.lang.String)
     */
/*
    public native boolean equals(Object anObject);
*/
   public boolean equals(Object anObject) {
       throw new RuntimeException("STUB");
   }

    /**
     * Compares two strings lexicographically.
     * The comparison is based on the Unicode value of each character in
     * the strings. The character sequence represented by this
     * <code>String</code> object is compared lexicographically to the
     * character sequence represented by the argument string. The result is
     * a negative integer if this <code>String</code> object
     * lexicographically precedes the argument string. The result is a
     * positive integer if this <code>String</code> object lexicographically
     * follows the argument string. The result is zero if the strings
     * are equal; <code>compareTo</code> returns <code>0</code> exactly when
     * the {@link #equals(Object)} method would return <code>true</code>.
     * <p>
     * This is the definition of lexicographic ordering. If two strings are
     * different, then either they have different characters at some index
     * that is a valid index for both strings, or their lengths are different,
     * or both. If they have different characters at one or more index
     * positions, let <i>k</i> be the smallest such index; then the string
     * whose character at position <i>k</i> has the smaller value, as
     * determined by using the < operator, lexicographically precedes the
     * other string. In this case, <code>compareTo</code> returns the
     * difference of the two character values at position <code>k</code> in
     * the two string -- that is, the value:
     * <blockquote><pre>
     * this.charAt(k)-anotherString.charAt(k)
     * </pre></blockquote>
     * If there is no index position at which they differ, then the shorter
     * string lexicographically precedes the longer string. In this case,
     * <code>compareTo</code> returns the difference of the lengths of the
     * strings -- that is, the value:
     * <blockquote><pre>
     * this.length()-anotherString.length()
     * </pre></blockquote>
     *
     * @param   anotherString   the <code>String</code> to be compared.
     * @return  the value <code>0</code> if the argument string is equal to
     *          this string; a value less than <code>0</code> if this string
     *          is lexicographically less than the string argument; and a
     *          value greater than <code>0</code> if this string is
     *          lexicographically greater than the string argument.
     * @exception java.lang.NullPointerException if <code>anotherString</code>
     *          is <code>null</code>.
     */
    public int compareTo(String anotherString) {
         throw new RuntimeException("STUB");
    }

    /**
     * Tests if two string regions are equal.
     * <p>
     * A substring of this <tt>String</tt> object is compared to a substring
     * of the argument <tt>other</tt>. The result is <tt>true</tt> if these
     * substrings represent character sequences that are the same, ignoring
     * case if and only if <tt>ignoreCase</tt> is true. The substring of
     * this <tt>String</tt> object to be compared begins at index
     * <tt>toffset</tt> and has length <tt>len</tt>. The substring of
     * <tt>other</tt> to be compared begins at index <tt>ooffset</tt> and
     * has length <tt>len</tt>. The result is <tt>false</tt> if and only if
     * at least one of the following is true:
     * <ul><li><tt>toffset</tt> is negative.
     * <li><tt>ooffset</tt> is negative.
     * <li><tt>toffset+len</tt> is greater than the length of this
     * <tt>String</tt> object.
     * <li><tt>ooffset+len</tt> is greater than the length of the other
     * argument.
     * <li>There is some nonnegative integer <i>k</i> less than <tt>len</tt>
     * such that:
     * <blockquote><pre>
     * this.charAt(toffset+k) != other.charAt(ooffset+k)
     * </pre></blockquote>
     * <li><tt>ignoreCase</tt> is <tt>true</tt> and there is some nonnegative
     * integer <i>k</i> less than <tt>len</tt> such that:
     * <blockquote><pre>
     * Character.toLowerCase(this.charAt(toffset+k)) !=
               Character.toLowerCase(other.charAt(ooffset+k))
     * </pre></blockquote>
     * and:
     * <blockquote><pre>
     * Character.toUpperCase(this.charAt(toffset+k)) !=
     *         Character.toUpperCase(other.charAt(ooffset+k))
     * </pre></blockquote>
     * </ul>
     *
     * @param   ignoreCase   if <code>true</code>, ignore case when comparing
     *                       characters.
     * @param   toffset      the starting offset of the subregion in this
     *                       string.
     * @param   other        the string argument.
     * @param   ooffset      the starting offset of the subregion in the string
     *                       argument.
     * @param   len          the number of characters to compare.
     * @return  <code>true</code> if the specified subregion of this string
     *          matches the specified subregion of the string argument;
     *          <code>false</code> otherwise. Whether the matching is exact
     *          or case insensitive depends on the <code>ignoreCase</code>
     *          argument.
     */
    public boolean regionMatches(boolean ignoreCase,
                                         int toffset,
                                       String other, int ooffset, int len) {
        throw new RuntimeException("STUB");
    }

    /**
     * Tests if this string starts with the specified prefix beginning
     * a specified index.
     *
     * @param   prefix    the prefix.
     * @param   toffset   where to begin looking in the string.
     * @return  <code>true</code> if the character sequence represented by the
     *          argument is a prefix of the substring of this object starting
     *          at index <code>toffset</code>; <code>false</code> otherwise.
     *          The result is <code>false</code> if <code>toffset</code> is
     *          negative or greater than the length of this
     *          <code>String</code> object; otherwise the result is the same
     *          as the result of the expression
     *          <pre>
     *          this.subString(toffset).startsWith(prefix)
     *          </pre>
     * @exception java.lang.NullPointerException if <code>prefix</code> is
     *          <code>null</code>.
     */
    public boolean startsWith(String prefix, int toffset) {
        throw new RuntimeException("STUB");
    }

    /**
     * Tests if this string starts with the specified prefix.
     *
     * @param   prefix   the prefix.
     * @return  <code>true</code> if the character sequence represented by the
     *          argument is a prefix of the character sequence represented by
     *          this string; <code>false</code> otherwise.
     *          Note also that <code>true</code> will be returned if the
     *          argument is an empty string or is equal to this
     *          <code>String</code> object as determined by the
     *          {@link #equals(Object)} method.
     * @exception java.lang.NullPointerException if <code>prefix</code> is
     *          <code>null</code>.
     * @since   JDK1. 0
     */
    public boolean startsWith(String prefix) {
        throw new RuntimeException("STUB");
    }

    /**
     * Tests if this string ends with the specified suffix.
     *
     * @param   suffix   the suffix.
     * @return  <code>true</code> if the character sequence represented by the
     *          argument is a suffix of the character sequence represented by
     *          this object; <code>false</code> otherwise. Note that the
     *          result will be <code>true</code> if the argument is the
     *          empty string or is equal to this <code>String</code> object
     *          as determined by the {@link #equals(Object)} method.
     * @exception java.lang.NullPointerException if <code>suffix</code> is
     *          <code>null</code>.
     */
    public boolean endsWith(String suffix) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns a hashcode for this string. The hashcode for a
     * <code>String</code> object is computed as
     * <blockquote><pre>
     * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
     * </pre></blockquote>
     * using <code>int</code> arithmetic, where <code>s[i]</code> is the
     * <i>i</i>th character of the string, <code>n</code> is the length of
     * the string, and <code>^</code> indicates exponentiation.
     * (The hash value of the empty string is zero.)
     *
     * @return  a hash code value for this object.
     */
    public native int hashCode();
/*
    public int hashCode() {
        throw new RuntimeException("STUB");
    }
*/

    /**
     * Returns the index within this string of the first occurrence of the
     * specified character. If a character with value <code>ch</code> occurs
     * in the character sequence represented by this <code>String</code>
     * object, then the index of the first such occurrence is returned --
     * that is, the smallest value <i>k</i> such that:
     * <blockquote><pre>
     * this.charAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is <code>true</code>. If no such character occurs in this string,
     * then <code>-1</code> is returned.
     *
     * @param   ch   a character.
     * @return  the index of the first occurrence of the character in the
     *          character sequence represented by this object, or
     *          <code>-1</code> if the character does not occur.
     */
    public native int indexOf(int ch);
/*
  public int indexOf(int ch) {
      throw new RuntimeException("STUB");
  }
*/

    /**
     * Returns the index within this string of the first occurrence of the
     * specified character, starting the search at the specified index.
     * <p>
     * If a character with value <code>ch</code> occurs in the character
     * sequence represented by this <code>String</code> object at an index
     * no smaller than <code>fromIndex</code>, then the index of the first
     * such occurrence is returned--that is, the smallest value <i>k</i>
     * such that:
     * <blockquote><pre>
     * (this.charAt(<i>k</i>) == ch) && (<i>k</i> >= fromIndex)
     * </pre></blockquote>
     * is true. If no such character occurs in this string at or after
     * position <code>fromIndex</code>, then <code>-1</code> is returned.
     * <p>
     * There is no restriction on the value of <code>fromIndex</code>. If it
     * is negative, it has the same effect as if it were zero: this entire
     * string may be searched. If it is greater than the length of this
     * string, it has the same effect as if it were equal to the length of
     * this string: <code>-1</code> is returned.
     *
     * @param   ch          a character.
     * @param   fromIndex   the index to start the search from.
     * @return  the index of the first occurrence of the character in the
     *          character sequence represented by this object that is greater
     *          than or equal to <code>fromIndex</code>, or <code>-1</code>
     *          if the character does not occur.
     */
    public native int indexOf(int ch, int fromIndex);

/*
  public int indexOf(int ch, int fromIndex) {
      throw new RuntimeException("STUB");
  }
*/

    /**
     * Returns the index within this string of the last occurrence of the
     * specified character. That is, the index returned is the largest
     * value <i>k</i> such that:
     * <blockquote><pre>
     * this.charAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true.
     * The String is searched backwards starting at the last character.
     *
     * @param   ch   a character.
     * @return  the index of the last occurrence of the character in the
     *          character sequence represented by this object, or
     *          <code>-1</code> if the character does not occur.
     */
    public native int lastIndexOf(int ch);
/*
    public int lastIndexOf(int ch) {
        throw new RuntimeException("STUB");
    }
*/

    /**
     * Returns the index within this string of the last occurrence of the
     * specified character, searching backward starting at the specified
     * index. That is, the index returned is the largest value <i>k</i>
     * such that:
     * <blockquote><pre>
     * this.charAt(k) == ch) && (k <= fromIndex)
     * </pre></blockquote>
     * is true.
     *
     * @param   ch          a character.
     * @param   fromIndex   the index to start the search from. There is no
     *          restriction on the value of <code>fromIndex</code>. If it is
     *          greater than or equal to the length of this string, it has
     *          the same effect as if it were equal to one less than the
     *          length of this string: this entire string may be searched.
     *          If it is negative, it has the same effect as if it were -1:
     *          -1 is returned.
     * @return  the index of the last occurrence of the character in the
     *          character sequence represented by this object that is less
     *          than or equal to <code>fromIndex</code>, or <code>-1</code>
     *          if the character does not occur before that point.
     */
    public native int lastIndexOf(int ch, int fromIndex);
/*
    public int lastIndexOf(int ch, int fromIndex) {
        throw new RuntimeException("STUB");
    }
*/

    /**
     * Returns the index within this string of the first occurrence of the
     * specified substring. The integer returned is the smallest value
     * <i>k</i> such that:
     * <blockquote><pre>
     * this.startsWith(str, <i>k</i>)
     * </pre></blockquote>
     * is <code>true</code>.
     *
     * @param   str   any string.
     * @return  if the string argument occurs as a substring within this
     *          object, then the index of the first character of the first
     *          such substring is returned; if it does not occur as a
     *          substring, <code>-1</code> is returned.
     * @exception java.lang.NullPointerException if <code>str</code> is
     *          <code>null</code>.
     */
    public int indexOf(String str) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the index within this string of the first occurrence of the
     * specified substring, starting at the specified index. The integer
     * returned is the smallest value <i>k</i> such that:
     * <blockquote><pre>
     * this.startsWith(str, <i>k</i>) && (<i>k</i> >= fromIndex)
     * </pre></blockquote>
     * is <code>true</code>.
     * <p>
     * There is no restriction on the value of <code>fromIndex</code>. If
     * it is negative, it has the same effect as if it were zero: this entire
     * string may be searched. If it is greater than the length of this
     * string, it has the same effect as if it were equal to the length of
     * this string: <code>-1</code> is returned.
     *
     * @param   str         the substring to search for.
     * @param   fromIndex   the index to start the search from.
     * @return  If the string argument occurs as a substring within this
     *          object at a starting index no smaller than
     *          <code>fromIndex</code>, then the index of the first character
     *          of the first such substring is returned. If it does not occur
     *          as a substring starting at <code>fromIndex</code> or beyond,
     *          <code>-1</code> is returned.
     * @exception java.lang.NullPointerException if <code>str</code> is
     *          <code>null</code>
     */
    public int indexOf(String str, int fromIndex) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns a new string that is a substring of this string. The
     * substring begins with the character at the specified index and
     * extends to the end of this string. <p>
     * Examples:
     * <blockquote><pre>
     * "unhappy".substring(2) returns "happy"
     * "Harbison".substring(3) returns "bison"
     * "emptiness".substring(9) returns "" (an empty string)
     * </pre></blockquote>
     *
     * @param      beginIndex   the beginning index, inclusive.
     * @return     the specified substring.
     * @exception  IndexOutOfBoundsException  if
     *             <code>beginIndex</code> is negative or larger than the
     *             length of this <code>String</code> object.
     */
    public String substring(int beginIndex) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns a new string that is a substring of this string. The
     * substring begins at the specified <code>beginIndex</code> and
     * extends to the character at index <code>endIndex - 1</code>.
     * Thus the length of the substring is <code>endIndex-beginIndex</code>.
     * <p>
     * Examples:
     * <blockquote><pre>
     * "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     * </pre></blockquote>
     *
     * @param      beginIndex   the beginning index, inclusive.
     * @param      endIndex     the ending index, exclusive.
     * @return     the specified substring.
     * @exception  IndexOutOfBoundsException  if the
     *             <code>beginIndex</code> is negative, or
     *             <code>endIndex</code> is larger than the length of
     *             this <code>String</code> object, or
     *             <code>beginIndex</code> is larger than
     *             <code>endIndex</code>.
     */
    public String substring(int beginIndex, int endIndex) {
        throw new RuntimeException("STUB");
    }

    /**
     * Concatenates the specified string to the end of this string.
     * <p>
     * If the length of the argument string is <code>0</code>, then this
     * <code>String</code> object is returned. Otherwise, a new
     * <code>String</code> object is created, representing a character
     * sequence that is the concatenation of the character sequence
     * represented by this <code>String</code> object and the character
     * sequence represented by the argument string.<p>
     * Examples:
     * <blockquote><pre>
     * "cares".concat("s") returns "caress"
     * "to".concat("get").concat("her") returns "together"
     * </pre></blockquote>
     *
     * @param   str   the <code>String</code> that is concatenated to the end
     *                of this <code>String</code>.
     * @return  a string that represents the concatenation of this object's
     *          characters followed by the string argument's characters.
     * @exception java.lang.NullPointerException if <code>str</code> is
     *          <code>null</code>.
     */
    public String concat(String str) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns a new string resulting from replacing all occurrences of
     * <code>oldChar</code> in this string with <code>newChar</code>.
     * <p>
     * If the character <code>oldChar</code> does not occur in the
     * character sequence represented by this <code>String</code> object,
     * then a reference to this <code>String</code> object is returned.
     * Otherwise, a new <code>String</code> object is created that
     * represents a character sequence identical to the character sequence
     * represented by this <code>String</code> object, except that every
     * occurrence of <code>oldChar</code> is replaced by an occurrence
     * of <code>newChar</code>.
     * <p>
     * Examples:
     * <blockquote><pre>
     * "mesquite in your cellar".replace('e', 'o')
     *         returns "mosquito in your collar"
     * "the war of baronets".replace('r', 'y')
     *         returns "the way of bayonets"
     * "sparring with a purple porpoise".replace('p', 't')
     *         returns "starring with a turtle tortoise"
     * "JonL".replace('q', 'x') returns "JonL" (no change)
     * </pre></blockquote>
     *
     * @param   oldChar   the old character.
     * @param   newChar   the new character.
     * @return  a string derived from this string by replacing every
     *          occurrence of <code>oldChar</code> with <code>newChar</code>.
     */
    public String replace(char oldChar, char newChar) {
        throw new RuntimeException("STUB");
    }

    /**
     * Converts all of the characters in this String to lower case.
     *
     * @return the String, converted to lowercase.
     * @see Character#toLowerCase
     * @see String#toUpperCase
     */
    public String toLowerCase() {
        throw new RuntimeException("STUB");
    }

    /**
     * Converts all of the characters in this String to upper case.
     *
     * @return the String, converted to uppercase.
     * @see Character#toLowerCase
     * @see String#toUpperCase
     */
    public String toUpperCase() {
        throw new RuntimeException("STUB");
    }

    /**
     * Removes white space from both ends of this string.
     * <p>
     * If this <code>String</code> object represents an empty character
     * sequence, or the first and last characters of character sequence
     * represented by this <code>String</code> object both have codes
     * greater than <code>'&#92;u0020'</code> (the space character), then a
     * reference to this <code>String</code> object is returned.
     * <p>
     * Otherwise, if there is no character with a code greater than
     * <code>'&#92;u0020'</code> in the string, then a new
     * <code>String</code> object representing an empty string is created
     * and returned.
     * <p>
     * Otherwise, let <i>k</i> be the index of the first character in the
     * string whose code is greater than <code>'&#92;u0020'</code>, and let
     * <i>m</i> be the index of the last character in the string whose code
     * is greater than <code>'&#92;u0020'</code>. A new <code>String</code>
     * object is created, representing the substring of this string that
     * begins with the character at index <i>k</i> and ends with the
     * character at index <i>m</i>-that is, the result of
     * <code>this.substring(<i>k</i>,&nbsp;<i>m</i>+1)</code>.
     * <p>
     * This method may be used to trim whitespace from the beginning and end
     * of a string; in fact, it trims all ASCII control characters as well.
     *
     * @return  this string, with white space removed from the front and end.
     */
    public String trim() {
        throw new RuntimeException("STUB");
    }

    /**
     * This object (which is already a string!) is itself returned.
     *
     * @return  the string itself.
     */
    public String toString() {
        return this;
    }

    /**
     * Converts this string to a new character array.
     *
     * @return  a newly allocated character array whose length is the length
     *          of this string and whose contents are initialized to contain
     *          the character sequence represented by this string.
     */
    public char[] toCharArray() {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the string representation of the <code>Object</code> argument.
     *
     * @param   obj   an <code>Object</code>.
     * @return  if the argument is <code>null</code>, then a string equal to
     *          <code>"null"</code>; otherwise, the value of
     *          <code>obj.toString()</code> is returned.
     * @see     java.lang.Object#toString()
     */
    public static String valueOf(Object obj) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the string representation of the <code>char</code> array
     * argument. The contents of the character array are copied; subsequent
     * modification of the character array does not affect the newly
     * created string.
     *
     * @param   data   a <code>char</code> array.
     * @return  a newly allocated string representing the same sequence of
     *          characters contained in the character array argument.
     */
    public static String valueOf(char data[]) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the string representation of a specific subarray of the
     * <code>char</code> array argument.
     * <p>
     * The <code>offset</code> argument is the index of the first
     * character of the subarray. The <code>count</code> argument
     * specifies the length of the subarray. The contents of the subarray
     * are copied; subsequent modification of the character array does not
     * affect the newly created string.
     *
     * @param   data     the character array.
     * @param   offset   the initial offset into the value of the
     *                  <code>String</code>.
     * @param   count    the length of the value of the <code>String</code>.
     * @return  a newly allocated string representing the sequence of
     *          characters contained in the subarray of the character array
     *          argument.
     * @exception NullPointerException if <code>data</code> is
     *          <code>null</code>.
     * @exception IndexOutOfBoundsException if <code>offset</code> is
     *          negative, or <code>count</code> is negative, or
     *          <code>offset+count</code> is larger than
     *          <code>data.length</code>.
     */
    public static String valueOf(char data[], int offset, int count) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the string representation of the <code>boolean</code> argument.
     *
     * @param   b   a <code>boolean</code>.
     * @return  if the argument is <code>true</code>, a string equal to
     *          <code>"true"</code> is returned; otherwise, a string equal to
     *          <code>"false"</code> is returned.
     */
    public static String valueOf(boolean b) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the string representation of the <code>char</code>
     * argument.
     *
     * @param   c   a <code>char</code>.
     * @return  a newly allocated string of length <code>1</code> containing
     *          as its single character the argument <code>c</code>.
     */
    public static String valueOf(char c) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the string representation of the <code>int</code> argument.
     * <p>
     * The representation is exactly the one returned by the
     * <code>Integer.toString</code> method of one argument.
     *
     * @param   i   an <code>int</code>.
     * @return  a newly allocated string containing a string representation of
     *          the <code>int</code> argument.
     * @see     java.lang.Integer#toString(int, int)
     */
    public static String valueOf(int i) {
        throw new RuntimeException("STUB");
    }

    /**
     * Returns the string representation of the <code>long</code> argument.
     * <p>
     * The representation is exactly the one returned by the
     * <code>Long.toString</code> method of one argument.
     *
     * @param   l   a <code>long</code>.
     * @return  a newly allocated string containing a string representation of
     *          the <code>long</code> argument.
     * @see     java.lang.Long#toString(long)
     */
    public static String valueOf(long l) {
        throw new RuntimeException("STUB");
    }

}
