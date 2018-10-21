package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int k;
		int j;
		int m;
		int p;
		String b = new String(new char[4]);
		b = tangible.StringFunctions.changeCharacter(b, 0, 'z',b[1] = 'q',b[2] = 's',b[3] = 'l'); //?????????
		char n = ' ';
		int[] a = new int[4];
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++) //????
					{
						if (z + q == s + l && z + l > s + q && z + s < q) //????????
						{
							a[0] = z;
							a[1] = q;
							a[2] = s;
							a[3] = l;
							for (j = 0;j < 4;j++)
							{
								for (k = j + 1;k < 4;k++) //???????
								{
									if (a[j] <= a[k])
									{
										m = a[j];
										a[j] = a[k];
										a[k] = m;
										n = b.charAt(j);
										b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(k));
										b = tangible.StringFunctions.changeCharacter(b, k, n);
									} //?????????????
								}
							}
							for (p = 0;p < 4;p++)
							{
								System.out.print(b.charAt(p));
								System.out.print(" ");
								System.out.print(a[p] * 10);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

