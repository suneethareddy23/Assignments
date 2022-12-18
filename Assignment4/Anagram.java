package in.ineuron.main;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
//String conversion to LowerCase
	public static String toLowerCase(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
		if (chars[i] >= 'A' && chars[i] <= 'Z') {
		chars[i] = (char) (chars[i] + ('a' - 'A'));
		}
		}
		return new String(chars);
		}
	
//sorting
	public static void sorting(char[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for( int j=0;j<arr.length ;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
			}
		}
		System.out.println("sorted strings are :" + new String(arr));
	}
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.nextLine();
		System.out.println("enter the second String");
		String s2=sc.nextLine();
		s1=toLowerCase(s1);
		s2=toLowerCase(s2);
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
	    sorting(arr1);
		sorting(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}

}
}