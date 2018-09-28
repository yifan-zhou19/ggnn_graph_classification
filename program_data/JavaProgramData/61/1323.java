package <missing>;

public class GlobalMembers
{
	/*
	 *  Name?fenli.cpp
	 *
	 *  Created on: 2012-10-16
	 *  Author: 00948343_??
	 *  Function??????????
	 */



	public static int Main()
	{
		int n;
		int count;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			count = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < count;j++)
			{
				if (j == 0)
				{
					sum1 = 1;
					sum2 = 1;
					sum3 = 1;
				}
				else if (j == 1)
				{
					sum1 = 1;
					sum2 = 1;
					sum3 = 1;
				}
				else
				{
					sum1 = sum2;
					sum2 = sum3;
					sum3 = sum1 + sum2;
				}
			}
			System.out.print(sum3);
			System.out.print('\n');
			sum3 = 0, sum1 = 0, sum2 = 0;
		}
	}

}

