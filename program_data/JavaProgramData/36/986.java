package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int alen;
		int blen;
		int i;
		int j;
		char e;
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		alen = a.length();
		blen = b.length();


		for (i = 1;i < alen;i++)
		{
			for (j = 0;j < alen - i;j++)
			{
				if (a.charAt(j) > a.charAt(j + 1))
				{
					e = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, j + 1, e);
				}
			}
		}


		for (i = 1;i < blen;i++)
		{
			for (j = 0;j < blen - i;j++)
			{
				if (b.charAt(j) > b.charAt(j + 1))
				{
					e = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, e);
				}
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}

}

