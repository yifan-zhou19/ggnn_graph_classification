package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String weight = new String(new char[6]);
		int z;
		int q;
		int s;
		int l;
		int i;
		int j;
		int k;
		int p;
		int m;
		for (i = 1;i <= 5;i++)
		{
			z = i;
			weight = tangible.StringFunctions.changeCharacter(weight, i, 'z');
			for (j = 1;j <= 5;j++)
			{
				if (i == j)
				{
					continue;
				}
				q = j;
				weight = tangible.StringFunctions.changeCharacter(weight, j, 'q');
				for (k = 1;k <= 5;k++)
				{
					if (k == i || k == j)
					{
						continue;
					}
					s = k;
					weight = tangible.StringFunctions.changeCharacter(weight, k, 's');
					for (p = 1;p <= 5;p++)
					{
						if (p == i || p == j || p == k)
						{
							continue;
						}
						l = p;
						weight = tangible.StringFunctions.changeCharacter(weight, p, 'l');
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							for (m = 5;m >= 1;m--)
							{
								if (z != m && q != m && s != m && l != m)
								{
									continue;
								}
								System.out.print(weight.charAt(m));
								System.out.print(' ');
								System.out.print(m * 10);
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

