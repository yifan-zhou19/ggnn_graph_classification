package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		final String d = "";
		final String d2 = "";
		int len;
		int i;
		int j;
		int k;
		int r;
		int c;
		int ent = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 2;i <= len;i++)
		{
			for (j = 0;j <= len - i;j++)
			{
				for (c = 0;c <= len;c++)
				{
					d = tangible.StringFunctions.changeCharacter(d, c, '\0');
					d2 = tangible.StringFunctions.changeCharacter(d2, c, '\0');
				}
				for (k = j;k < j + i;k++)
				{
					d = tangible.StringFunctions.changeCharacter(d, k - j, s.charAt(k));
				}
				for (r = 0;r < i;r++)
				{
					d2 = tangible.StringFunctions.changeCharacter(d2, r, d.charAt(i - 1 - r));
				}
				if (strcmp(d2,d) == 0)
				{
					if (ent == 0)
					{
						System.out.printf("%s",d);
						ent = 1;
					}
					else
					{
						System.out.printf("\n%s",d);
					}
				}
			}
		}
	}
}

