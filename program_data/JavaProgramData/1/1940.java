package <missing>;

public class GlobalMembers
{
	/*
	 * fenjie.cpp
	 *
	 *  Created on: 2013-11-24
	 *      Author: ??
	 */
	public static int num = 0;
	public static void fj(int m,int i)
	{
		if (m == 1)
		{
			num++;
		}
		else
		{
			for (int j = i;j <= m;j++)
			{
				if (m % j == 0)
				{
					fj(m / j, j);
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int ii = 0;ii < n;ii++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			fj(m, 2);
			System.out.print(num);
			System.out.print("\n");
			num = 0;
		}
		return 0;
	}

}

