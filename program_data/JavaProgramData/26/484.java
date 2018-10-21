import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: 10040
	 */

	public static int Main()
	{
		String str = new String(new char[225]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		 int i = 1;
		while (i < len)
		{
			if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')
			{
				for (int j = i; j < len - 1; j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
				}
				len--;
				continue;
			}
			i++;
		}
		str = str.substring(0, len);
		System.out.print(str);
		System.out.print("\n");

		return 0;
	}

}

