package <missing>;

public class GlobalMembers
{
	/* title:???  *
	 * author:???*
	 * time:2011.9.28*/




	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int j;
		int t;
		int k;
		int m = 1;
		char n;
		int[] a = new int[5];
		String b = new String(new char[5]);
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a[1] = z;
							a[2] = q;
							a[3] = s;
							a[4] = l;
							b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
							b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
							b = tangible.StringFunctions.changeCharacter(b, 3, 's');
							b = tangible.StringFunctions.changeCharacter(b, 4, 'l');
						}
					}
				}
			}
		}
					for (i = 1; i <= 4; i++)
					{
						for (j = 1; j <= 4 - i; j++)
						{
							if (a[j] < a[j + 1])
							{
									t = a[j];
									a[j] = a[j + 1];
									a[j + 1] = t;
									n = b.charAt(j);
									b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
									b = tangible.StringFunctions.changeCharacter(b, j + 1, n);
							}
						}
					}
					for (k = 1; k <= 4 ; k++)
					{
						System.out.print(b.charAt(k));
						System.out.print(" ");
						System.out.print(a[k] * 10);
						System.out.print("\n");
					}
		return 0;
	}



}

