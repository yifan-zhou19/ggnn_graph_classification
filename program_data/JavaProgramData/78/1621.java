package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //??????????
		int q;
		int s;
		int l;
		int[] a = new int[5]; //???????????
		int i; //??????i,j?????m
		int j;
		int m;
		String b = new String(new char[6]); //???????????
		for (z = 1;z <= 5;z++)
		{ //???????????1-5??10-50
			for (q = 1;q <= 5;q++)
			{
				if (z == q) //??????????????
				{
					continue;
				}
				else
				{
					for (s = 1;s <= 5;s++)
					{
						if ((s == z) || (s == q))
						{
							continue;
						}
						else
						{
							for (l = 1;l <= 5;l++)
							{
								if ((l == z) || (l == q) || (l == s))
								{
									continue;
								}
								else if (((z + q) == (s + l)) && ((z + l) > (q + s)) && ((z + s) < q))
								{ //????????
									a[1] = z;
									a[2] = q;
									a[3] = s;
									a[4] = l; //?????
									b = tangible.StringFunctions.changeCharacter(b, a[1], 'z');
									b = tangible.StringFunctions.changeCharacter(b, a[2], 'q');
									b = tangible.StringFunctions.changeCharacter(b, a[3], 's');
									b = tangible.StringFunctions.changeCharacter(b, a[4], 'l'); //?????????
									for (i = 1;i <= 4;i++)
									{ //???????
										for (j = 1;j <= 4 - i;j++)
										{
											if (a[j] < a[j + 1])
											{
											m = a[j];
											a[j] = a[j + 1];
											a[j + 1] = m;
											}
										}
									}
									for (i = 1;i <= 4;i++)
									{ //???????????
										 System.out.print(b.charAt(a[i]));
										 System.out.print(" ");
										 System.out.print(a[i] * 10);
										if (i != 4)
										{
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
		return 0; //????
	}

}

