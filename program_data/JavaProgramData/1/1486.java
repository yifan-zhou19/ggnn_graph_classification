package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2012-9-14
	 *      Author: 12006
	 */

	public static int tmp = 2;
	public static int suml(int n,int tmp) //??????
	{
		int sum = 0;
		if (n == 1)
		{
			return 1;
		}
		for (int i = tmp ; i <= n ; i++)
		{
			if (n % i == 0)
			{
				sum += suml(n / i, i);


			}
		}
		return sum;
	}
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int n;
		for (int i = 0 ; i < m ; i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int zon_shu = 0;
			zon_shu = suml(n, tmp);
			System.out.print(zon_shu);
			System.out.print("\n");
		}
	}

}

