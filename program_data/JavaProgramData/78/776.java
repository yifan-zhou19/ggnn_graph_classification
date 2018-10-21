package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] cc = new int[4];
		int i;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if (z != q && q != s && s != l && z != s && z != l && q != l)
						{
							cc[0] = (z + q == s + l);
							cc[1] = (z + l > s + q);
							cc[2] = (z + s < q);
							if (cc[0] + cc[1] + cc[2] == 3)
							{
								System.out.print("l");
								System.out.print(" ");
								System.out.print(l);
								System.out.print("\n");
								System.out.print("q");
								System.out.print(" ");
								System.out.print(q);
								System.out.print("\n");
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z);
								System.out.print("\n");
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s);
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
