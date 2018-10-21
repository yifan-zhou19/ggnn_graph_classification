package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2012-10-16
	 *      Author: ???
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int i;
		int j = 3;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //???????????
		{
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((c == 1) && (c == 2))
			{
				System.out.print(1);
			}
			a = 1;
				b = 1;
			for (j = 3;j <= c;j = j + 2) //??????????
			{
				a = a + b;
				b = b + a;

			}
			if (c % 2 == 1) //????a??b?
			{
			System.out.print(a);
			System.out.print("\n");
			}
			if (c % 2 == 0)
			{
				System.out.print(b);
				System.out.print("\n");
			}

		}
		return 0;
	}


}

