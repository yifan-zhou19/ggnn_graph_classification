package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: ???
	 */

	public static int Main()
	{
		String a = new String(new char[1000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 0;
		int j;
		int len = a.length();
		while (i < len)
		{
			if (a.charAt(i) >= 'a')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			j = i;
			while (true)
			{
				if (a.charAt(i + 1) >= 'a')
				{
					a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i + 1) - 32);
				}
				if (a.charAt(i + 1) == a.charAt(j))
				{
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.print("(");
			System.out.print(a.charAt(j));
			System.out.print(",");
			System.out.print(i - j + 1);
			System.out.print(")");
			i++;
		}
		return 0;
	}

}

