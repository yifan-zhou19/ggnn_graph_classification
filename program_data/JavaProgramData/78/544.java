package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int z;
		int q;
		int s;
		int l;
		String a = new String(new char[6]);
		for (i = 0;i <= 5;i++)
		{
			a = a.substring(0, i);
		}
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q = q + 1)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 1;s <= 5;s = s + 1)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 1;l <= 5;l = l + 1)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3)
						{
							a = tangible.StringFunctions.changeCharacter(a, z, 'z');
						 a = tangible.StringFunctions.changeCharacter(a, q, 'q');
						 a = tangible.StringFunctions.changeCharacter(a, s, 's');
						 a = tangible.StringFunctions.changeCharacter(a, l, 'l');
						 for (i = 5;i >= 1;i--)
						 {
							 if (a.charAt(i) != 0)
							 {
								 System.out.print(a.charAt(i));
								 System.out.print(" ");
								 System.out.print(10 * i);
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

