package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q && z != q && z != s && z != l && q != s && q != l && s != l) //????????
						{
							int[] a = new int[5];
							int t;
							int m;
							String c = new String(new char[5]);
							char tc;
							a[1] = z;
							a[2] = q;
							a[3] = s;
							a[4] = l;
							c = tangible.StringFunctions.changeCharacter(c, 1, 'z');
							c = tangible.StringFunctions.changeCharacter(c, 2, 'q');
							c = tangible.StringFunctions.changeCharacter(c, 3, 's');
							c = tangible.StringFunctions.changeCharacter(c, 4, 'l');
							for (int i = 1;i <= 4;i++)
							{
								m = i;
								for (int j = i + 1;j <= 4;j++)
								{
									if (a[j] > a[m])
									{
										m = j;
									}
								}
								t = a[i];
								a[i] = a[m];
								a[m] = t;
								tc = c.charAt(i);
								c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(m));
								c = tangible.StringFunctions.changeCharacter(c, m, tc);
								System.out.print(c.charAt(i));
								System.out.print(" ");
								System.out.print(a[i] * 10);
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

