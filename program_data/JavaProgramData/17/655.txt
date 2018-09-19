package <missing>;

public class GlobalMembers
{
	/*
	 * kuohao.cpp
	 *?? - 3704:??????
	 *  Created on: 2012-12-6
	 *      Author: ???
	 */
	public static int i;
	public static int j;
	public static int k;
	public static int lena;
	public static String a = new String(new char[101]);
	public static int Main()
	{
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(a);
			System.out.print("\n");
			lena = a.length();
			for (i = 0;i < lena;i++)
			{
				if (a.charAt(i) == ')')
				{
					for (j = i;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, '*');
							a = tangible.StringFunctions.changeCharacter(a, j, '*');
							break;
						}
					}

				}
			}
			for (i = 0;i < lena;i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
				else
				{
					if (a.charAt(i) == ')')
					{
							a = tangible.StringFunctions.changeCharacter(a, i, '?');
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					}
				}
			}
			System.out.print(a);
			System.out.print("\n");
		}
			return 0;
	}
}

