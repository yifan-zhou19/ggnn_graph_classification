package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int a;
		int b;
		int c;
		int i;
		String n = new String(new char[6]);
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						a = (z + q == s + l);
						b = (z + l > s + q);
						c = (z + s < q);
						if (a == 1 && b == 1 && c == 1)
						{
							n = tangible.StringFunctions.changeCharacter(n, z, 'z');
							n = tangible.StringFunctions.changeCharacter(n, q, 'q');
							n = tangible.StringFunctions.changeCharacter(n, s, 's');
							n = tangible.StringFunctions.changeCharacter(n, l, 'l');
							for (i = 5;i >= 1;i--)
							{
	if (i == 3)
	{
	continue;
	}
								System.out.print(n.charAt(i));
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

