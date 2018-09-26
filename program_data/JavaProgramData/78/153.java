package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int m;
		int i;
		String a = new String(new char[6]);

		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 1; s <= 5; s++)
				{
					if (s == q)
					{
						continue;
					}
					for (l = 1; l <= 5; l++)
					{
						if (l == s)
						{
							continue;
						}
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a = tangible.StringFunctions.changeCharacter(a, z, 'z');
							a = tangible.StringFunctions.changeCharacter(a, q, 'q');
							a = tangible.StringFunctions.changeCharacter(a, s, 's');
							a = tangible.StringFunctions.changeCharacter(a, l, 'l');
							m = 15 - z - q - s - l;
						}
					}
				}
			}
		}
		for (i = 5; i > m;i--)
		{
			System.out.print(a.charAt(i));
			System.out.print(" ");
			System.out.print(i * 10);
			System.out.print("\n");
		}
		for (i = m - 1;i >= 1;i--)
		{
			System.out.print(a.charAt(i));
			System.out.print(" ");
			System.out.print(i * 10);
			System.out.print("\n");
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}


}

