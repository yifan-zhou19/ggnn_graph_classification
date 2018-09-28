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
		String a = new String(new char[5]);
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a = tangible.StringFunctions.changeCharacter(a, z, 'z');
							a = tangible.StringFunctions.changeCharacter(a, q, 'q');
							a = tangible.StringFunctions.changeCharacter(a, s, 's');
							a = tangible.StringFunctions.changeCharacter(a, l, 'l' - 1);
						}
					}
				}
			}
		}
		for (i = 5;i >= 1;i--)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				System.out.print(a.charAt(i));
				System.out.print(" ");
				System.out.print(i * 10);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

