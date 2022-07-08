package Assignment0807;

import java.util.HashMap;
import java.util.Map;

public class OccuernceOfLetter {
	public static void getCharCount (String name)
	{
		Map<Character, Integer > charMap= new HashMap<Character, Integer>();
		char strArray[]= name.toCharArray();
		for (char c :strArray) {
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c,1);
			}
		}
		System.out.println(name+ " : "+charMap);
		
	}
	
	public static void main (String [] args)
	{
		getCharCount("test");
//		String str = "aabbccdeg";
//		char [] strToArray = str.toCharArray();
//		
//		int count =1;
//		System.out.println(strToArray.length);
//		for (int i=0;i<strToArray.length-1;i++)
//		{	
////			System.out.println(strToArray[i]);
//			for (int j=i+1;j<strToArray.length;j++)
//			{
//				if(strToArray[i]==strToArray[j])
//					count++;
//			}
//			
//			System.out.println(strToArray[i] +" = "+count);
//			count=1;
//		
//			
//		}
		
	
		
		
		
	}

}
