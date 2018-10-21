package <missing>;

public class GlobalMembers
{
	/*
	 * kuohaopipei.cpp
	 *
	 *  Created on: 2012-12-5
	 *      Author: Lenovo
	 */
	public static int Main()
	{
		int i;
		int j;
		int l = 0;
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			l = 0;
			for (i = 0; i < a.length(); i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}
			for (i = 0; i < a.length(); i++)
			{
				if (a.charAt(i) == ')' && l == 0)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
					continue;
				}
				if (a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
					l++;
				}
				if (a.charAt(i) == ')' && l > 0)
				{
					for (j = i - 1; j >= 0; j--)
					{
						if (b.charAt(j) == '$')
						{
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							l--;
							break;
						}
					}
					continue;
				}
			}
			System.out.print(a);
			System.out.print("\n");
			for (i = 0; i < a.length(); i++)
			{
				System.out.print(b.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;

	}

}

