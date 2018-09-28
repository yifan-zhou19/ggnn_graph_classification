package <missing>;

public class GlobalMembers
{
	/*
	 * 3.12Weight.cpp
	 *
	 *  Created on: 2012-10-30
	 *      Author: ???
	 *      ?????????????????????????????
	 */
	public static int Main()
	{
		int z; //?????????????
		int q;
		int s;
		int l;
		int s1;
		int s2;
		int s3;
		int p; //???????
		int t;
		int i;
		int j;
		   for (z = 1;z <= 5;z++)
		   {
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++) //????????????0?1?2?3?????
					{
						 s1 = (z + q == s + l);
						 s2 = (z + l > s + q);
						 s3 = (z + s < q);
						if (s1 + s2 + s3 == 3) //????????
						{
						int[] a = {z, q, s, l};
						char[] b = {'z', 'q', 's', 'l'};
						for (j = 1;j <= 3;j++) //?????????
						{
								for (i = 0;i <= 3 - j;i++) //????
								{
									if (a[i] < a[i + 1])
									{
										p = a[i]; //?a[i]?a[i+1]??
										a[i] = a[i + 1];
										a[i + 1] = p;
										t = b[i]; //?b[i]?b[i+1]????
										b[i] = b[i + 1];
										b[i + 1] = t;
									}
								}
						}
						 for (i = 0 ; i <= 3 ; i++)
						 {
								System.out.print(b[i]);
								System.out.print(" ");
								System.out.print(a[i] * 10);
								System.out.print("\n");

						 }
						}
					}
				}
			}
		   }
		return 0;
	}



}
