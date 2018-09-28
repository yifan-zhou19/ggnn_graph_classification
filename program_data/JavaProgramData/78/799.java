package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int i;
		int j;
		int t;
		String rank = new String(new char[51]);
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				if (q == z)
				{
					continue;
				}
				else
				{
					for (s = 10;s <= 50;s = s + 10)
					{
						if ((s == z) || (s == q))
						{
							continue;
						}
						else
						{
							for (l = 10;l <= 50;l = l + 10) //?4????4??????????
							{
								if ((l == z) || (l == q) || (l == s))
								{
									continue; //??????????????????????
								}
							else
							{
								rank = tangible.StringFunctions.changeCharacter(rank, z, 'z');
								rank = tangible.StringFunctions.changeCharacter(rank, q, 'q');
								rank = tangible.StringFunctions.changeCharacter(rank, s, 's');
								rank = tangible.StringFunctions.changeCharacter(rank, l, 'l');
								if ((z + q == s + l) && (z + l > s + q) && (z + s < q)) //??????????
								{
									a[0] = z;
									a[1] = q;
									a[2] = s;
									a[3] = l;
									for (i = 0;i <= 3;i++) //???????????????
									{
										for (j = 0;j <= i;j++)
										{
											if (a[j] < a[i])
											{
											t = a[j];
											a[j] = a[i];
											a[i] = t;
											}
										}
									}
									for (i = 0;i <= 3;i++)
									{
										System.out.print(rank.charAt(a[i]));
										System.out.print(" ");
										System.out.print(a[i]);
										System.out.print("\n");
									}
								}
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

