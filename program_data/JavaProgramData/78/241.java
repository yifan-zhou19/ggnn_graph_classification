package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[5];
		int j;
		int i;
		int t;
		String b = new String(new char[5]);
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
				   for (l = 10;l <= 50;l = l + 10)
				   {
				   if (z != q && z != s && z != l && q != s && q != l && s != l)
				   {
					   if (z + q == s + l && z + l > s + q && z + s < q)
					   {
						   a[1] = z;
						   a[2] = q;
						   a[3] = l;
						   a[4] = s;
						   b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
						   b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
						   b = tangible.StringFunctions.changeCharacter(b, 3, 'l');
						   b = tangible.StringFunctions.changeCharacter(b, 4, 's');
					   }
				   }
				   }
				}
			}
		}
						for (j = 1;j <= 3;j++)
						{
						for (i = 1;i <= 4 - j;i++)
						{
						if (a[i] < a[i + 1])
						{
							t = a[i];
							a[i] = a[i + 1];
							a[i + 1] = t;
						t = b.charAt(i);
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
						b = tangible.StringFunctions.changeCharacter(b, i + 1, t);
						}
						}
						}
		 for (i = 1;i <= 4;i++)
		 {
			 System.out.printf("%c %d\n",b.charAt(i),a[i]);
		 }

	}
}

