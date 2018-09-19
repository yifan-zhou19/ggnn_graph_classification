package <missing>;

public class GlobalMembers
{
	/*
	 * 1000010400_27.cpp
	 *
	 *  Created on: 2010-10-29
	 *      Author: ??
	 *      Function:????????
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20000];
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
				j = i + 1;
				while (j < n)
				{
				if (a[i] == a[j]) //??a[i]??????????a[i]
				{
					n--;
					for (k = j;k < n;k++)
					{
					a[k] = a[k + 1]; //?????
					}
				}
				else
				{
					j++;
				}
				}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;
	}

}

