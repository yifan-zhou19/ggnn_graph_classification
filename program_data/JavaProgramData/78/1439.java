package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int j;
		int k;
		int z;
		int q;
		int s;
		int l;
		int temp;
		String b = new String(new char[4]);
		char oemp;
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
			z = 10 * z;
			q = 10 * q;
			s = 10 * s;
			l = 10 * l;
			a[0] = z,b[0] = 'z';
			a[1] = q,b[1] = 'q';
			a[2] = s,b[2] = 's';
			a[3] = l,b[3] = 'l';
			for (j = 0;j < 3;j++)
			{
			for (k = 0;k < 3 - j;k++)
			{
				if (a[k] < a[k + 1])
				{
					temp = a[k];
					oemp = b.charAt(k);
					a[k] = a[k + 1];
					b = tangible.StringFunctions.changeCharacter(b, k, b.charAt(k + 1));
					a[k + 1] = temp;
					b = tangible.StringFunctions.changeCharacter(b, k + 1, oemp);
				}
			}
			}
		}
		}
		}
		}
		}
	for (int m = 0;m < 4;m++)
	{
	System.out.print(b.charAt(m));
	System.out.print(" ");
	System.out.print(a[m]);
	System.out.print("\n");
	}
		return 0;
	}

}

