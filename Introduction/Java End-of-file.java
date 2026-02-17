/* *
* Author: Aditya Purviya
* URL: https://github.com/Adityapurviya4
* */

import java.io.*;
import java.util.*;
 import java.text.*;
 import java.math.*;
  import java.util.regex.*;
   public class Solution {
     public static void main(String[] args) { 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */ 
   Scanner sc = new Scanner(System.in); 
   int no = 1;
   while(sc.hasNextLine()){
    String firsString = sc.nextLine();
    System.out.println(no + " " + firsString);
    no++;
   }

   sc.close(); 
   } 
   }