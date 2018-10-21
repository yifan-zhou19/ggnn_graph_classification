package <missing>;

public class GlobalMembers
{
	/*
	 * ???????.cpp
	 *  Created on: 2012-12-11
	 *  Author: ???
	 */
	public static int Main()
	{
		int n;
		String a = new String(new char[100]);
		String p = a;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length();
		for (int i = 0; i < n; i++)
		{
			System.out.print((p.Substring(i)));
		}
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(' ');
			n = a.length();
			for (int i = 0; i < n; i++)
			{
				System.out.print((p.Substring(i)));
			}
		}
		return 0;
	}
}

