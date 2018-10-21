package <missing>;

public class GlobalMembers
{
	/*
	 * 123.cpp
	 *
	 *  Created on: 2013-11-29
	 *      Author: 13248
	 */

	/*
	 * 20131129.cpp
	 *
	 *  Created on: 2013-11-29
	 *      Author: 13248
	 */

	public static void jiaogu(int x)
	{
		if (x == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		}
		else
		{
			if (x % 2 == 1)
			{
				System.out.print(x);
				System.out.print("*3+1=");
				System.out.print(x * 3 + 1);
				System.out.print("\n");
				return jiaogu(x * 3 + 1);
			}
			else
			{
				System.out.print(x);
				System.out.print("/2=");
				System.out.print(x / 2);
				System.out.print("\n");
				return jiaogu(x / 2);
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(n);
		return 0;
	}

}

