package <missing>;

public class GlobalMembers
{
	/*
	 * review_7.cpp
	 *
	 *  Created on: 2010-12-27
	 *      Author: ???
	 *        ??? ????
	 */



	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{ //????????????60
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			for (j = 0;j < m;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0;j < m;j++) //???????????????
			{
				if (a[j] + 3 * j <= 60)
				{
					if (j + 1 == m || a[j + 1] + 3 * (j + 1) > 60)
					{
						if (a[j] + 3 * (j + 1) >= 60)
						{
							System.out.print(a[j]);
							System.out.print("\n");
						}
						else
						{
							System.out.print(60 - 3 * (j + 1));
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}

}

