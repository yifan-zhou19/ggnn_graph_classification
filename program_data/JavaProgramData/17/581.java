package <missing>;

public class GlobalMembers
{
	/*
	 * BracketCaptureIII.cpp
	 *
	 *  Created on: 2012-11-28
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int Main()
	{
		String str = new String(new char[105]);
		int flag = 0;
		int[] puma = new int[105];
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			flag = 0;
			System.out.print(str);
			System.out.print("\n");
			for (int i = 0; i <= str.length() - 1; i++)
			{
				if (str.charAt(i) == '(')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '$');
					flag++;
					puma[flag] = i;
				}
				else if (str.charAt(i) == ')')
				{
					if (flag > 0)
					{
						str = tangible.StringFunctions.changeCharacter(str, puma[flag], ' ');
						str = tangible.StringFunctions.changeCharacter(str, i, ' ');
						flag--;
					}
					else
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '?');
					}
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}

}

