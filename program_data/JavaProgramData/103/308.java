package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		String a = new String(new char[1001]);
		char temp;
		int i;
		int len;
		int num = 1;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
		{
			temp = a.charAt(0) - 32;
		}
		else
		{
			temp = a.charAt(0);
		}
		for (i = 1; i <= len; i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (temp == a.charAt(i))
			{
					num++;
			}
			else
			{
				System.out.print('(');
				System.out.print(temp);
				System.out.print(',');
				System.out.print(num);
				System.out.print(')');
				temp = a.charAt(i);
				num = 1;
			}
		}
		return 0;
	}

}

