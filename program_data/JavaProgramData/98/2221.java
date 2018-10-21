package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l = 0;
		int L = 0;
		int i;
		int t;
		char[][] w = new char[200][41];
		final String c = "";

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0; i < n; i++)
		{
			l = String.valueOf(w[i]).length() + 1; //???????????
			L = L + l;
			if (L <= 81)
			{
				c += w[i];
				c += " ";
				if (L == 81)
				{
					c = tangible.StringFunctions.changeCharacter(c, 80, '\0');
					System.out.println(c);
					for (t = 0; c.charAt(t) != '\0'; t++)
					{
						c = tangible.StringFunctions.changeCharacter(c, t, '\0');
					}
					l = L = 0;
				}
				if (i == n - 1)
				{
					c = tangible.StringFunctions.changeCharacter(c, L - 1, '\0');
					System.out.println(c);
					System.out.print("\n");
				}
			}
			if (L > 81)
			{
				c = tangible.StringFunctions.changeCharacter(c, L - 1 - l, '\0');
				System.out.println(c);
				System.out.print("\n");
				for (t = 0; c.charAt(t) != '\0'; t++)
				{
						c = tangible.StringFunctions.changeCharacter(c, t, '\0');
				}
				c += w[i];
				c += " ";
				L = 0;
				l = String.valueOf(w[i]).length() + 1;
				L = L + l;
			}
		}


		return 0;
	}
}

