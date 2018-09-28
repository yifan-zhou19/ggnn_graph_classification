import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ??
	//
	//  Created by ???? on 13-11-13.
	//  Copyright (c) 2013? ????. All rights reserved.
	//

	public static int Main()

	{
		String a1 = new String(new char[80]);
		String a2 = new String(new char[80]);
		a1 = new Scanner(System.in).nextLine();
		a2 = new Scanner(System.in).nextLine();
		for (int i = 0;i <= 80;i++)
		{
			if (65 <= a1.charAt(i) && a1.charAt(i) <= 90)
			{
				a1 = tangible.StringFunctions.changeCharacter(a1, i, a1.charAt(i) + 32);
			}
		}
		for (int i = 0;i <= 80;i++)
		{
			if (65 <= a2.charAt(i) && a2.charAt(i) <= 90)
			{
				a2 = tangible.StringFunctions.changeCharacter(a2, i, a2.charAt(i) + 32);
			}
		}

		switch (strcmp(a1,a2))
		{
			case -1:
				System.out.print('<');
				break;
			case 0:
				System.out.print('=');
				break;
			case 1:
				System.out.print('>');
				break;
		}
		return 0;
	}

}

