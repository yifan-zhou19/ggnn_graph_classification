package <missing>;

public class GlobalMembers
{
	/*
	 * X2.cpp
	 *
	 *  Created on: 2012-11-16
	 *      Author: 12100
	 *      ??:?????
	 */
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //???????????
		a[0] = n + k; //???
		do
		{
			for (i = 1;i < n;i++)
			{
			a[i] = ((a[i - 1] - k) / n) * (n - 1);
			if (((a[i] % n) != k) || (a[i] == k))
			{
				break;
			}
			}
			a[0] += n;
			m = a[0];
		}while (i < n); //????????????????
		m -= n;
		System.out.print(m);
	}

}

