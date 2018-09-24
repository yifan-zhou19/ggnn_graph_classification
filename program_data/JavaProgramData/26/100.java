import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * GUOLV.cpp
	 *
	 *  Created on: 2010-11-19
	 *      Author: 10211
	 */

	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int la;
		la = a.length();
		for (int i = 0;i < la;i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) == ' ')
				{
					for (int j = i;j < la;j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					}
					la--;
					i--;
				}
			}

		}
		for (int i = 0;i < la;i++)
		{
		System.out.print(a.charAt(i));
		}
		return 0;
	}

}

