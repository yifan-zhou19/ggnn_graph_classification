package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by Hsu Tzuyen on 12-12-24.
	//  Copyright (c) 2012? Hsu Tzuyen. All rights reserved.
	//


	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[150]);
		String c = new String(new char[150]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (tangible.StringFunctions.strStr(a,b) == null)
		{
			System.out.print(a);
			return 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = tangible.StringFunctions.strStr(a,b);
		int i = 0;
		while (c.charAt(i) != '\0')
		{
			*p++=c.charAt(i);
			i++;
		}
		System.out.print(a);
		return 0;
	}
}

