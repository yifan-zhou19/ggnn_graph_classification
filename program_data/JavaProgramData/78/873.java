package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int t;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							for (t = 5 ; t >= 1 ; t--)
							{
								if (t == z)
								{
									System.out.print("z ");
									System.out.print(t * 10);
									System.out.print("\n");
								}
								if (t == l)
								{
									System.out.print("l ");
									System.out.print(t * 10);
									System.out.print("\n");
								}
								if (t == s)
								{
									System.out.print("s ");
									System.out.print(t * 10);
									System.out.print("\n");
								}
								if (t == q)
								{
									System.out.print("q ");
									System.out.print(t * 10);
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
