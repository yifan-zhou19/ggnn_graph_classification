package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		final String c = "";
		final String d = "";
		final String e = "";
		char l;
		int n;
		int i;
		int j;
		int h;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			t = 0;
			a = new Scanner(System.in).nextLine();
			c = new Scanner(System.in).nextLine();
			l = System.in.read();
			 h = a.length() - 1;
			for (j = 0;j <= h;j++)
			{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(h - j));
			}
				k = c.length() - 1;
			for (j = 0;j <= k;j++)
			{
			d = tangible.StringFunctions.changeCharacter(d, j, c.charAt(k - j));
			}
			for (j = k + 1;j <= h;j++)
			{
			d = tangible.StringFunctions.changeCharacter(d, j, '0');
			}
			for (j = 0;j <= h;j++)
			{
				if (b.charAt(j) >= d.charAt(j))
				{
					e = tangible.StringFunctions.changeCharacter(e, j, b.charAt(j) - d.charAt(j));
				}
				else
				{
					e = tangible.StringFunctions.changeCharacter(e, j, b.charAt(j) + 10 - d.charAt(j));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, b.charAt(j + 1) - 1);
				}
			}
				for (j = h;j >= 0;j--)
				{
				if (e.charAt(j) > 0)
				{
					t = t + 1;
				}
				if (t > 0)
				{
					System.out.printf("%c",e.charAt(j) + 48);
				}
				}
				System.out.print("\n");
		}


	}







}

