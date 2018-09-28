package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int t;
		String a = new String(new char[5]);
		int[] b = new int[5];
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
		b[1] = z;
		b[2] = q;
		b[3] = s;
		b[4] = l;
		a = tangible.StringFunctions.changeCharacter(a, 1, 'z');
		a = tangible.StringFunctions.changeCharacter(a, 2, 'q');
		a = tangible.StringFunctions.changeCharacter(a, 3, 's');
		a = tangible.StringFunctions.changeCharacter(a, 4, 'l');
		for (int i = 1;i <= 4;i++)
		{
			for (int j = 1;j <= 3;j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
					t = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, j + 1, t);
				}
			}
		}
		for (int i = 1;i <= 4;i++)
		{
			System.out.print(a.charAt(i));
			System.out.print(" ");
			System.out.print(b[i]);
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

