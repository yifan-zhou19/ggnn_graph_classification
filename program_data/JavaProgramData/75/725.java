package <missing>;

public class GlobalMembers
{
	/*
	 * main.cpp
	 *
	 *  Created on: 2012-11-16
	 *      Author: ??
	 *      ?????
	 */


	public static int Main()
	{
		String str1 = new String(new char[5000]);
		String str2 = new String(new char[5000]);
		int[][] a = new int[1010][3];
		int k1 = 0;
		int k2 = 0;
		int l1;
		int x;
		int y;
		int s = 0;
		int max = 0;
		int i;
		int l2;
		int t;
		int j;
		int m1 = 0;
		int m2 = 2000;

		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = str1.length();
		l2 = str2.length();
		while (k1 < l1)
		{
			x = 0;
			y = 0;
			s++;
			while ((str1.charAt(k1) != ',') && (k1 < l1))
			{
				x = x * 10 + str1.charAt(k1) - 48;
				k1++;
			}
			while ((str2.charAt(k2) != ',') && (k2 < l2))
			{
				y = y * 10 + str2.charAt(k2) - 48;
				k2++;
			}
			a[s][1] = x;
			a[s][2] = y;
			if (m1 > x)
			{
				x = m1;
			}
			if (m2 < y)
			{
				y = m2;
			}
			k1++;
			k2++;
		}
		System.out.print(s);
		System.out.print(' ');
		for (i = m1;i <= m2;i++)
		{
			t = 0;

			for (j = 1;j <= s;j++)
			{
				if ((a[j][1] <= i) && (a[j][2]> i))
				{
					t++;
				}
			}
			if (t > max)
			{
				max = t;
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

