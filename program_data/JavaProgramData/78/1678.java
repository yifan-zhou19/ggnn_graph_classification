package <missing>;

public class GlobalMembers
{
	/*
	 * 113.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */
	public static int Main()
	{
	int z;
	int q;
	int s;
	int l;
	int i;
	int j;
	int t;
	int[] a = new int[5]; //????
	for (z = 10;z <= 50;z = z + 10)
	{
		for (q = 10;q <= 50;q = q + 10)
		{
			for (s = 10;s <= 50;s = s + 10)
			{
				for (l = 10;l <= 50;l = l + 10)
				{
					if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q))
					{ //????
						a[0] = z;
						a[1] = q;
						a[2] = s;
						a[3] = l;
						String n = new String(new char[100]); //??????
						n = tangible.StringFunctions.changeCharacter(n, a[0], 'z');
						n = tangible.StringFunctions.changeCharacter(n, a[1], 'q');
						n = tangible.StringFunctions.changeCharacter(n, a[2], 's');
						n = tangible.StringFunctions.changeCharacter(n, a[3], 'l'); //???????
						for (i = 0;i < 4;i++)
						{
							for (j = 1;j < 4 - i;j++)
							{ //??
								if (a[j] > a[j - 1])
								{
									t = a[j];
									a[j] = a[j - 1];
									a[j - 1] = t;
								}
							}
						}
					System.out.print(n.charAt(a[0]));
					System.out.print(" ");
					System.out.print(a[0]);
					System.out.print("\n");
					System.out.print(n.charAt(a[1]));
					System.out.print(" ");
					System.out.print(a[1]);
					System.out.print("\n");
					System.out.print(n.charAt(a[2]));
					System.out.print(" ");
					System.out.print(a[2]);
					System.out.print("\n");
					System.out.print(n.charAt(a[3]));
					System.out.print(" ");
					System.out.print(a[3]);
					System.out.print("\n");
					}
				}
			}
		}
	}
	return 0;
	}

}

