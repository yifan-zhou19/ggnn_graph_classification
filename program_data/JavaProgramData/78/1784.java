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
		String rank = new String(new char[100]);
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if ((z + q == s + l) && ((z + l) > (s + q)) && ((z + s) < q))
						{
							rank = tangible.StringFunctions.changeCharacter(rank, z, 'z');
							rank = tangible.StringFunctions.changeCharacter(rank, q, 'q');
							rank = tangible.StringFunctions.changeCharacter(rank, s, 's');
							rank = tangible.StringFunctions.changeCharacter(rank, l, 'l');
							for (i = 50;i >= 10;i = i - 10)
							{
								if (i == z || i == q || i == s || i == l)
								{
								System.out.print(rank.charAt(i));
								System.out.print(" ");
								System.out.print(i);
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

