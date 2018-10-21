import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * p5.cpp
	 *
	 *  Created on: 2010-11-5
	 *      Author: ???
	 *      ?????????
	 */
	public static int Main()
	{
		String s1 = new String(new char[81]); //?????
		String s2 = new String(new char[81]);
		int i;
		s1 = new Scanner(System.in).nextLine(); //?????
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 81;i++) //???????
		{
			if (s1.charAt(i) < 97 && s1.charAt(i)>64)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
			}
		}
		for (i = 0;i < 81;i++)
		{
				if (s2.charAt(i) < 97 && s2.charAt(i)>64)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
				}
		}
		if (strcmp(s1,s2) > 0)
		{
			System.out.print('>');
			System.out.print("\n");
		}
		if (strcmp(s1,s2) < 0)
		{
			System.out.print('<');
			System.out.print("\n");
		}
		if (strcmp(s1,s2) == 0)
		{
			System.out.print('=');
			System.out.print("\n");
		}


		return 0;



	}

}

