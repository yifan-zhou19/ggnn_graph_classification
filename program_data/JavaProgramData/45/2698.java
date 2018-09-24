package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  Track 81,????
	//
	//  Created by Charles.thRay.Lee on 2/1/13.
	//  Copyright (c) 2013 Peking University. All rights reserved.
	/*
	 ??	???? ???? 06
	 ??
	 ???? s ? w ??? s ??? w ??????????
	 ????
	 ??????????? s ?????? w ????????????????????????50?
	 ????
	 ????????s ? w ???????
	 ????
	 it waiter
	 ????
	 2
	*/


	public static int compare(String s, String w, int i)
	{
		int i1;
		int k = 1;
		int len;
		len = s.length();
		for (i1 = 0; i1 < len; i1++)
		{
			if (!s[i1].equals(w[i + i1]))
			{
				k = 0;
				break;
			}
		}
		if (k == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}

		len = w.length();
		for (i = 0; i < len; i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				if (compare(s, w, i) == 1)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
	}
}

