package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z = 1;
		int i;
		int q = 1;
		int s = 1;
		int l = 1;
		int[] a = new int[6];
		String b = new String(new char[6]);
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
						if (l != s && l != q && l != z)
						{
							if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
							{
								a[z] = z * 10;
								a[q] = q * 10;
								a[s] = s * 10;
								a[l] = l * 10;
								b = tangible.StringFunctions.changeCharacter(b, z, 'z');
								b = tangible.StringFunctions.changeCharacter(b, q, 'q');
								b = tangible.StringFunctions.changeCharacter(b, s, 's');
								b = tangible.StringFunctions.changeCharacter(b, l, 'l');
								for (i = 5;i > 0;i--)
								{
									if (a[i] != 0)
									{
										System.out.print(b.charAt(i));
										System.out.print(" ");
										System.out.print(a[i]);
										System.out.print("\n");
									}
								}
									break;
							}
						}
					}
				}
			}
		}
	return 0;
	}

}

