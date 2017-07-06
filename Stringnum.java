# Stringnum
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.StringIndexOutOfBoundsException;

public class Stringnum 
{
    public static void main(String[] args)throws IOException
    {

    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        java.lang.String inputStr;
        System.out.println("Enter the string to reverse");
        inputStr = br.readLine();
        System.out.println(reverseString(inputStr));
    }
    public static java.lang.String reverseString(java.lang.String inputStr)
    {
       if (inputStr.length() == 1) 
       {
           return inputStr;
       }
       return reverseString(inputStr.substring(1)) + inputStr.charAt(0);
    }
}
