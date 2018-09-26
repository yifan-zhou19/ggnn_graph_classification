package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //z, q, s, l ???????????????a[5] ??????????i ????
		int q;
		int s;
		int l;
		int[] a = new int[5];
		int i;
		for (z = 10; z <= 50; z = z + 10)
		{
			for (q = 10; q <= 50; q = q + 10)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 10; s <= 50; s = s + 10)
				{
					if ((s == z) || (s == q))
					{
						continue;
					}
					for (l = 10; l <= 50; l = l + 10)
					{
						if ((l == z) || (l == q) || (l == s))
						{
							continue;
						}
						if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q))
						{
							for (i = 50; i >= 10; i = i - 10)
							{
								if (z == i)
								{
									System.out.print("z ");
									System.out.print(z);
									System.out.print("\n");
								}
								if (q == i)
								{
									System.out.print("q ");
									System.out.print(q);
									System.out.print("\n");
								}
								if (s == i)
								{
									System.out.print("s ");
									System.out.print(s);
									System.out.print("\n");
								}
								if (l == i)
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
