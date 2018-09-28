package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		final String r = "";
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z == q || z == s || z == l || q == s || q == l || s == l)
						{
							continue;
						}
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							r = tangible.StringFunctions.changeCharacter(r, z, 'z');
							r = tangible.StringFunctions.changeCharacter(r, q, 'q');
							r = tangible.StringFunctions.changeCharacter(r, s, 's');
							r = tangible.StringFunctions.changeCharacter(r, l, 'l');
							for (i = 5;i > 0;i--)
							{
								if (r.charAt(i) != '\0')
								{
									System.out.print(r.charAt(i));
									System.out.print(" ");
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
	} //?????
}

