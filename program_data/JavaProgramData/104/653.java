package <missing>;

public class GlobalMembers
{
	/*
	 *erchashu.cpp
	 *?????????????
	 *Created on: 2011-11-11
	 *Author: ???
	 */
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != b)
		{
			if (a > b)
			{
				a = (a - a % 2) / 2; //??
			}
			else
			{
				b = (b - b % 2) / 2;
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}

