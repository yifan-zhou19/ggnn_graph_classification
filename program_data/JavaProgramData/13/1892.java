package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  redundant_num
	//
	//  Created by ? ?? on 13-11-9.
	//  Copyright (c) 2013? LEE. All rights reserved.
	//

	public static void Main(String[] args)
	{
		int n = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		int j = 0;
		int k = 0;
		int l = 0;
		for (j = 0;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				if (a[j] == a[k])
				{
				for (l = k;l < n - 1;l++)
				{
						a[l] = a[l + 1]; //???????????????
				}
						n--; //???????????????????
				  k--; //????????????

				}
			}
		}




		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);




	}




}

