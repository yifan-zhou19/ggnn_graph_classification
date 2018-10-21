import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 111028_03.cpp
	 *
	 *  Created on: 2011-10-28
	 *      Author: Alfalfa
	 */
	public static int Main()
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		int i;
		int lenA;
		int lenB;
		(a) = new Scanner(System.in).nextLine();
		(b) = new Scanner(System.in).nextLine();
		lenA = a.length();
		lenB = b.length();
		for (i = 0;i < lenA;i++)
		{
			if (a.charAt(i) < 97)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32); //?????
			}
		}
		for (i = 0;i < lenB;i++)
		{
			if (b.charAt(i) < 97)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		if (strcmp(a,b) == 1)
		{
			System.out.print(">");
		}
			else if (strcmp(a,b) == -1)
			{
				System.out.print("<");
			}
			else
			{
				System.out.print("=");
			}
		return 0;

	}

}

