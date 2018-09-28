package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q += 10)
			{
				for (s = 10;s < 60;s += 10)
				{
					for (l = 10;l < 60;l += 10)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							System.out.print("l ");
							System.out.print(l);
							System.out.print("\n");
							System.out.print("q ");
							System.out.print(q);
							System.out.print("\n");
							System.out.print("z ");
							System.out.print(z);
							System.out.print("\n");
							System.out.print("s ");
							System.out.print(s);
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}

}
