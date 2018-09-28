package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ?????
	//
	//  Created by ? ?? on 12-11-10.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//



	public static int Main()
	{
		int w;
		int i;
		int j;
		int sum = 0;
		int d;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (i = 0; i < 12; i++)
		{
			sum = 0;
			if (i == 0)
			{
				d = 13 - (9 - w);
			}
			else
			{

				for (j = 0; j < i; j++)
				{
					sum = sum + a[j];
				}
				d = sum + 4 + w;
			}
			if (d % 7 == 4)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}


		return 0;
	}

}

