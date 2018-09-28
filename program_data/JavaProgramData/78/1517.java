package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int z;
		int q;
		int s;
		int l;
		int m;
		int[] a = new int[5];
		for (z = 1;z < 6;z++) //??
		{
			for (q = 1;q < 6;q++)
			{
				for (s = 1;s < 6;s++)
				{
					for (l = 1;l < 6;l++)
					{
						if ((z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l) && (z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							a[1] = z;
							a[2] = q;
							a[3] = s;
							a[4] = l;
							for (i = 1;i <= 3;i++)
							{
								k = a[i];
								m = i;
								for (j = i;j <= 4;j++)
								{
									if (a[j] > k)
									{
										k = a[j];
										m = j;
									}

								}
								k = a[i];
								a[i] = a[m];
								a[m] = k;
							}
							for (i = 1;i <= 4;i++)
							{
								if (a[i] == z)
								{
									System.out.print("z ");
								}
								if (a[i] == q)
								{
									System.out.print("q ");
								}
								if (a[i] == s)
								{
									System.out.print("s ");
								}
								if (a[i] == l)
								{
									System.out.print("l ");
								}
								System.out.print(a[i] * 10);
								System.out.print("\n");
							}
							return 0;
						}

					}
				}
			}
		}
		return 0;
	}

}
