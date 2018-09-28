package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[5];
		int amiddle;
		String b = new String(new char[5]);
		char bmiddle;
		int i;
		int j;
		for (z = 1;z < 6;z++)
		{
			for (q = 1;q < 6;q++)
			{
				if (q != z)
				{
					for (s = 1;s < 6;s++)
					{
						if ((s != z) && (s != q))
						{
							for (l = 1;l < 6;l++)
							{
								if ((l != z) && (l != q) && (l != s))
								{
									if (((z + q - s - l) == 0) && (z + l > s + q) && (z + s < q))
									{
										a[1] = z;
										b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
										a[2] = q;
										b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
										a[3] = s;
										b = tangible.StringFunctions.changeCharacter(b, 3, 's');
										a[4] = l;
										b = tangible.StringFunctions.changeCharacter(b, 4, 'l');
										for (i = 1;i < 5;i++)
										{
											for (j = i + 1;j < 5;j++)
											{
												if (a[i] < a[j])
												{
													amiddle = a[i];
													a[i] = a[j];
													a[j] = amiddle;
													bmiddle = b.charAt(i);
													b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
													b = tangible.StringFunctions.changeCharacter(b, j, bmiddle);
												}
											}
										}
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		for (i = 1;i < 5;i++)
		{
			System.out.print(b.charAt(i));
			System.out.print(' ');
			System.out.print(a[i]);
			System.out.print('0');
			System.out.print("\n");
		}
		return 0;
	}
}

