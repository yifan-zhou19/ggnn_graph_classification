package <missing>;

public class GlobalMembers
{
	/*
	??
	???
	????yang?
	???2012.10.14
	*/

	public static int Main()
	{
		int z; //?????????
		int q;
		int s;
		int l;
		int x;
		int[] a = new int[5];
		int i;
		int j;
		int k;
		String b = new String(new char[5]); //?????b[5]
		char y;
		b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
		b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
		b = tangible.StringFunctions.changeCharacter(b, 3, 's');
		b = tangible.StringFunctions.changeCharacter(b, 4, 'l'); //??b???
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a[1] = z;
							a[2] = q;
							a[3] = s;
							a[4] = l; //?????????????????a
							for (i = 1;i <= 4;i++)
							{
								for (j = 1;j <= 4;j++)
								{
									if (a[i] < a[j] && i < j)
									{
										x = a[i];
										a[i] = a[j];
										a[j] = x;
										y = b.charAt(i);
										b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
										b = tangible.StringFunctions.changeCharacter(b, j, y);
									} //??????????b??
								}
							}
						}
					}
				}
			}
		}
		for (k = 1;k <= 4;k++)
		{
			System.out.print(b.charAt(k));
			System.out.print(" ");
			System.out.print(a[k] * 10);
			System.out.print("\n");
		} //????
		return 0;
	}
}

