package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int z;
		int q;
		int s;
		int l;
		int CC1;
		int CC2;
		int CC3;
		String str = new String(new char[6]);
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 0; l <= 5; l++)
					{
						CC1 = ((z + q) == (s + l));
						CC2 = ((z + l) > (s + q));
						CC3 = ((z + s) < q);
						if ((CC1 + CC2 + CC3 == 3) && (z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
						{
							str = tangible.StringFunctions.changeCharacter(str, 6 - z, 'z');
							str = tangible.StringFunctions.changeCharacter(str, 6 - q, 'q');
							str = tangible.StringFunctions.changeCharacter(str, 6 - s, 's');
							str = tangible.StringFunctions.changeCharacter(str, 6 - l, 'l');
						}
					}
				}
			}
		}
		for (i = 1; i <= 6; i++)
		{
			if (str.charAt(i) == 'z' || str.charAt(i) == 'q' || str.charAt(i) == 's' || str.charAt(i) == 'l')
			{
				System.out.print(str.charAt(i));
				System.out.print(" ");
				System.out.print((6 - i) * 10);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

