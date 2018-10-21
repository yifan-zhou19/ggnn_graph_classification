package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int w;
		int e;
		int r;
		for (q = 1;q <= 5;q++)
		{
			for (w = 1;w <= 5;w++)
			{
				for (r = 1;r <= 5;r++)
				{
					for (e = 1;e <= 5;e++)
					{
						if ((q + w == e + r) && (q + r > w + e) && (q + e < w))
						{
							for (int i = 5;i >= 1;i--)
							{
								if (q == i)
								{
									System.out.printf("z %d\n",10 * q);
								}
								if (w == i)
								{
									System.out.printf("q %d\n",10 * w);
								}
								if (e == i)
								{
									System.out.printf("s %d\n",10 * e);
								}
								if (r == i)
								{
									System.out.printf("l %d\n",10 * r);
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
