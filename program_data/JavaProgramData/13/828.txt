package <missing>;

public class GlobalMembers
{
	/*
	 * 87.cpp
	 *
	 *  Created on: 2011-10-19
	 *      Author: think
	 */
	public static int Main()
	{ //?????
		int n; //??????
		int p = 1;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		for (i = 0;i < n;i++)
		{ //????
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] b = new int[n]; //????????
		b[0] = a[0]; //????
		for (i = 1;i < n;i++)
		{ //????
			for (j = 0;j < i;j++)
			{ //?????????????
				if (a[j] == a[i])
				{
					break;
				}
			}
				if (j == i)
				{ //???????bn??
					b[p] = a[i];
					p++;
				}

		}

		System.out.print(b[0]);

		for (i = 1;i < p;i++)
		{ //????
			System.out.print(" ");
			System.out.print(b[i]);
		}
		return 0;
	} //?????


}

