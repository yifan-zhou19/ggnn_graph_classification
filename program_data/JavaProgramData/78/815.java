package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //???????i?????z,q,s,l???????
		int z;
		int q;
		int s;
		int l;
		int x = 0;
		int x1;
		int x2;
		int x3;
		final String a = "";
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
					if (z == s || q == s)
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
						if (z == l || q == l || s == l)
						{
							continue; //???
						}
						x1 = ((z + q) == (s + l)); //??????3???
						x2 = ((z + l) > (s + q));
						x3 = ((z + s) < q);
						x = x1 + x2 + x3;
						if (x == 3)
						{
							a = tangible.StringFunctions.changeCharacter(a, 2, 'z');
						}
							a = tangible.StringFunctions.changeCharacter(a, 4, 'q');
							a = tangible.StringFunctions.changeCharacter(a, 1, 's');
							a = tangible.StringFunctions.changeCharacter(a, 5, 'l'); //????
					}
				}
			}
		}
		for (i = 5;i >= 1;i--)
		{
			if (i != 3)
			{
				System.out.print(a.charAt(i));
				System.out.print(" ");
				System.out.print(10 * i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

