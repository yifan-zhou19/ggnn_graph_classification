package <missing>;

public class GlobalMembers
{
	/*
	 * y2.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		String a = new String(new char[401]);
		int n;
		int len;
		int tolen = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(a);
		len = a.length();
		tolen = len;
		while (n - 1 != 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = a.length();
			tolen += (len + 1);
			if (tolen <= 80)
			{
				System.out.print(" ");
				System.out.print(a);
			}
			else
			{
				System.out.print("\n");
				System.out.print(a);
				tolen = len;
			}
			n--;
		}
	return 0;
	}

}

