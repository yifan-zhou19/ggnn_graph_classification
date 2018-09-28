package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ?? on 12-12-26.
	//  Copyright (c) 2012? ??. All rights reserved.
	//

	public static int Main()
	{
		String string = new String(new char[250]);
		String substring = new String(new char[250]);
		String replacestring = new String(new char[200]);
		String = ConsoleInput.readToWhiteSpace(true);
		substring = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replacestring = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int place = 0;
		int i;
		int j;
		int flag = 1;
		for (i = 0; string.charAt(i) != '\0' && flag == 1; i++)
		{
			if (String[i] != substring.charAt(0))
			{
				continue;
			}
			else
			{
				place = i;
				for (j = 0; substring.charAt(j) != '\0'; j++)
				{
					if (String[i++] != substring.charAt(j))
					{
						break;
					}
				}
				if (substring.charAt(j) != '\0')
				{
					place = 0;
				}
				else
				{
					flag = 0;
				}
			}
		}
		if (place != 0)
		{
			int l1 = substring.length();
			int l2 = replacestring.length();
			for (i = 0; string.charAt(i + place + l1) != '\0'; i++)
			{
				replacestring = tangible.StringFunctions.changeCharacter(replacestring, l2 + i, string.charAt(place + l1 + i));
			}
			replacestring = tangible.StringFunctions.changeCharacter(replacestring, l2 + i, '\0');
			String[place] = '\0';
			System.out.print(String);
			System.out.print(replacestring);
			System.out.print("\n");
		}
		else
		{
			System.out.print(String);
			System.out.print("\n");
		}
		return 0;
	}
}

