package <missing>;

public class GlobalMembers
{
	/*????????
	 * 1000012901_25.cpp
	 *
	 *  Created on: 2010-10-30
	 *      Author: lenovo
	 */
	public static int Main()
	{
		int n; //???????e?????????
		int i;
		int k;
		int e = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n - e;j++)
		{
		while (a[j] == k) //???????????????????
		{
			for (i = j;i < n - 1 - e;i++)
			{
			a[i] = a[i + 1];
			}
			a[i] = 0; //????????????
			e++; //????????e?1
		}
		}
		for (i = 0;i < n - e-1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - e-1]);
		return 0;
	}

}

