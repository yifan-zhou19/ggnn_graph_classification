package <missing>;

public class GlobalMembers
{
	/*
	 * 222.cpp
	 *
	 *  Created on: 2012-12-24
	 *      Author: stream
	 */
	public static int Main()
	{
		int num = 1;
		int i;
		int l;
		String a = new String(new char[1001]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		if (l == 1)
		{
			if (a.charAt(l - 1) >= 97)
			{
				a = tangible.StringFunctions.changeCharacter(a, l - 1, a.charAt(l - 1) - 32);
			}
			System.out.print("(");
			System.out.print(a.charAt(l - 1));
			System.out.print(",");
			System.out.print(num);
			System.out.print(")");

		}
		else
		{
		for (i = 1;i < l;i++)
		{
			if ((a.charAt(i) == a.charAt(i - 1)) || (a.charAt(i) == a.charAt(i - 1) + 32) || (a.charAt(i) == a.charAt(i - 1) - 32))
			{
				num++;
			}
			else
			{
				if (a.charAt(i - 1) >= 97)
				{
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 32);
				}
				System.out.print("(");
				System.out.print(a.charAt(i - 1));
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
				num = 1;
			}
			if (i == l - 1)
			{
				if (a.charAt(l - 1) >= 97)
				{
					   a = tangible.StringFunctions.changeCharacter(a, l - 1, a.charAt(l - 1) - 32);
				}
				System.out.print("(");
				System.out.print(a.charAt(l - 1));
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
			}
		}
		}
		return 0;
	}

}

