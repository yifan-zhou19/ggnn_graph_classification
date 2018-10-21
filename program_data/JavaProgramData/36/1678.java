package <missing>;

public class GlobalMembers
{
	/*
	 * 09.cpp
	 *
	 *  Created on: 2014-1-5
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int s1;
		int s2;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s1 = a.length();
		s2 = b.length();
		if (s1 != s2)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		else
		{
			for (i = 0;i < s1;i++)
			{
				for (j = 0;j < s1;j++)
				{
					if (b.charAt(j) == a.charAt(i))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '*');
						break;
					}
				}
			}
			for (i = 0;i < s1;i++)
			{
				if (b.charAt(i) != '*')
				{
					System.out.print("NO");
					System.out.print("\n");
					return 0;
				}
			}
			System.out.print("YES");
			System.out.print("\n");
			return 0;
		}

	}

}

