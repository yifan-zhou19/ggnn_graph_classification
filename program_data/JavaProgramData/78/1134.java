package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int i;
		int t;
		int j;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if (z != q && z != s && z != l && q != s && q != l && s != l && z + q == s + l && z + l > s + q && z + s < q)
						{
							a[0] = z;
							a[1] = q;
							a[2] = s;
							a[3] = l;
							for (j = 2;j >= 0;j = j - 1)
							{
							for (i = 0;i <= j;i++)
							{
								if (a[i] < a[i + 1])
								{
									t = a[i];
									a[i] = a[i + 1];
									a[i + 1] = t;
								}
							}
							}
							for (i = 0;i <= 3;i++)
							{
							if (a[i] == z)
							{
								System.out.print("z ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (a[i] == q)
							{
								System.out.print("q ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (a[i] == s)
							{
								System.out.print("s ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (a[i] == l)
							{
								System.out.print("l ");
								System.out.print(l);
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
