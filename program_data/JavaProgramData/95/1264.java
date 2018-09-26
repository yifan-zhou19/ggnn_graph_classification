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


	public static void Main(String[] args)
	{
		int i;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;str1.charAt(i) != 0;i++)
		{
			if (str1.charAt(i) < 'a' && str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
			str1.charAt(i) += 32;
			}
		}
		for (i = 0;str2.charAt(i) != 0;i++)
		{
			if (str2.charAt(i) < 'a' && str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
			{
			str2.charAt(i) += 32;
			}
		}
		switch (strcmp(str1, str2))
		{
			case -1:
				System.out.print("<");
				break;
			case 0:
				System.out.print("=");
				break;
			case 1:
				System.out.print(">");
				break;


		}
	}

}
