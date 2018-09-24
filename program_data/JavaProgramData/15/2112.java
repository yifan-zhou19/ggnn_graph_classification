package <missing>;

public class GlobalMembers
{
	/*
	 * 5.9.cpp
	 *
	 *  Created on: 2011-10-27
	 *      Author: sony
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] dt = new int[n];
		int i;
		int j;
		int k;
		int p;
		int q;
		int N;
		int sum = 0;
		for (j = 1;j <= n;j++)
		{ //?j???
			for (i = 0;i < n;i++)
			{
				dt[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			for (p = 0;p < n;p++)
			{
				if (dt[p] == 0)
				{ //????????
					for (k = n - 1;;k--)
					{ //???????????
						if (dt[k] == 0)
						{
							N = k;
						break;
						}
					}
					for (q = p;q <= N;q++)
					{
						if (dt[q] != 0)
						{
							sum++;
						}
					}
				}
			}

		}


		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

