import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * guolvkongge.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: Owner
	 */

	public static int Main()
	{
		String a = new String(new char[200]);
		int i;
		int j;
		int k;
		int x;
		int y;
		a = new Scanner(System.in).nextLine();
		x = a.length();
		for (i = 0;i < x;i++)
		{
			if (a.charAt(i) == ' ')
			{
				for (j = i + 1;j < x;j++)
				{
					if (a.charAt(j) != ' ')
					{
						y = j;
						break;
					}
				}
				int s = i;
				if (y - s >= 2)
				{
					for (k = y;k <= x;k++)
					{
						a = tangible.StringFunctions.changeCharacter(a, k - y + s + 1, a.charAt(k));
					}
				}
			}
		}
		for (i = 0;i <= x;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
		}
		int v = i;
		for (i = 0;i < v;i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}

