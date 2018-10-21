package <missing>;

public class GlobalMembers
{
	/*
	 * pl.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: wuch
	 */
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		char temp;
		int l1;
		int l2;
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l1 - 1;i++)
		{
			for (j = i + 1;j < l1;j++)
			{
				if (a.charAt(i) < a.charAt(j))
				{
					temp = a.charAt(i);
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
					a = tangible.StringFunctions.changeCharacter(a, j, temp);
				}
			}
		}
		for (i = 0;i < l2 - 1;i++)
		{
			for (j = i + 1;j < l2;j++)
			{
				if (b.charAt(i) < b.charAt(j))
				{
					temp = b.charAt(i);
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
					b = tangible.StringFunctions.changeCharacter(b, j, temp);
				}
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

