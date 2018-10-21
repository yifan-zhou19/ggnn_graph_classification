package <missing>;

public class GlobalMembers
{
	/*
	 * xiaoceyan4.3.cpp
	 * ??????
	 *  Created on: 2010-12-31
	 *      Author: william
	 */
	public static void transfor(String a, int ai)
	{
		for (int i = 0; i < ai ;i++)
		{
			for (int j = 0; j < ai - i - 1; j++)
			{
				if (a[j].compareTo(a[j + 1]) > 0)
				{
					char temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int ai;
		int bi;
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ai = a.length();
		bi = b.length();
		if (ai != bi)
		{
			System.out.print("NO");
		}
		else
		{
			transfor(a, ai);
			transfor(b, bi);
			for (i = 0; i < ai; i++)
			{
				if (a.charAt(i) != b.charAt(i))
				{
					break;
				}
			}
			if (i == ai)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}
}

