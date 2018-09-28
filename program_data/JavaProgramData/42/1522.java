package <missing>;

public class GlobalMembers
{
	/*
	 * delete.cpp
	 *
	 *  Created on: 2012-11-8
	 *      Author: alias
	 */
	public static int Main()
	{
		int n; //????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		int m;
		for (int i = 0; i < n; i++) //????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k; //????????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j < n;j++)
		{
			if (a[j] == k)
			{ //?a[0]???????????k
				for (m = j; m < n; m++)
				{ //??????????????
					a[m] = a[m + 1];
				}
				n--;
				j--; //???j????
			}
		}
		for (int v = 0; v < n; v++)
		{ //????k????
			if (v == 0)
			{
				System.out.print(a[v]);
			}
			else
			{
					System.out.print(" ");
					System.out.print(a[v]);
			}
		}
		return 0;
	}

}

