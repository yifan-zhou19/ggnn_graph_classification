package <missing>;

public class GlobalMembers
{
	/*
	 * delete numbers.cpp
	 *
	 *  Created on: 2012-11-5
	 *      Author: Lsj
	 */
	public static int Main()
	{
		int n; //??n?i?p?k
		int i = 0;
		int p;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = n; //???p???n
		int[] a = new int[n]; //????
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				p -= 1; //???????????
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] != k)
			{ //????????
				p -= 1;
				if (p == 0) //???0??????????????
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(a[i]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	} //??

}

