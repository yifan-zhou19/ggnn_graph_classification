package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int s;
		int k;
		int f;
		int v = 1;
		int j = 0;
		char e = 'a';
		int cd;
		int o;
		int sum;
		String x = new String(new char[2]);
		String zf = new String(new char[300]);
		final String z = "";
		zf = new Scanner(System.in).nextLine();
		o = zf.length();
		for (i = 0;i <= o - 1;i++)
		{
			if (((zf.charAt(i) >= 'a') && (zf.charAt(i) <= 'z')) || ((zf.charAt(i) >= 'A') && (zf.charAt(i) <= 'Z')))
			{
				z = tangible.StringFunctions.changeCharacter(z, j, zf.charAt(i));
				j++;
			}



		}
		if (j == 0)
		{
			System.out.print("No");
		}
		// printf("%s",z);
		cd = z.length();

		for (k = 0;k <= cd - 2;k++)
		{
			for (i = 0;i <= cd - 2 - k;i++)
			{
				if (z.charAt(i) > z.charAt(i + 1))
				{
					e = z.charAt(i);
					z = tangible.StringFunctions.changeCharacter(z, i, z.charAt(i + 1));

					z = tangible.StringFunctions.changeCharacter(z, i + 1, e);
				}
			}

		}
	//	printf("%s",z);
		for (s = 0;s < cd;s++)
		{
			if (((s == 0) || (z.charAt(s) != z.charAt(s - 1))) && (z.charAt(s) != z.charAt(s + 1)))
			{
				System.out.printf("%c=%d",z.charAt(s),v);
				System.out.print("\n");
			}
			if (((s == 0) || (z.charAt(s) != z.charAt(s - 1))) && (z.charAt(s) == z.charAt(s + 1)))
			{
				sum = 0;
				for (f = s + 1;f < cd;f++)
				{
					if (z.charAt(f) != z.charAt(f + 1))
					{
						break;
					}



				}
				 sum = f - s + 1;
				System.out.printf("%c=%d",z.charAt(s),sum);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

