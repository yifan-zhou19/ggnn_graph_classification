package <missing>;

public class GlobalMembers
{
	/*
	 * 01.cpp
	 *?? - ??(13-9) ???????? 
	 *  Created on: 2012-11-11
	 *      Author:???
	 */
	public static int Main()
	{
		int N; //????
		int i;
		int j;
		int k;
		int m = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[] a = new int[n];
		for (i = 0;i < n;i++) //?????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - m;i++) //????????
		{
			for (j = i;j <= n - m;j++) //???????????????????
			{
				if (a[i] == a[j + 1]) //????????
				{
					for (k = j + 1;k < n - m;k++) //??????????????????
					{
						a[k] = a[k + 1];
					}
						m++;
						j--;
				}
			}
		}
		System.out.print(a[0]);
			for (i = 1; i < n - m; i++)
			{

				System.out.print(" ");
				System.out.print(a[i]);
			}
			return 0;
	}

}

