package <missing>;

public class GlobalMembers
{
	/*
	 * 123.cpp
	 *
	 *  Created on: 2010-12-18
	 *      Author: 378073652
	 */


	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int a;
		int s = 0;
		int num = 60;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= m;j++)
			{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a + s <= 57)
				{
					s = s + 3;
					num = num - 3;
				}
				if (a + s == 58 || a + s == 59 || a + s == 60)
				{
					num = a;
				}


			}
			System.out.print(num);
			System.out.print("\n");
			num = 60;
			s = 0;
		}
	}

}

