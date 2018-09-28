package <missing>;

public class GlobalMembers
{
	/*
	 * integer.cpp
	 *
	 *  Created on: 2010-12-25
	 *      Author: ???
	 *      Function: ?????
	 */
	public static int Main()
	{
		int n; //n??????????len1??a????len2??b???
		int len1;
		int len2;
		String a = new String(new char[100]); //a??????b????
		String b = new String(new char[100]);
		char t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len1 = a.length();
			len2 = b.length();
			for (int j = 0;j < len1 - j;j++)
			{ //????a?????????a[0]????
				t = a.charAt(j);
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(len1 - j - 1));
				a = tangible.StringFunctions.changeCharacter(a, len1 - j - 1, t);
			}
			for (int j = 0;j < len2 - j;j++)
			{ //???b?????????b[0]????
				t = b.charAt(j);
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(len2 - j - 1));
				b = tangible.StringFunctions.changeCharacter(b, len2 - j - 1, t);
			}
			for (int j = 0;j < len2;j++) //??????????a?
			{
				if (a.charAt(j) >= b.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j) + '0');
				}
				else
				{
					a.charAt(j + 1)--;
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(j) + '0');
				}
			}
			if (a.charAt(len1 - 1) != '0')
			{
				System.out.print(a.charAt(len1 - 1));
			}
			for (int j = len1 - 2;j >= 0;j--)
			{
				System.out.print(a.charAt(j));
			}
			System.out.print("\n");
		}
	}

}

