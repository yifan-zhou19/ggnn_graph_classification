package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ???
	//
	//  Created by ???? on 13-11-3.
	//  Copyright (c) 2013? ????. All rights reserved.
	//

	public static int Main()
	{
		int a;
		int b;
		int c;
		int ca = 0;
		int cb = 0;
		int cc = 0;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				else
				{
					c = 6 - a - b;
					ca = (b > a) + (a == c);
					cb = (a > b) + (a > c);
					cc = (c > b) + (b > a);
					//cout<<a<<b<<c<<endl;
					//cout<<ca+a<<cb+b<<cc+c<<endl;

					if (ca + a == cb + b && cb + b == cc + c)
					{
						for (int i = 1;i <= 3;i++)
						{
							if (a == i)
							{
								System.out.print('A');
							}
							else if (b == i)
							{
								System.out.print('B');
							}
							else if (c == i)
							{
								System.out.print('C');
							}

						}

					}

				}
			}
		}
		return 0;
	}

}
