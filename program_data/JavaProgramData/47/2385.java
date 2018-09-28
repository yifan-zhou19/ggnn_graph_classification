package <missing>;

public class GlobalMembers
{
	/*
	 * affairs.cpp
	 *
	 *  Created on: 2012-11-1
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int[] a = new int[100]; //i,j,k??????temp?????
		int i;
		int j;
		int k;
		int n;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1, j = n; i < j; i++, j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp; //??a[i]?a[j]
		}
		System.out.print(a[1]);
		for (k = 2; k <= n; k++)
		{
			System.out.print(" ");
			System.out.print(a[k]);
		}
		return 0;
	}

}

