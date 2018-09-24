import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * guolv.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: qaj
	 */
	public static int Main()
	{
		String ch = new String(new char[100]);
		ch = new Scanner(System.in).nextLine();
		int l = ch.length();
		for (int i = 0;i < l;i++)
		{
			if ((ch.charAt(i) == ' ') && (ch.charAt(i + 1) == ' '))
			{
				for (int j = i;j < l;j++)
				{
					ch = tangible.StringFunctions.changeCharacter(ch, j, ch.charAt(j + 1));
				}
				i--;
			}
		}
		System.out.print(ch);
		return 0;
	}
}

