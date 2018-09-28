import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 253.cpp
	 *
	 *  Created on: 2011-12-29
	 *      Author: think
	 */
	public static int Main()
	{
		final String a = "";
		a = new Scanner(System.in).nextLine();
		final String c1 = "";
		final String c2 = "";
		int i;
		int j;
		for (i = 0;a.charAt(i) != ' ';i++)
		{
			c1 = tangible.StringFunctions.changeCharacter(c1, i, a.charAt(i));
		}
		int length1 = i;
		for (i++;i < 50 && a.charAt(i) != 0;i++)
		{
			c2 = tangible.StringFunctions.changeCharacter(c2, i - length1 - 1, a.charAt(i));
		}
		int length2 = i - length1 - 1;
		if (length1 != length2)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		for (i = 0,j = 0;i < length1;i++)
		{
			for (j = 0;j < length2;j++)
			{
				if (c2.charAt(j) == c1.charAt(i))
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, j, ' ');
					break;
				}
			}
			if (j == length2)
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

