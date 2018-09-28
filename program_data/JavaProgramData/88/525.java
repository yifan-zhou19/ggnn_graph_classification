import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  Homework
	//
	//  Created by ??? on 13-12-4.
	//  Copyright (c) 2013? ???. All rights reserved.
	//


	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		String p = a;
		for (int i = 0;i < 31;i++)
		{
			if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
			{
				System.out.print((p.Substring(i)));
			}
			else
			{
				if (*(p.Substring(i) + 1) >= '0' && *(p.Substring(i) + 1) <= '9')
				{
				   System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
