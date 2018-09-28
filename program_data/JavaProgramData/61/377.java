package <missing>;

public class GlobalMembers
{
	/*
	 * find.cpp
	 *
	 *  Created on: 2012-10-7
	 *      Author: Administrator
	 */
	public static int fob(int j)
	{ //??????j????????
		if (j == 1 || j == 2)
		{
			return 1; //????????
		}
		else
		{
				int a = 1;
				int b = 1;
				int c;
				for (int k = 3;k <= j;k++)
				{
					c = a + b;
					a = b;
					b = c;
				}
				return c;
		}

	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] a = new int[n];
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //???a[0]
		for (i = 1;i <= n;i++)
		{
			System.out.print(fob(a[i]));
			System.out.print("\n");
		}
		return 0;
	}

}

