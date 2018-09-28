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
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			String a = new String(new char[40]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (a.charAt(a.length() - 2) == 'e' && a.charAt(a.length() - 1) == 'r')
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 2, '\0');
			}
			else if (a.charAt(a.length() - 2) == 'l' && a.charAt(a.length() - 1) == 'y')
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 2, '\0');
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 3, '\0');
			}
			System.out.print(a);
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}
	}














}

