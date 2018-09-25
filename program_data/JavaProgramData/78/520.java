package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		String name = new String(new char[6]);
		int[] state = new int[3];
		int i;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 1;s <= 5;s++)
				{
					if (s == q || s == z)
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
						if (l == s || l == q || l == z)
						{
							continue;
						}
						state[0] = (z + q == s + l);
						state[1] = (z + l > s + q);
						state[2] = (z + s < q);
						if (state[0] == 1 && state[1] == 1 && state[2] == 1)
						{
							name = tangible.StringFunctions.changeCharacter(name, z, 'z');
							name = tangible.StringFunctions.changeCharacter(name, q, 'q');
							name = tangible.StringFunctions.changeCharacter(name, s, 's');
							name = tangible.StringFunctions.changeCharacter(name, l, 'l');
							for (i = 5;i > 0;i--)
							{
								if (i == z)
								{
									System.out.print(name.charAt(z));
									System.out.print(" ");
									System.out.print(i * 10);
									System.out.print("\n");
								}
								if (i == q)
								{
									System.out.print(name.charAt(q));
									System.out.print(" ");
									System.out.print(i * 10);
									System.out.print("\n");
								}
								if (i == s)
								{
									System.out.print(name.charAt(s));
									System.out.print(" ");
									System.out.print(i * 10);
									System.out.print("\n");
								}
								if (i == l)
								{
									System.out.print(name.charAt(l));
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
	}
}

