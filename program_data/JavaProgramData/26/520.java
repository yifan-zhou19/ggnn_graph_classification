import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qmcy0501.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int j;
		int m;
		while (true)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			else if (a.charAt(i) != ' ')
			{
				i++;
				continue;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ' && a.charAt(i - 1) != '\0')
			{
				i++;
				continue;
			}
			else
			{
				for (j = 1;j < a.length();j++)
				{
					if (a.charAt(i + j) != ' ')
					{
						break;
					}
				}
				for (m = i + 1;m < a.length() - j + 2;m++)
				{
					a = tangible.StringFunctions.changeCharacter(a, m, a.charAt(m + j - 1));
				}
				i++;
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}

