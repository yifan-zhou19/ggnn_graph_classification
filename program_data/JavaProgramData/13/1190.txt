package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 *
	 *  Created on: 2012-10-31
	 *      Author: ??
	 */
	public static int Main()
	{
		int n; //n:??s:??????i.j:????
		int s = 1;
		int j;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //?????
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[0] = a[0];
		for (i = 1; i < n; i++)
		{ //??????
			for (j = 0; j < s; j++)
			{
				if (a[i] == b[j])
				{ //?????????????
					break;
				}
			}
			if (j == s)
			{ //??????????
				b[s] = a[i];
				s++;
			}
		}
		for (int i = 0; i < s - 1; i++) //??
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.print(b[s - 1]);
		return 0;
	}

}

