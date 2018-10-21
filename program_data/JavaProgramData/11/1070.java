package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  The number of the date
	//
	//  Created by Jas-Cassie on 13-12-15.
	//  Copyright (c) 2013? Jas-Cassie. All rights reserved.
	//

	public static int Main()
	{
		int y;
		int m;
		int d;
		int i = 0;
		int num = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 4 == 0 && (y % 100 != 0 || (y % 400 == 0)))
		{
			//cout<<"1"<<endl;
			int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
			for (i = 0 ; i < m - 1 ; i++)
			{
				num += a[i];
			}
			num += d;
		}
		else
		{
			//cout<<"2"<<endl;
			int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
			for (i = 0 ; i < m - 1 ; i++)
			{
				num += a[i];
			}
			num = num + d;
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

