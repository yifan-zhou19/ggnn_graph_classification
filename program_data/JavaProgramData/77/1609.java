import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ???? on 13-12-26.
	//  Copyright (c) 2013? ????. All rights reserved.
	//



	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int[] num = new int[100];
		int len = (int)a.length();
		//cout<<len;
		num[0] = 0;
		int k = 0;
		char b = a.charAt(0);
		for (int i = 1;i < len;i++)
		{
			if (a.charAt(i) == b)
			{
				num[++k] = i;
			}
			else
			{
				System.out.print(num[k]);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
				k--;
			}
		}

		return 0;
	}

}
