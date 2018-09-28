package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] rank = new int[51];
		int i;
		String word = new String(new char[51]);
		for (i = 0;i <= 50;i++)
		{
			rank[i] = 0;
		}
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q) && z != q && z != s && z != l && q != s && q != l && s != l)
						{
							word = tangible.StringFunctions.changeCharacter(word, z, 'z');
							word = tangible.StringFunctions.changeCharacter(word, q, 'q');
							word = tangible.StringFunctions.changeCharacter(word, s, 's');
							word = tangible.StringFunctions.changeCharacter(word, l, 'l');
							rank[z] = z;
							rank[q] = q;
							rank[s] = s;
							rank[l] = l;
							for (i = 50;i >= 0;i--)
							{
								if (rank[i] != 0)
								{
									System.out.print(word.charAt(i));
									System.out.print(" ");
									System.out.print(rank[i]);
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

