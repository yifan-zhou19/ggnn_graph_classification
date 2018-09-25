package <missing>;

public class GlobalMembers
{
	/*
	 * 11.27.cpp
	 *
	 *  Created on: 2011-11-27
	 *      Author: Administrator
	 */
	public static int coun; // ???????
	public static void depart(int n,int i)
	{
	   int j;
	   if (n == 1)
	   {
		   coun++;
	   }
	   else
	   {
		   for (j = i;j <= n;j++) //???j?? ??????
		   {
		   if (n % j == 0)
		   {
		   depart(n / j, j);
		   }
		   }
	   }
	}

	public static int Main()
	{
		int n;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[n]; //???????
		for (j = 0;j < n;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			coun = 0; //?????
			depart(b[j], 2);
			System.out.print(coun);
			System.out.print("\n");
		}
		return 0;
	}

}

