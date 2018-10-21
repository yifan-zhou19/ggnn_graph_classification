package <missing>;

public class GlobalMembers
{
	/*
	 * paiduiyouxi.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: lz
	 */

	public static int Main()
	{
		String c = new String(new char[1000]);
		int[] s = new int[1000];
		int top = -1;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char a;
		char b;
		a = c.charAt(0);
		int len = c.length();
		int i;
		for (i = 0;i < len;i++)
		{
			if (c.charAt(i) != a)
			{
				b = c.charAt(i);
				break;
			}
		}
		for (i = 0;i < len;i++)
		{
			if (c.charAt(i) == a)
			{
				s[++top] = i;
			}
			else
			{
				System.out.print(s[top--]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

