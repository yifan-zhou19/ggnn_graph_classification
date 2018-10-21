package <missing>;

public class GlobalMembers
{
	/*
	 * 36.cpp
	 * ???
	 *  Created on: 2012-9-27
	 *      Author: Salforever
	 */



	public static int Main()
	{
		int suma;
		int sumb;
		int sumc;
		int a;
		int b;
		int c;
		int i;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					if ((a != b) && (a != c) && (b != c))
					{
						suma = (b >= a) + (c == a);
						sumb = (a >= b) + (a >= c);
						sumc = (c >= b) + (b >= a);
						if ((suma + a == 3) && (sumb + b == 3) && (sumc + c == 3))
						{
							for (i = 1;i <= 3;i++)
							{
								if (a == i)
								{
									System.out.print("A");
								}
								if (b == i)
								{
									System.out.print("B");
								}
								if (c == i)
								{
									System.out.print("C");
								}
							}
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}
