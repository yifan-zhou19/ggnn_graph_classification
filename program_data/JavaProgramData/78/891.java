package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (int z = 1;z <= 5;z++)
		{
			for (int q = 2;q <= 5;q++)
			{
				for (int s = 1;s <= 5;s++)
				{
					for (int l = 1;l <= 5;l++)
					{
						if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
						{
							for (int k = 5;k >= 1;k--)
							{
								if (z == k)
								{
									System.out.print("z");
									System.out.print(" ");
									System.out.print(10 * z);
									System.out.print("\n");
								}
								if (q == k)
								{
									System.out.print("q");
									System.out.print(" ");
									System.out.print(10 * q);
									System.out.print("\n");
								}
								if (s == k)
								{
									System.out.print("s");
									System.out.print(" ");
									System.out.print(10 * s);
									System.out.print("\n");
								}
								if (l == k)
								{
									System.out.print("l");
									System.out.print(" ");
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
