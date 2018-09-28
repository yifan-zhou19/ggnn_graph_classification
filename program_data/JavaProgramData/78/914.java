package <missing>;

public class GlobalMembers
{
	/*
	 * weight.cpp
	 *
	 *  Created on: 2013-11-7
	 *      Author: c
	 */
	public static int Main()
	{
		int[] a = new int[4];
		int k;
		char[] b = {'z', 'q', 's', 'l'};
		int temp1;
		int temp2;
		int i;
		int j;
		for (a[0] = 10 ; a[0] <= 50 ; a[0] = a[0] + 10)
		{
			for (a[1] = 10 ; a[1] <= 50 ; a[1] = a[1] + 10)
			{
				for (a[2] = 10 ; a[2] <= 50 ; a[2] = a[2] + 10)
				{
					for (a[3] = 10 ; a[3] <= 50 ; a[3] = a[3] + 10)
					{
						if ((a[0] + a[1] == a[2] + a[3]) && (a[0] + a[3] > a[1] + a[2]) && (a[0] + a[2] < a[1]))
						{
							for (i = 0 ; i < 4 ; i++)
							{
								for (j = i + 1 ; j < 4 ; j++)
								{
									if (a[i] < a[j])
									{
										temp1 = a[i];
										temp2 = b[i];
										a[i] = a[j];
										b[i] = b[j];
										a[j] = temp1;
										b[j] = temp2;
									}
								}
							}
							for (k = 0;k < 4;k++)
							{
								System.out.print(b[k]);
								System.out.print(" ");
								System.out.print(a[k]);
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
