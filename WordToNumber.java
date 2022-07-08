import java.util.Scanner;

public class WordToNumber {

	public static void titleToNumber(String s)
	{
		int result=0;
		
		for(int i=0;i<s.length();i++)
		{
			result = result*26+(s.charAt(i)-'A')+1;
		
		}
		System.out.println(result);	
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		String title = (scanner.next().toUpperCase());
		
		titleToNumber(title);
	}

}
