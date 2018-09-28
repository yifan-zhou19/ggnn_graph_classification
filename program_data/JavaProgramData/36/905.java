import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * name.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: 10308
	 */
	public static int Main()
	{
		String a1 = new String(new char[100]);
		String a2 = new String(new char[100]);
		a1 = new Scanner(System.in).nextLine();
		int l = a1.length();
		for (int i = 0;i < l;i++)
		{
			if (a1.charAt(i) == ' ')
			{
				for (int j = i + 1;j < l;j++)
				{
					a2 = tangible.StringFunctions.changeCharacter(a2, j - i - 1, a1.charAt(j));
				}
				a1 = tangible.StringFunctions.changeCharacter(a1, i, '\0');
				a2 = tangible.StringFunctions.changeCharacter(a2, l - i - 1, '\0');
				break;
			}
		}
		int k;
		if (a1.length() != a2.length())
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		for (int i = 0;i < a1.length();i++)
		{
			for (int j = 0;j < a2.length();j++)
			{
				if (a2.charAt(j) == a1.charAt(i))
				{
					for (k = j;k < a2.length() - 1;k++)
					{
						a2 = tangible.StringFunctions.changeCharacter(a2, k, a2.charAt(k + 1));
					}
					a2 = tangible.StringFunctions.changeCharacter(a2, k, '\0');
				}
			}
		}
		if (a2.length() == 0)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}

}

