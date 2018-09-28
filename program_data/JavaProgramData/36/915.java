package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: wangwei
	 */
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int l1;
		int l2;
		l1 = str1.length();
		l2 = str2.length();
		if (l1 != l2)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			char t;
			char q;
			for (i = 0;i < l1 - 1;i++)
			{
				for (j = 0;j < l1 - 1 - i;j++)
				{
					if (str1.charAt(j + 1) > str1.charAt(j))
					{
						t = str1.charAt(j + 1);
						str1 = tangible.StringFunctions.changeCharacter(str1, j + 1, str1.charAt(j));
						str1 = tangible.StringFunctions.changeCharacter(str1, j, t);
					}
				}
			}
			for (i = 0;i < l2 - 1;i++)
			{
				for (j = 0;j < l2 - 1 - i;j++)
				{
					if (str2.charAt(j + 1) > str2.charAt(j))
					{
						q = str2.charAt(j + 1);
						str2 = tangible.StringFunctions.changeCharacter(str2, j + 1, str2.charAt(j));
						str2 = tangible.StringFunctions.changeCharacter(str2, j, q);
					}
				}
			}
			if (strcmp(str1,str2) == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

