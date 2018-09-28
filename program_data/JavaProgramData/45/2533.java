package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  ????
	//
	//  Created by ?  on 12-12-16.
	//  Copyright (c) 2012? ? . All rights reserved.
	//


	public static String f(String s1, String s2)
	{
		String p = s1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int l = s1.length();
		int i;
		q = tangible.StringFunctions.strChr(s2, s1[0]);
		if (q == null)
		{
			return q;
		}
		else
		{
			for (i = 0;p < s1 + l;p++,q++,i++)
			{
				if (*p != *q)
				{
					break;
				}
			}
			if (p == s1 + l)
			{
				return q - l;
			}
			else
			{
				*(q - i) = 0;
				return f(s1, s2);
			}
		}
	}

	public static int Main()
	{
		char[] s1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] s2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		int i;
		i = f(s1, s2) - s2;
		System.out.printf("%d",i);
		return 0;

	}

}

