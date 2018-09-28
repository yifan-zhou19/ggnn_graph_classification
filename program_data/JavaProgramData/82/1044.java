package <missing>;

public class GlobalMembers
{
	/*
	 * 304.cpp
	 *  Theme: ???? 
	 *  Created on: 2012-10-24
	 *  Author: ??? 
	 */

	public static int max(int a,int b) //??????:??????????
	{
		return a > b != 0?a:b;
	}

	public static int Main()
	{
		int n; //????
		int a;
		int b;
		int k = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a >= 90 && a <= 140) && (b >= 60 && b <= 90))
			{
					sum++;
			k = max(k, sum);
			} //??max??
			else
			{
				sum = 0; //???????sum??
			}

		}
		System.out.print(k);
		System.out.print("\n");
		return 0;
	}

}

