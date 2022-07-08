import java.util.Scanner;

public class MaxProfit {
	
	public static int maxProfit(int [] prices)
	{
		int maxprofit = 0;  
		for(int i =0;i<prices.length-1;i++)
		{
			for (int j=i+1;j<prices.length;j++)
			{
				int profit = prices[j]-prices[i];
				
				if(profit>maxprofit)
					maxprofit = profit;
			}
		}
			return maxprofit;
	}
	
public static void main (String [] args)
{
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the array size");
	int size = scanner.nextInt();
	int []prices1 = new int [size];
	System.out.println("Enter the Prices :");
	for (int i=0;i<size;i++)
	{
		prices1[i]=scanner.nextInt();
	}
//	int [] prices = new int [] {7,1,5,3,6,4};
//	int prices = maxProfit(prices1);
	System.out.println("The maximum profit is  :"+  maxProfit(prices1));
	
}
}
