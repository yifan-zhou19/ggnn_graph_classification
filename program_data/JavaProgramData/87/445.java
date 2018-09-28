package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  ?????
	//
	//  Created by ?  on 12-12-30.
	//  Copyright (c) 2012? ? . All rights reserved.
	//


	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int j;
		int s;
		for (i = 1;i > 0;)
		{
			i = 0;
			s = 0;
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[j] = Integer.parseInt(tempVar);
				}
				i = i + a[j];
			}
			if (i == 0)
			{
				break;
			}
			s = (a[3] - a[0] + 12) * 3600;
			if (a[4] > a[1])
			{
				s = s + (a[4] - a[1]) * 60;
			}
			else
			{
				s = s - 60 * (a[1] - a[4]);
			}
			if (a[5] > a[2])
			{
				s = s + a[5] - a[2];
			}
			else
			{
				s = s - (a[2] - a[5]);
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}
}

