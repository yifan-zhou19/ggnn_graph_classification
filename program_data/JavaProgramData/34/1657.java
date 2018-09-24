package <missing>;

public class GlobalMembers
{
	/*
	 * jiaogucaixiang.cpp
	 *
	 *  Created on: 2013-11-16
	 *      Author: dyx
	 */
	public static int oushu(int n)
	{
		int a = n / 2;
		System.out.print(n);
		System.out.print("/2=");
		System.out.print(a);
		System.out.print("\n");
		return a;
	}
	public static int jishu(int n)
	{
		int a = 3 * n + 1;
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(a);
		System.out.print("\n");
		return a;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			if (n % 2 == 0)
			{
				n = oushu(n);
			}
			else
			{
				n = jishu(n);
			}

		}
	return 0;
	}

}

