package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static char[] atob_str2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	//
	//  main.cpp
	//  hw
	//
	//  Created by ? ? on 12-12-16.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//

	public static String atob(int a, int b, tangible.RefObject<String> str1)
	{
		int len1 = str1.argValue.length();
		int Sum = 0;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char str2[100]={0};
		for (int i = 0; i < len1; i++)
		{ //a????????
			int s;
			if (str1.argValue.charAt(i) <= 57)
			{ //?????????
				s = str1.argValue.charAt(i) - '0';
			}
			if (str1.argValue.charAt(i) >= 65 && str1.argValue.charAt(i) <= 90)
			{
				s = str1.argValue.charAt(i) - 'A' + 10;
			}
			if (str1.argValue.charAt(i) > 90)
			{
				s = str1.argValue.charAt(i) - 'a' + 10;
			}
			Sum += s * Math.pow(a, len1 - i - 1);
		}
		for (int i = 0; Sum > 0; i++)
		{ //??????b??
			if (Sum % b < 10)
			{
				atob_str2[i] = Sum % b + '0';
			}
			else
			{
				atob_str2[i] = Sum % b - 10 + 'A';
			}
			Sum -= Sum % b;
			Sum /= b;
		}
		int len = atob_str2.length();
		atob_str2[len] = 0;
		return atob_str2;
	}

	public static void Main(String[] args)
	{
		int a;
		int b;
		char[] str1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (str1[0] == '0')
		{
			System.out.print("0");
		}
	tangible.RefObject<String> tempRef_str1 = new tangible.RefObject<String>(str1);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *str2=atob(a,b,str1);
		char str2 = atob(a, b, tempRef_str1);
		str1 = tempRef_str1.argValue;
		int len = str2.length();
		for (int i = len - 1; i >= 0; i--)
		{
			System.out.print((str2 + i));
		}
	}

}

