package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: Administrator
	 */
	public static String a = new String(new char[50]);
	public static void print(int x, int y)
	{
		if (x > y)
		{
			return;
		}
		int i;
		for (i = x;i <= y;i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
	}

	public static int Main()
	{

		int i;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		k = 0;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
			{
				continue;
			}
			print(k, i - 1);
			k = i + 1;
		}
		print(k, i - 1);
		return 0;
	}
}
