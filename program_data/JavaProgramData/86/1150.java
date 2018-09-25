package <missing>;

public class GlobalMembers
{
	/*
	 * qmfx05.cpp
	 *
	 *  Created on: 2011-1-1
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n1 = n;
		int[][] a = new int[n1][21];
		int i;
		int j;
		for (i = 0;i < n1;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][0] == 0)
			{
				System.out.print("60");
				System.out.print("\n");
				continue;
			}
			else
			{
				for (j = 1;j <= a[i][0];j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (j = 1;j <= a[i][0];j++)
				{
					if (j == a[i][0])
					{
						if ((a[i][j] + 3 * j) < 60)
						{
							System.out.print(60 - 3 * j);
							System.out.print("\n");
						}
					}
					if ((a[i][j] + 3 * j) == 60)
					{
						System.out.print(60 - 3 * j);
						System.out.print("\n");
						break;
					}
					if ((a[i][j] + 3 * j) > 60 && (a[i][j] + 3 * j <= 63))
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
						break;
					}
					if ((a[i][j] + 3 * j) > 63)
					{
						System.out.print(63 - 3 * j);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}

}

