package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //????????????????
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int t;
		String c = new String(new char[4]); //a[4]??????c[4]??????t?u??????
		char u;
		for (z = 1;z <= 5;z++) //????
		{
			for (q = 1;q <= 5;q++)
			{
				if (q != z)
				{
					for (s = 1;s <= 5;s++)
					{
						if (s != z && s != q)
						{
							for (l = 1;l <= 5;l++)
							{
								if (l != z && l != q && l != s)
								{
									if (z + q == s + l && z + l > q + s && z + s < q) //??????
									{
										a[0] = z;
										a[1] = q;
										a[2] = s;
										a[3] = l; //???????????????
									c = tangible.StringFunctions.changeCharacter(c, 0, 'z');
									c = tangible.StringFunctions.changeCharacter(c, 1, 'q');
									c = tangible.StringFunctions.changeCharacter(c, 2, 's');
									c = tangible.StringFunctions.changeCharacter(c, 3, 'l');
									break;
									}
								}
							}
						}
					}
				}
			}
		}
	for (int i = 0;i < 4;i++)
	{
	for (int j = 0;j < 3 - i;j++)
	{
	if (a[j] < a[j + 1]) //??
	{
		t = a[j];
		a[j] = a[j + 1];
		a[j + 1] = t;
		u = c.charAt(j);
		c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
		c = tangible.StringFunctions.changeCharacter(c, j + 1, u);
	}
	}
	}
	for (int k = 0;k < 4;k++)
	{
	System.out.print(c.charAt(k));
	System.out.print(" ");
	System.out.print(a[k] * 10);
	System.out.print("\n");
	}
	return 0;
	}
}

