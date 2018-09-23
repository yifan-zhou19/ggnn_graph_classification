package <missing>;

public class GlobalMembers
{
	/*
	 * NEWdelatethesamenumber.cpp
	 *???????????
	 *  Created on: 2011-10-22
	 *      Author: ???
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[10000]; //????
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;(i + t) < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (j = 0;j < i;j++) //????
		 {
			 if (a[i] == a[j]) //????????
			 {
				 i--;
			   t++;
			   break;

			 }
		 }
		}
		for (i = 0;i < n - t - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - t - 1]);
		return 0;
	}


}

