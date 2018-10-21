package <missing>;

public class GlobalMembers
{
	/*
	 * shulie.cpp
	 *
	 *  Created on: 2012-10-17
	 *      Author: Justin
	 */

	public static int Main()
	{
		int n;
		int m;
		int a1;
		int a2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a1 = a2 = 1;
		while (n > 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			while (m > 2)
			{ //?????????M??m??2???1
				a2 = a2 + a1;
				a1 = a2 - a1;
				m = m - 1;
			}
			System.out.print(a2);
			System.out.print("\n");
			n = n - 1;
			a1 = 1; //?????
			a2 = 1;
		}
		return 0;
	}
}

