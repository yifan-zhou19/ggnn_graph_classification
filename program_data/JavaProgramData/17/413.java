package <missing>;

public class GlobalMembers
{
	/*
	 * BracketMatch.cpp
	 *
	 *  Created on: 2012-11-29
	 *  Author: ??
	 *  ?????????
	 */


	public static String a = new String(new char[120]);
	public static int len = 0;

	public static void bracket(int i)
	{
		if (i < 0)
		{
			return;
		}
		if (a.charAt(i) != '(')
		{
			bracket(i - 1);
		}
		if (a.charAt(i) == '(')
		{
			for (int k = i ; k < len ; k++) //?????
			{
				if (a.charAt(k) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, 'x');
					a = tangible.StringFunctions.changeCharacter(a, k, 'x'); //??
					break;
				}
			}
			bracket(i - 1); //????
		}
	}

	public static int Main()
	{
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(a);
			System.out.print("\n");
			len = a.length();
			bracket(len - 1);
			for (int k = 0 ; k < len ; k++)
			{
				if (a.charAt(k) == '(')
				{
					System.out.print("$");
				}
				else if (a.charAt(k) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
			for (int i = 0 ; i < 120 ; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0'); //????
			}
		}
		return 0;
	}

}

