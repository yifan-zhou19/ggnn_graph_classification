import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  Homework_12_10
	//  ???????
	//  Created by airjcy on 12/10/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//


	public static void Main(String[] args)
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		while (*(a.Substring(i) + 1) != '\0')
		{
			*(b.Substring(i)) = *(a.Substring(i)) + *(a.Substring(i) + 1);
			i++;
		}
		*(b.Substring(i)) = *(a.Substring(i)) + *a;
		*(b.Substring(i) + 1) = '\0';
		System.out.print(b);

	}

}
