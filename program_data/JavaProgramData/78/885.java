package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int j;
		int k;
		for (i = 1;i <= 5;i++)
		{
			z = i;
			for (j = 1;j <= 5;j++)
			{
				q = j;
				for (k = 1;k <= 5;k++)
				{
					s = k;
					l = z + q - s;
					if (z + l > s + q && z + s < q && z != s && z != l && l <= 5)
					{
						int[] a = {0, z, q, s, l};
						int m;
						int m2;
						int t;
						for (m = 1;m < 4;m++)
						{
							for (m2 = 1;m2 <= 4 - m;m2++)
							{
								if (a[m2] < a[m2 + 1])
								{
									t = a[m2];
									a[m2] = a[m2 + 1];
									a[m2 + 1] = t;
								}
							}
						}
						for (m = 1;m <= 4;m++)
						{
							if (a[m] == z)
							{
								System.out.print('z');
								System.out.print(" ");
								System.out.print(a[m] * 10);
								System.out.print("\n");
							}
							if (a[m] == q)
							{
								System.out.print('q');
								System.out.print(" ");
								System.out.print(a[m] * 10);
								System.out.print("\n");
							}
							if (a[m] == s)
							{
								System.out.print('s');
								System.out.print(" ");
								System.out.print(a[m] * 10);
								System.out.print("\n");
							}
							if (a[m] == l)
							{
								System.out.print('l');
								System.out.print(" ");
								System.out.print(a[m] * 10);
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
