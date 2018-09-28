package <missing>;

public class GlobalMembers
{
	/*
	 *??? weight.cpp
	 *????: 2012-10-26
	 */
	public static int Main()
	{
		int z; //????
		int q;
		int s;
		int l;
		int p;
		int i;
		int j;
		char[] b = {'z', 'q', 's', 'l'}; //??????
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q)) //????
						{
							int[] a = {z, q, s, l}; //??????
							for (j = 2;j <= 4;j++) //??????
							{
									for (i = 0;i <= 4 - j;i++)
									{
										if (a[i] < a[i + 1])
										{
											p = a[i];
											a[i] = a[i + 1];
											a[i + 1] = p;
											p = b[i];
											b[i] = b[i + 1];
											b[i + 1] = p; //??????????
										}
									}
							}
							for (i = 0;i <= 3;i++) //??????
							{
								System.out.print(b[i]);
								System.out.print(" ");
								System.out.print(10 * a[i]);
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
