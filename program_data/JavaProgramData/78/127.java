package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[4]; //a[]????
		char[] b = {'z', 'q', 's', 'l'};
		int m = 0; //m????????
		int i;
		int j;
		int ti;
		char tc;
		for (z = 1; z <= 5; z++)
		{
				for (q = 1; q <= 5; q++)
				{
				if (q != z)
				{
					for (s = 1; s <= 5; s++)
					{
					if (s != q)
					{
						for (l = 1; l <= 5; l++)
						{
						if (l != s)
						{
							if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
							{
									a[0] = z;
									a[1] = q;
									a[2] = s;
									a[3] = l;
									for (i = 0; i < 3; i++)
									{
										for (j = 0; j < 3 - i; j++)
										{
											if (a[j] < a[j + 1])
											{
												ti = a[j];
												a[j] = a[j + 1];
												a[j + 1] = ti;
												tc = b[j];
												b[j] = b[j + 1];
												b[j + 1] = tc;
											}
										}
									}
									m++;
									break;
							}
						}
						}
						if (m != 0)
						{
							break;
						}
					}
					}
					if (m != 0)
					{
						break;
					}
				}
				}
				if (m != 0)
				{
					break;
				}
		}
			for (i = 0; i < 4; i++)
			{
				System.out.print(b[i]);
				System.out.print(" ");
				System.out.print(10 * a[i]);
				System.out.print("\n");
			}
			return 0;
	}







}
