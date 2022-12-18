package in.ineuron.main;

import java.util.Scanner;

class Unique
{
	boolean uniqueChar(String str)
	{
		for(int i=0; i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
		
	}
}
public class UniqueCharacters {

	public static void main(String[] args) {
		Unique u=new Unique();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the string");
		String st=sc.nextLine();
		sc.close();
		if(u.uniqueChar(st))
		{
			System.out.println("The give string has all unique characters :" +st);
			
		}
		else
		{
			System.out.println("The give string is not unique, it has duplicate characters :" +st);
		}
		
	}

}