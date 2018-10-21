package <missing>;

public class GlobalMembers
{
	/*
	 * 123.cpp
	 *
	 *  Created on: 2010-12-18
	 *      Author: 378073652
	 */


	public static int Main()
	{
		String a = new String(new char[30000]);
		String b = new String(new char[30000]);
		int[] c = new int[10000];
		int[] d = new int[10000];
		int[] e = new int[1005];
		int la;
		int lb;
		int i;
		int j;
		int sa = 0;
		int sb = 0;
		int max = 0;
		for (i = 0;i <= 1004;i++)
		{
			e[i] = 0;
		}
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		la = a.length();
		lb = b.length();
		c[0] = Double.parseDouble(a);
		for (i = 0;i < la;i++)
		{
			if (a.charAt(i) == ',')
			{
				sa++;
				c[sa] = Double.parseDouble(a.Substring(i) + 1);
			}
		}

		d[0] = Double.parseDouble(b);

		for (i = 0;i < lb;i++)
		{
				if (b.charAt(i) == ',')
				{
					sb++;
					d[sb] = Double.parseDouble(b.Substring(i) + 1);
				}
		}

		for (i = 0;i <= sa;i++)
		{
			for (j = c[i];j < d[i];j++)
			{
				e[j] = e[j] + 1;
			}
		}
		for (i = 0;i < 1004;i++)
		{
			if (e[i] > max)
			{
				max = e[i];
			}
		}





		System.out.print(sa + 1);
		System.out.print(" ");
		System.out.print(max);
	}

}

