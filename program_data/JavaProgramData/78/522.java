package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int x1;
		int x2;
		int x3;
		int i;
		String rank = new String(new char[6]);
		for (i = 0;i < 6;i++)
		{
			rank = tangible.StringFunctions.changeCharacter(rank, i, '0');
		}
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 10;s <= 50;s = s + 10)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 10;l <= 50;l = l + 10)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						x1 = ((z + q) == (s + l));
						x2 = ((z + l) > (s + q));
						x3 = ((z + s) < q);
						if (x1 + x2 + x3 == 3)
						{
							rank = tangible.StringFunctions.changeCharacter(rank, z / 10, 'z');
							rank = tangible.StringFunctions.changeCharacter(rank, q / 10, 'q');
							rank = tangible.StringFunctions.changeCharacter(rank, s / 10, 's');
							rank = tangible.StringFunctions.changeCharacter(rank, l / 10, 'l');
							for (i = 5;i >= 1;i--)
							{
								if (rank.charAt(i) != '0')
								{
									System.out.print(rank.charAt(i));
									System.out.print(' ');
									System.out.print(i * 10);
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

