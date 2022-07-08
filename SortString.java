package Assignment0807;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String :");
		String word = scanner.next();
//		String word = "hfjsk6485lop";
		String letter = "";
		String digit = "";
		for(int i =0;i<word.length();i++)
		{
			if(Character.isDigit(word.charAt(i)))
			{

				digit = digit+word.charAt(i);
			}
			else
			{
				letter = letter+word.charAt(i);
			}
		}
		
		System.out.println("Digits in String :-" +digit);
		System.out.println("Letter in String :-" +letter);
		System.out.println("Conversion Of String :-" +(letter+digit));
//		System.out.println( );
	}
	

}
