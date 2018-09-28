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
		int m;
		int n;
		int p;
		for (i = 1;i <= 5;i++) //??????
		{
			z = i;
			for (j = 1;j <= 5;j++)
			{
				if (j == i)
				{
					continue; //???????????
				}
				else
				{
					q = j;
				}
				for (m = 1;m <= 5;m++)
				{
					if (m == i || m == j)
					{
						continue;
					}
					else
					{
						s = m;
					}
					for (n = 1;n <= 5;n++)
					{
						if (n == i || n == j || n == m)
						{
							continue;
						}
						else
						{
							l = n;
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							for (p = 5;p >= 1;p--) //??????
							{
								if (z == p)
								{
									System.out.print('z');
									System.out.print(' ');
									System.out.print(10 * z);
									System.out.print("\n");
								}
								if (q == p)
								{
									System.out.print('q');
									System.out.print(' ');
									System.out.print(10 * q);
									System.out.print("\n");
								}
								if (s == p)
								{
									System.out.print('s');
									System.out.print(' ');
									System.out.print(10 * s);
									System.out.print("\n");
								}
								if (l == p)
								{
									System.out.print('l');
									System.out.print(' ');
									System.out.print(10 * l);
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
