package <missing>;

public class GlobalMembers
{
	/*
	 * qimofuxi_03.cpp
	 *  ???????
	 *  Created on: 2010-12-17
	 *      Author: william
	 */
	public static int operation(int x)
	{
		if (x % 2 == 0)
		{
			System.out.print(x);
			System.out.print("/2=");
			System.out.print(x / 2);
			System.out.print("\n");
			return x / 2;
		}
		else
		{
			System.out.print(x);
			System.out.print("*3+1=");
			System.out.print(3 * x + 1);
			System.out.print("\n");
			return 3 * x + 1;
		}
	}
	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;x != 1;)
		{
			x = operation(x);
		}
		System.out.print("End");
		return 0;
	}

}

