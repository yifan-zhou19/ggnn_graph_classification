package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10]);
		int z;
		int q;
		int s;
		int l;
		int i;
		for (i = 0; i < 10; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ' ');
		}
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3)
						{
							a = tangible.StringFunctions.changeCharacter(a, z, 'z');
							a = tangible.StringFunctions.changeCharacter(a, q, 'q');
							a = tangible.StringFunctions.changeCharacter(a, s, 's');
							a = tangible.StringFunctions.changeCharacter(a, l, 'l');
						}
					}
				}
			}
		}
		for (i = 9; i >= 1; i--)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c %d\n",a.charAt(i),i * 10);
			}
		}
		return 0;
	}

}

