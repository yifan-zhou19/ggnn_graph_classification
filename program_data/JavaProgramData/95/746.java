import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012889_30.1.cpp
	 *
	 *  Created on: 2010-11-10
	 *      Author: ???
	 *        ??:??????????
	 */



	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[80]); //???????
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine(); //???????
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++) //????????????
		{
			if (a.charAt(i) <= 90 && a.charAt(i) >= 65)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) <= 90 && b.charAt(i) >= 65)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		j = strcmp(a,b); //?????????
		switch (j)
		{ //?switch????
		case 1:
			System.out.print(">");
			System.out.print("\n");
			break;
		case 0:
			System.out.print("=");
			System.out.print("\n");
			break;
		case -1:
			System.out.print("<");
			System.out.print("\n");
			break;
		}
		return 0;
	}
}

