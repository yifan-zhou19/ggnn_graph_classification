package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 15.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		char a;
		char b;
		char c;
		char a2;
		char b2;
		char c2;
		for (char a1 = 1;a1 <= 3;a1 = a1 + 1)
		{
			for (char b1 = 1;b1 <= 3;b1 = b1 + 1)
			{
				for (char c1 = 1;c1 <= 3;c1 = c1 + 1)
				{
					int x = (a1 != b1) + (a1 != c1) + (b1 != c1);
					if (x == 3)
					{
						a = a1;
						b = b1;
						c = c1;
						a2 = (b > a) + (c == a);
						b2 = (a > b) + (a > c);
						c2 = (c > b) + (b > a);
						int a3 = (a > b) - (a2 > b2);
						int b3 = (a > c) - (a2 > c2);
						int c3 = (b > c) - (b2 > c2);
						int d = (a3 == 0) + (b3 == 0) + (c3 == 0); //?????????????
						if (d == 0)
						{
							if (a == 1) //?9?if????????????????????????
							{
								System.out.print("A");
							}
							if (b == 1)
							{
								System.out.print("B");
							}
							if (c == 1)
							{
								System.out.print("c");
							}
							if (a == 2)
							{
								System.out.print("A");
							}
							if (b == 2)
							{
								System.out.print("B");
							}
							if (c == 2)
							{
								System.out.print("C");
							}
							if (a == 3)
							{
								System.out.print("A");
							}
							if (b == 3)
							{
								System.out.print("B");
							}
							if (c == 3)
							{
								System.out.print("C");
							}
						}

					}
				}
			}
		}

		return 0;
	}

}
