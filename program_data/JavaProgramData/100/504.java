package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int a;
		int j;
		int c = 0;
		int[] have = new int[26];
		String fh = new String(new char[300]);
		String xin = new String(new char[26]);
		char haha;
		fh = new Scanner(System.in).nextLine();
		k = fh.length();
		for (i = 0;i < k;i++)
		{
			if (fh.charAt(i) >= 'a' && fh.charAt(i) <= 'z')
			{
				xin = tangible.StringFunctions.changeCharacter(xin, c, fh.charAt(i));
				c += 1;
				a = 1;
				for (j = i + 1;j < k;j++)
				{
					if (fh.charAt(i) == fh.charAt(j))
					{
						a += 1;
						fh = tangible.StringFunctions.changeCharacter(fh, j, '0');
					}
				}
				have[c - 1] = a;

			}
		}
		if (c == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < c;i++)
			{
				for (j = i + 1;j < c;j++)
				{
					if (xin.charAt(j) < xin.charAt(i))
					{
						haha = xin.charAt(i);
						xin = tangible.StringFunctions.changeCharacter(xin, i, xin.charAt(j));
						xin = tangible.StringFunctions.changeCharacter(xin, j, haha);
						k = have[i];
						have[i] = have[j];
						have[j] = k;
					}
				}
				System.out.printf("%c=%d\n",xin.charAt(i),have[i]);
			}
		}

		return 0;


	}
}

