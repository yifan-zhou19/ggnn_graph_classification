import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ???????.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: wangwei
	 */
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int l;
		int p = 0;
		int q = 0;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ')
			{
				p = 0;
				for (j = i;i <= l;j++)
				{
					if (a.charAt(j) != ' ')
					{
						break;
					}
					p++;
				}
				for (j = i + 1;j <= l;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + p - 1));
					q++;
				}
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, l - q, '\0');
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}

