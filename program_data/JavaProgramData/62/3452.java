import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * extra.cpp
	 * ???????
	 *  Created on: 2012-11-21
	 *      Author: ???
	 */
	public static int Main()
	{
		int i;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		System.out.print(str.charAt(0));
		for (i = 1; i < str.length() - 1; i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
			else if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				continue;
			}
			else if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
			{
				System.out.print(' ');
			}
		}
		System.out.print(str.charAt(str.length() - 1));
		return 0;
	}

}
