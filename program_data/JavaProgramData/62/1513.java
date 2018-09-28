import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ?????
	//
	//  Created by ???? on 13-11-28.
	//  Copyright (c) 2013? ????. All rights reserved.
	//


	public static int Main()
	{
		String sen = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		sen = new Scanner(System.in).nextLine();
		p = sen;
		for (; * p;p++)
		{
			int flag;
			if (*p != ' ')
			{
				System.out.print(p);
				flag = 0;
			}
			if (*p == ' ' && flag == 0)
			{
				System.out.print(p);
				flag++;
			}
			if (*p == ' ' && flag > 0)
			{
				continue;
			}
		}

			return 0;
	}

}
