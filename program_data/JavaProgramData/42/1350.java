package <missing>;

public class GlobalMembers
{
	/*
	 * ArrayDelete.cpp
	 *
	 *  Created on: 2012-10-30
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[(int) n]; //???n???
		for (int i = 0; i < n; i++)
		{ //???????
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			if (a[i] == k)
			{ //??????????????
				p++; //???+1
				for (int j = i; j < n; j++)
				{ //??
					a[j] = a[j + 1];
				}
				i -= 1; //?i???????
			}
		}
		System.out.print(a[0]);
		for (int i = 1; i < n - p; i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
	}

}

