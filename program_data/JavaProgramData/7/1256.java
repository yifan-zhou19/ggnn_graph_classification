package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ? ?? on 12-12-27.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//


	public static int Main()
	{
		int i = 0;
		String string = new String(new char[300]);
		String substring = new String(new char[300]);
		String replace = new String(new char[300]);
		String = ConsoleInput.readToWhiteSpace(true);
		substring = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replace = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = String.length();
		int l1 = substring.length();
		int l2 = replace.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = tangible.StringFunctions.strStr(String, substring);
		if (p != null)
		{
			while (i < l2)
			{
				*p = replace.charAt(i);
				i++;
				p++;
			}
		}
		System.out.print(String);
		return 0;
	}

}

