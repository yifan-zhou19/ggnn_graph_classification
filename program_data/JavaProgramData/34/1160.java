package <missing>;

public class GlobalMembers
{
	/*
	 * 247.cpp
	 *
	 *  Created on: 2011-12-22
	 *      Author: think
	 */
	public static int jishu(int n)
	{
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(3 * n + 1);
		System.out.print("\n");
		return 3 * n + 1;
	}
	public static int oushu(int n)
	{
		System.out.print(n);
		System.out.print("/2=");
		System.out.print(n / 2);
		System.out.print("\n");
		return n / 2;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n != 1;)
		{
			if (n % 2 != 0)
			{
				n = jishu(n);
			}
			else
			{
				n = oushu(n);
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}

}

