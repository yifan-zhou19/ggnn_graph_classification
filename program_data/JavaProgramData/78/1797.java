package <missing>;

public class GlobalMembers
{
	/*
	 * exercise1015.cpp
	 *
	 *  Created on: 2012-10-15
	 *      Author: wangyinzhi
	 */


	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int d;
	   int[] k = new int[5];
	   int i;
	   int j;
	   int p;
	   for (a = 1;a <= 5;++a)
	   {
		   for (b = 1;b <= 5;++b)
		   {
			   for (c = 1;c <= 5;++c)
			   {
				   for (d = 1;d <= 5;++d)
				   {
					   if ((a + b == c + d) && (a + d > c + b) && (a + c < b))
					   { //?????abcd????zqsl?????????
							   k[1] = a;
							   k[2] = b;
							   k[3] = c;
							   k[4] = d; //????
							   for (j = 1;j <= 3;j++)
							   {
								   for (i = 1;i <= 4 - j;i++)
								   {
									   if (k[i] < k[i + 1])
									   {
										   p = k[i];
										   k[i] = k[i + 1];
										   k[i + 1] = p; //???????????
									   }
								   }
							   }
							   for (i = 1;i <= 4;i++)
							   {
								if (k[i] == a)
								{
									System.out.print("z");
									System.out.print(" ");
									System.out.print(k[i] * 10);
									System.out.print("\n");
								}
								if (k[i] == b)
								{
									System.out.print("q");
									System.out.print(" ");
									System.out.print(k[i] * 10);
									System.out.print("\n");
								}
								if (k[i] == c)
								{
									System.out.print("s");
									System.out.print(" ");
									System.out.print(k[i] * 10);
									System.out.print("\n");
								}
								if (k[i] == d)
								{
									System.out.print("l");
									System.out.print(" ");
									System.out.print(k[i] * 10);
									System.out.print("\n");
								}

							   }

					   }

				   }

			   }
		   }
	   }

		return 0;
	}
}
