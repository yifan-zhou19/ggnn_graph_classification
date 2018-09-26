package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z = 10;
		int q = 10;
		int s = 10;
		int l = 10;
		int i = 0;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 10;s <= 50;s = s + 10)
				{
					if (z == s || q == s)
					{
						continue;
					}
					for (l = 10;l <= 50;l = l + 10)
					{
						if (z == l || q == l || s == l)
						{
							continue;
						}
						if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3)
						{
							char[] rank = {' ', ' ', ' ', ' ', ' ', ' '};
							rank[z / 10] = 'z';
							rank[q / 10] = 'q';
							rank[s / 10] = 's';
							rank[l / 10] = 'l';
							for (i = 5;i >= 0;i--)
							{
								if (rank[i] == ' ')
								{
									continue;
								}
								System.out.print(rank[i]);
								System.out.print(" ");
								System.out.print(i * 10);
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
