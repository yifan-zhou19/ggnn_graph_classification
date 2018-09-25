package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-11-20
	 *      Author: 7
	 */
	public static int t = 1;
	public static void fen(int n,int i)
	{
		for (i = i;i * i <= n;i++)
		{
			if (n % i == 0)
			{
				fen(n / i, i);
				t++;
			}
		}
	}
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = 1;
			fen(n, 2);
			System.out.print(t);
			System.out.print("\n");
		}
	}

}

