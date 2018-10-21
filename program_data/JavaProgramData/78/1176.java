package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;

		for (q = 4;q <= 5;q++)
		{
				for (z = 1; z <= 5;z++)
				{
				if (z == q)
				{
					continue;
				}
				for (s = 1; s <= 5;z++)
				{
					if (s == q || s == z)
					{
						continue;
					}
					 l = z + q - s;
						if (l == q || l == z || l == s)
						{
							continue;
						}
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
								if (l == 5)
								{
									System.out.print("l ");
									System.out.print(10 * l);
									System.out.print("\n");
						System.out.print("q ");
						System.out.print(10 * q);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(10 * z);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(10 * s);
						System.out.print("\n");
								}
								else
								{
										System.out.print("q ");
										System.out.print(10 * q);
										System.out.print("\n");
						System.out.print("l ");
						System.out.print(10 * l);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(10 * s);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(10 * z);
						System.out.print("\n");
								}


						}
				}
				}
		}
		return 0;
	}
}
