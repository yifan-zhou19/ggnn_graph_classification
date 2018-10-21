package <missing>;

public class GlobalMembers
{
	/*
	 * ????????????????????????.cpp
	 *
	 *  Created on: 2012-11-29
	 *      Author: ??
	 *      a)  ???????????????????
	b)  ???????????
	c)  ??????????
	d)  ?????????
	 */
	public static int n;
	public static int m;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void shuru()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	} //??

	public static void paixu()
	{
		int i;
		int j;
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] > a[j])
				{
					a[0] = a[i];
					a[i] = a[j];
					a[j] = a[0];
				}
			}
		}
		for (i = 1;i < m;i++)
		{
				for (j = i + 1;j <= m;j++)
				{
					if (b[i] > b[j])
					{
						b[0] = b[i];
						b[i] = b[j];
						b[j] = b[0];
					}
				}
		}
	} //??
	public static void hebin()
	{
		int i;
		for (i = n + 1;i <= n + m;i++)
		{
			a[i] = b[i - n];
		}

	} //??

	public static void shuchu()
	{
		int i;
		for (i = 1;i <= m + n - 1;i++)
		{
		System.out.print(a[i]);
		System.out.print(' ');
		}
		System.out.print(a[m + n]);
		System.out.print("\n");
	} //??
	 public static int Main()
	 {
		 shuru();
		 paixu();
		 hebin();
		 shuchu();
		 return 0;
	 }

}

