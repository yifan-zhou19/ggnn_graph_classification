import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: 10033
	 */


	public static int Main()
	{
		String str = new String(new char[150]);
		int i;
		int j;
		int nstr;
		str = new Scanner(System.in).nextLine();
		nstr = str.length();
		for (i = 0;i < nstr - 1;i++)
		{
			while (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				for (j = i + 1;j < nstr;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
				}
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}

}

