package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012900.cpp
	 *
	 *  Created on: 2010-12-23
	 *      Author: Princeyou
	 */
	public static int Main()
	{
		String a = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int l;
		int k;
		int m;
		int n;
		int c;
		l = a.length();
		for (k = 1;k <= l / 2;k++)
		{
		for (i = 0;i < l;i++)
		{
			m = i;
			n = i + 1;
			c = 0;
			while (a.charAt(m) == a.charAt(n))
			{
				c++;
				if (c == k)
				{
					for (j = m;j <= n;j++)
					{
					System.out.print(a.charAt(j));
					}
					System.out.print("\n");
					break;
				}
					m--;
					n++;
			}
		}
		}
			return 0;
	}


}

