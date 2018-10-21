package <missing>;

public class GlobalMembers
{
	/*
	 *  ????????.cpp
	 *
	 *  Created on: 2010-10-29
	 *      Author: hyd
	 */
	public static int Main()
	{
		int n;
		int i;
		int t;
		int k;
		int j;
		do
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} while (n > 100000 || n <= 0);
		final int m = n; //??
		int[] a = new int[m];
		for (i = 0;i <= m - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		do
		{
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} while (t > 100000 || t < -100000);
		k = 0; //k???????????
		for (i = 0;i <= m - 1;i++)
		{
			if (a[i] == t) //???????????????????i???1
			{
			  k++;
		   for (j = i;j <= m - 1;j++)
		   {
		   a[j] = a[j + 1];
		   }
		  i--;
			}
		}

		 for (i = 0;i <= m - k - 2;i++) //??
		 {
		  System.out.print(a[i]);
		  System.out.print(' ');
		 }
		  System.out.print(a[m - k - 1]);

	return 0;
	}

}

