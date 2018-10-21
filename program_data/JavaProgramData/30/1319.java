package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ?7???????
	//
	//  Created by ? ?? on 12-10-8.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int a;
		int b;
		int c;
		int sum = 0;
		int k;

		for (int i = 1; i <= n; i++)
		{
			//sum=0;

			a = i / 10;
			b = i % 10;
			//c=i-100*a-10*b;

			if (i % 7 != 0 && a != 7 && b != 7)
			{
				sum += i * i;
			}

			//k=k+sum;
		}
		System.out.print(sum);
		System.out.print("\n");

		return 0;


	}

}

