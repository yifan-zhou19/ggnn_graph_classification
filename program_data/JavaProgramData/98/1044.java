package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by mac on 12-12-12.
	//  Copyright (c) 2012? mac. All rights reserved.
	//

	public static int Main()
	{
		int n;
		int num;
		char[][] str = new char[1000][1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String p = new String(new char[1000]);
		for (int i = 0;i < n;i++)
		{
		str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		System.out.print(str);
		num = String.valueOfstr.length();
		for (p = str + 1;p < n + str;p++)
		{
			num = num + String.valueOfp.length();
			if (num >= 80)
			{
				System.out.print("\n");
				num = String.valueOfp.length();
				System.out.print(p);
			}
			else
			{
				System.out.print(" ");
				System.out.print(p);
				num = num + 1;
			}
		}
		return 0;
	}

}

