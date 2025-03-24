package com.basics;

class StringOperations
{
    public static void main (String[] args)
    {
        String s= "GeeksforGeeks";
        // or String s= new String ("GeeksforGeeks");

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());
        // String length = 13


        // Returns the character at ith index.
        System.out.println("Character at 3rd position = " + s.charAt(3));
        // Character at 3rd position = k


        // Return the substring from the ith index character to end of string
        System.out.println("Substring " + s.substring(3));
        // Substring ksforGeeks


        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));
        // Substring  = eks


        // Concatenates string2 to the end of string1.
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println("Concatenated string  = " + s1.concat(s2));
        // Concatenated string  = GeeksforGeeks


        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share"));
        // Index of Share 6


        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + s4.indexOf('a',3));
        // Index of a  = 8


        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out); // Checking Equality  false
        
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out); // Checking Equality  true

        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out); // Checking Equality false
        

        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1); 
        // the difference between ASCII value is=-31

        
        // Converting cases
        String w1 = "GeeKyMe";
        System.out.println("Changing to lower Case " + w1.toLowerCase());
        // Changing to lower Case geekyme

        String w2 = "GeekyME";
        System.out.println("Changing to UPPER Case " + w2.toUpperCase());
        // Changing to UPPER Case GEEKYME


        // Trimming the word
        String w4 = " Learn Share Learn ";
        System.out.println("Trim the word '" + w4.trim() + "'");
        // Trim the word 'Learn Share Learn'


        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1); // Original String feeksforfeeks
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2); // Replaced f with g -> geeksgorgeeks
    }
}