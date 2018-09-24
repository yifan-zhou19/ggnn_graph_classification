package <missing>;

public class GlobalMembers
{
	/*
	 * ????25.cpp
	 *???????????????
	 *  Created on: 2010-10-29
	 *      Author: ???
	 */
	public static int Main() //???
	{ //????
		int k; //????
		int j;
		int i;
		int n;
		int m;
		k = 0; //??
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000]; //????
		for (i = 0;i < n;i++) //??????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++) //???????????
		{
			if (a[j] != m)
			{
				a[k] = a[j];
					   k++;
			}
		}
		System.out.print(a[0]);
				for (j = 1;j < k;j++) //???????????
				{
				System.out.print(" ");
				System.out.print(a[j]);
				}
				return 0;
	} //????


}

