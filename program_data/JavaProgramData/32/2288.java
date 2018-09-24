package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int d;
		int i;
		int j;
		final String a = "";
		final String b = "";
		final String e = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			c = a.length();
			d = b.length();

			for (j = d - 1;j >= 0;j--)
			{
				if (a.charAt(c - d + j) >= b.charAt(j))
				{
					e = tangible.StringFunctions.changeCharacter(e, c - d + j, a.charAt(c - d + j) - b.charAt(j) + 48);
				}
				else
				{
					e = tangible.StringFunctions.changeCharacter(e, c - d + j, a.charAt(c - d + j) + 10 - b.charAt(j) + 48);
					a.charAt(c - d + j - 1)--;
				}
			}
			for (j = c - d - 1;j >= 1;j--)
			{
				if (a.charAt(j) < 48)
				{
					e = tangible.StringFunctions.changeCharacter(e, j, a.charAt(j) + 9);
					a.charAt(j - 1)--;
				}
				else
				{
					e = tangible.StringFunctions.changeCharacter(e, j, a.charAt(j));
				}
			}
			e = tangible.StringFunctions.changeCharacter(e, 0, a.charAt(0));
			System.out.printf("%s\n",e);
			for (j = 0;j < 101;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
				e = tangible.StringFunctions.changeCharacter(e, j, '\0');
			}
		}
		return 0;
	}

}

