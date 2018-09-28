import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012786_30_1.cpp
	 *
	 *  Created on: 2010-11-8
	 *      Author: ??
	 */
	public static int Main()
	{
		String a = new String(new char[81]); //???????
		String b = new String(new char[81]);
		a = new Scanner(System.in).nextLine(); //?????
		int i;
		for (i = 0;i < 81;i++)
		{
			if ((a.charAt(i) <= 122) && (a.charAt(i) >= 97))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			else
			{
				continue;
			}
		} //????????
		b = new Scanner(System.in).nextLine(); //?????
		for (i = 0;i < 81;i++)
		{
			if ((b.charAt(i) <= 122) && (b.charAt(i) >= 97))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
			else
			{
				continue;
			}
		} //????????
		i = 0;
		for (i = 0;i < 81;i++)
		{
			if ((a.charAt(i) == '\0') || (b.charAt(i) == '\0'))
			{
				if (a.charAt(i) == b.charAt(i))
				{
					System.out.print("=");
					break;
				}
				if ((a.charAt(i) == '\0') && (b.charAt(i) != '\0'))
				{
					System.out.print("<");
					break;
				}
				if ((b.charAt(i) == '\0') && (a.charAt(i) != '\0'))
				{
					System.out.print(">");
					break;
				}
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
			else if (a.charAt(i) == b.charAt(i))
			{
				continue;
			}
		} //??????????
		if (i == 81)
		{
			System.out.print("=");
		} //??????=
		return 0;
	}

}

