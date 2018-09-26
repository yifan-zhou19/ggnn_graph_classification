import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * a003.cpp
	 *
	 *  Created on: 2011-10-29
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int i;
		String a1 = new String(new char[80]);
		String b1 = new String(new char[80]);
		a1 = new Scanner(System.in).nextLine();
		b1 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (25 >= a1.charAt(i) - 65 && a1.charAt(i) - 65 >= 0)
			{
				a1 = tangible.StringFunctions.changeCharacter(a1, i, a1.charAt(i) + 32);
			}
			if (25 >= b1.charAt(i) - 65 && b1.charAt(i) - 65 >= 0)
			{
				b1 = tangible.StringFunctions.changeCharacter(b1, i, b1.charAt(i) + 32);
			}
		} //?????????????

		if (strcmp(a1,b1) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(a1,b1) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(a1,b1) == 0)
		{
			System.out.print("=");
		}
		return 0;
	}
}

