package <missing>;

public class GlobalMembers
{
	/*
	 * 02.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int k = 0;
		int j;
		int number = 0;
		int len = a.length();
		int i = 0;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i < len;i = i + k)
		{
			for (j = i;j < len;j++)
			{
				if (a.charAt(j) == a.charAt(j + 1))
				{
					number++;
				}
				else
				{
					break;
				}
			}
			number++;
			System.out.print("(");
			System.out.print(a.charAt(i));
			System.out.print(",");
			System.out.print(number);
			System.out.print(")");
			k = number;
			number = 0;
		}
	}
}

