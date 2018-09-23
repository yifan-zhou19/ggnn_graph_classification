package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : kuohaopipei.cpp
	// Author      :
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================

	public static String s = new String(new char[1000]);

	public static int findri(int x,int y)
	{
		int p;
		if (s.charAt(x) == '\0')
		{
			return -1;
		}
		if (s.charAt(x) == '(')
		{
			p = findri(x + 1, y + 1);
			if (p == -1)
			{
				s = tangible.StringFunctions.changeCharacter(s, x, '$');
				return -1;
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, x, ' ');
				return findri(p + 1, y);
			}
		}
			else if (s.charAt(x) == ')')
			{
			if (y == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, x, '?');
				return findri(x + 1, y);
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, x, ' ');
				return x;
			}

			}
		else
		{
			s = tangible.StringFunctions.changeCharacter(s, x, ' ');
			return findri(x + 1, y);
		}





	}








	public static int Main()
	{
		int len;
		int i;
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = s.length();
		for (i = 0;i < len;i++)
		{
		System.out.print(s.charAt(i));
		}
		System.out.print('\n');
		findri(0, 0);
		for (i = 0;i < len;i++)
		{
		System.out.print(s.charAt(i));
		}
		System.out.print('\n');
		}

		return 0;
	}

}

