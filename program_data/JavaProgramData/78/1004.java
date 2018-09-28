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
		for (z = 1;z <= 5;z++)
		{
			for (q = 1; (q <= 5) ;q++)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 1; (s <= 5) ;s++)
				{
					if ((s == z) || (s == q))
					{
						continue;
					}
					for (l = 1; (l <= 5) ;l++)
					{
						if ((l == z) || (l == q) || (l == s))
						{
							continue;
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							for (i = 5;i > 0;i--)
							{
								if (z == i)
								{
									System.out.print("z");
									System.out.print(' ');
									System.out.print(10 * z);
									System.out.print("\n");
								}
								if (q == i)
								{
									System.out.print("q");
									System.out.print(' ');
									System.out.print(10 * q);
									System.out.print("\n");
								}
								if (s == i)
								{
									System.out.print("s");
									System.out.print(' ');
									System.out.print(10 * s);
									System.out.print("\n");
								}
								if (l == i)
								{
									System.out.print("l");
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
	}
}
