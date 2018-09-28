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
		int[] word = new int[4];
		String rank = new String(new char[5]);
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 1;s <= 5;s++)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						word[1] = (z + q) == (s + l);
						word[2] = (z + l) > (s + q);
						word[3] = (z + s) < q;
						rank = tangible.StringFunctions.changeCharacter(rank, z, 'z');
						rank = tangible.StringFunctions.changeCharacter(rank, q, 'q');
						rank = tangible.StringFunctions.changeCharacter(rank, s, 's');
						rank = tangible.StringFunctions.changeCharacter(rank, l, 'l');
						if ((word[1] + word[2] + word[3]) == 3)
						{
							for (i = 5;i >= 1;i--)
							{
								if (i == z)
								{
								System.out.print(rank.charAt(z));
								System.out.print(" ");
								System.out.print(z * 10);
								System.out.print("\n");
								}
							else if (i == q)
							{
								System.out.print(rank.charAt(q));
								System.out.print(" ");
								System.out.print(q * 10);
								System.out.print("\n");
							}
							else if (i == s)
							{
								System.out.print(rank.charAt(s));
								System.out.print(" ");
								System.out.print(s * 10);
								System.out.print("\n");
							}
							else if (i == l)
							{
								System.out.print(rank.charAt(l));
								System.out.print(" ");
								System.out.print(l * 10);
								System.out.print("\n");
							}
							else
							{
								continue;
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

