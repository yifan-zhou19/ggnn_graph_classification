package <missing>;

public class GlobalMembers
{
	/*
	 * homework3.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: Lixurong
	 */

	public static int Main()
	{
		String a = new String(new char[1005]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				a.charAt(i) += 'A'-'a';
			}
		}
		char b = a.charAt(0);
		int t = 0;
		for (int i = 0; i <= a.length(); i++)
		{
			if (b == a.charAt(i))
			{
				t++;
			}
			else
			{
				System.out.print("(");
				System.out.print(b);
				System.out.print(",");
				System.out.print(t);
				System.out.print(")");
				t = 1;
				b = a.charAt(i);
			}
		}
		return 0;
	}

}

