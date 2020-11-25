/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karishma;

/**
 *
 * @author 
 */
 public class Karishma 
{ 

    static int toDecimal(String binary,int i) 

    { 

        // If we reached last character 

        int n = binary.length(); 

        if (i == n-1) 

        return binary.charAt(i) - '0'; 

          

        // Add current tern and recur for 

        // remaining terms 

        return ((binary.charAt(i) - '0') << (n-i-1)) + 

                toDecimal(binary, i+1); 

    } 

      

    // Driver code 

    public static void main(String []args) 

    { 

        String binary = "1010"; 

        int i=0; 

        System.out.println(toDecimal(binary,i)); 

          

    } 

  
} 

 