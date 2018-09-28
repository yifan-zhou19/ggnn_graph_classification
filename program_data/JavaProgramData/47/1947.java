package <missing>;

public class GlobalMembers
{
	/*
	 * shuzunixu.cpp
	 *
	 *  Created on: 2012-11-2
	 *      Author: ??
	 */
	public static int Main()
	{ //?????
		int n; //????
		int i;
		int j;
		int k;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		for (i = 0;i < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j <= n / 2 - 1;j++) //???????????
		{
			p = a[j]; //?????????????????
		a[j] = a[n - 1 - j];
		a[n - 1 - j] = p;
		}
		for (k = 0;k < n;k++) //????
		{
			if (k == 0)
			{
				System.out.print(a[k]);
			}
		 else
		 {
			 System.out.print(' ');
			 System.out.print(a[k]);
		 }
		}
		return 0; //???????????
	}

}

