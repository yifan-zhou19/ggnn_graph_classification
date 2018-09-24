package <missing>;

public class GlobalMembers
{
	/*
	 * 111.cpp
	 *
	 *  Created on: 2010-11-13
	 *      Author: dell
	 *      ????7???????
	 */


	public static int Main()
	{
		int i;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int n;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < n + 1;i++)
		{
			a[i] = i;
			b[i] = i * i;
		}
		for (i = 1;i < n + 1;i++)
		{
			if (a[i] % 7 == 0 || a[i] == 17 || a[i] == 27 || a[i] == 37 || a[i] == 47 || a[i] == 57 || a[i] == 67 || a[i] == 87 || a[i] == 97 || (a[i] - 70 <= 9 && a[i] - 70 >= 0))
			{
				continue;
			}
			else
			{
				m = m + b[i];
			}
		}
		System.out.print(m);
		System.out.print("\n");
			return 0;
	}
}

