import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ???????
	//
	//  Created by ? ?? on 12-11-30.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//


	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int la = a.length();
		int i;
		int j;
		int k;
		String p;
		for (i = 0; i < la; i++)
		{
			if (a.charAt(i) == ' ')
			{
				j = 0;
				while (a.charAt(i + 1 + j) == ' ')
				{
					j++;
				}
				if (j > 0)
				{
					la = la - j;
					for (k = i + 1; k < la; k++)
					{
						a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + j));
					}
				}
			}
		}
		for (p = a; p < a.charAt(la); p++)
		{
			System.out.print(p);
		}
		return 0;
	}
}

