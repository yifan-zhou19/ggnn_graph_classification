package <missing>;

public class GlobalMembers
{
	/*
	 * ktpm.cpp
	 *
	 *  Created on: 2011-11-15
	 *      Author: FXD
	 */
	public static int Main() //?????
	{
		int a; //a~e????A~E???
		int b;
		int c;
		int d;
		int e;
		int[] x = new int[6];
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 1;c <= 5;c++)
				{
					if (a == b || b == c || a == c)
					{
						continue;
					}
					for (d = 1;d <= 5;d++)
					{
						if (a == b || a == c || a == d || b == c || b == d || c == d)
						{
							continue;
						}
						for (e = 1;e <= 5;e++)
						{
							if (a == b || a == c || a == d || b == c || b == d || c == d || a == e || b == e || c == e || d == e || e == 2 || e == 3)
							{
								continue; //for????????????e?2?3???????
							}
							x[a] = (e == 1);
							x[b] = (b == 2);
							x[c] = (a == 5);
							x[d] = (c != 1);
							x[e] = (d == 1);
							if ((x[1] + x[2] == 2) && (x[3] + x[4] + x[5] == 0)) //?????????????????
							{
								System.out.print(a);
								System.out.print(' ');
								System.out.print(b);
								System.out.print(' ');
								System.out.print(c);
								System.out.print(' ');
								System.out.print(d);
								System.out.print(' ');
								System.out.print(e);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0; //???????????????????
	}

}
