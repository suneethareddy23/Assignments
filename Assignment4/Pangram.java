package in.ineuron.main;

import java.util.Scanner;

public class Pangram
{
	 
	public static void pangramCheck(String str)
	{
	    str = str.toLowerCase();
	    boolean allLettersPresent = true;

	    for (char ch = 'a'; ch <= 'z'; ch++) {
	        if (str.indexOf(ch) < 0) {
	            allLettersPresent = false;
	            break;
	        }
	    }

	    if (allLettersPresent)
	        System.out.println("The given string is Pangram");
	    else
	        System.out.println("It is not a pangram");
	}
    
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        sc.close();
        pangramCheck(str);
}
}