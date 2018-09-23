package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  ???? ? ??????????
	//
	//  Created by zhaoze on 13-11-5.
	//  Copyright (c) 2013? zhaoze. All rights reserved.
	//


	public static void next(int[] c, int x)
	{
		int i;
		int j;
		c[0]++;
		for (i = 1; c[0] * c[1] * c[2] * c[3] * c[4] * c[5] * c[6] * c[7] * c[8] * c[9] * c[10] * c[11] * c[12] * c[13] * c[14] > x; i++)
		{
			c[i]++;
			for (j = 0; j < i; c[j++] = c[i])
			{
				;
			}
			if (c[14] == 2)
			{
				break;
			}
		}
	}


	public static int reslove(int x)
	{
		int[] c = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int p = 0;
		while (c[0] * c[1] * c[2] * c[3] * c[4] * c[5] * c[6] * c[7] * c[8] * c[9] * c[10] * c[11] * c[12] * c[13] * c[14] <= x)
		{
			if (c[0] * c[1] * c[2] * c[3] * c[4] * c[5] * c[6] * c[7] * c[8] * c[9] * c[10] * c[11] * c[12] * c[13] * c[14] == x)
			{
				p++;
			}
			next(c, x);
		}
		return p;
	}


	public static void Main()
	{
		int i = 0;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i++<n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",reslove(a));
		}


		/*
		*int c[15]={2,2,2,2,1,1,1,1,1,1,1,1,1,1,1};
		*int x=20;
		*{next(c, x);
		*printf("%d %d %d %d %d %d %d %d %d %d %d %d %d %d %d \n",
		*      c[0],c[1],c[2],c[3],c[4],c[5],c[6],c[7],c[8],c[9],c[10],c[11],c[12],c[13],c[14]);}
		*/
	}
}

