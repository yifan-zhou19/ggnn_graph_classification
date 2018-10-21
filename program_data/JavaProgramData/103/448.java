package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		String a = new String(new char[1010]);
		char b;
		char c;
		int i;
		int j;
		int k;
		int n = 0;
		int length;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = a.length();
		for (i = 0;i < length;i++)
		{
			b = a.charAt(i);
			while (a.charAt(i) == b || (a.charAt(i) - ('a'-'A')) == b || (a.charAt(i) + ('a'-'A')) == b)
			{
				n = n + 1;
				i++;
			}
			if (a.charAt(i - 1) >= 'a')
			{
				b = a.charAt(i - 1) - ('a'-'A');
				System.out.print("(");
				System.out.print(b);
				System.out.print(",");
				System.out.print(n);
				System.out.print(")");
			}
			if (a.charAt(i - 1) < 'a')
			{
				System.out.print("(");
				System.out.print(a.charAt(i - 1));
				System.out.print(",");
				System.out.print(n);
				System.out.print(")");
			}
			i = i - 1;
			n = 0;
		}
		return 0;
	}

}

