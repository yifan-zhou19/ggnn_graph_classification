package <missing>;

public class GlobalMembers
{
	/*
	 * T.cpp
	 *
	 *  Created on: 2011-11-5
	 *      Author: dell
	 */
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int flag = 1;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[x];
		int[] b = new int[y];
		a[0] = x;
		b[0] = y;
		for (i = 1;i <= x;i++)
		{
			a[i] = 0;
		}
		for (i = 1;i <= y;i++)
		{
				b[i] = 0;
		}
		for (i = 0;i <= x;i++)
		{
			a[i + 1] = a[i] / 2;
		}
		for (j = 0;j <= y;j++)
		{
			b[j + 1] = b[j] / 2;
		}
		for (i = 0;i <= x;i++)
		{
			for (j = 0;j <= y;j++)
			{
				if (a[i] == b[j])
				{
					System.out.print(a[i]);
					System.out.print("\n");
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				break;
			}
		}
		return 0;
	}
}

