package <missing>;

public class GlobalMembers
{
	/*
	 * final2.cpp
	 *
	 *  Created on: 2013-1-12
	 *      Author: wangyinzhi
	 */

	public static int Main()
	{
		String a = new String(new char[1001]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = a.length();
		int number = 1;
		a = tangible.StringFunctions.changeCharacter(a, l, '2');
		for (int i = 0;i < l;i++)
		{
			if (a.charAt(i + 1) == a.charAt(i) || a.charAt(i + 1) - a.charAt(i) == 'A'-'a' || a.charAt(i) - a.charAt(i + 1) == 'A'-'a')
			{
				number++;
			}
			else
			{
				if (a.charAt(i) >= 97)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
				}
				System.out.print("(");
				System.out.print(a.charAt(i));
				System.out.print(",");
				System.out.print(number);
				System.out.print(")");
				number = 1;
			}
		}
		return 0;
	}

}

