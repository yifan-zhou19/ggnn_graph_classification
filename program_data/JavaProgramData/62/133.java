package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ? ? on 12-11-22.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//


	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int k = 0;
		int p;
		int t = 0;
		str1 = new Scanner(System.in).nextLine();
		int len1 = str1.length();
		for (i = 0;t < len1;i++,t++)
		{
			if (str1.charAt(t) == ' ')
			{
				for (p = t + 1;str1.charAt(p) == ' ';p++)
				{
					t++;
				}
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, i, str1.charAt(t));


		}
		for (p = 0;p < i;p++)
		{
		System.out.print(str2.charAt(p));
		}
		return 0;
	}

}

