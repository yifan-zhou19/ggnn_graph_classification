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
		String p = a;
		int n;
		int len;
		int tolen = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(p);
		len = p.length();
		tolen = len;
		while (n - 1 != 0)
		{
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = p.length();
			tolen += (len + 1);
			if (tolen <= 80)
			{
				System.out.print(" ");
				System.out.print(p);
			}
			else
			{
				System.out.print("\n");
				System.out.print(p);
				tolen = len;
			}
			n--;
		}
	return 0;
	}

}

