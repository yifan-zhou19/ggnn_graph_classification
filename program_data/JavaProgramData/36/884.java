package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: ???
	 */
	public static int Main()
	{
		int n;
		int lena;
		int lenb;
		int i;
		int j;
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lena = a.length();
		lenb = b.length();
		n = 0;
		if (lena == lenb)
		{
			for (i = 0;i < lena;i++)
			{
				for (j = 0;j < lena;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						n = n + 1;
						b = tangible.StringFunctions.changeCharacter(b, j, '\0');
						break;
					}
				}
			}
			if (n == lena)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}
}

