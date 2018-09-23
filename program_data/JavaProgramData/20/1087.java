package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String s = new String(new char[14]);
		int i;
		int j;
		while (scanf("%s",str) != EOF)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			substr = tempVar.charAt(0);
		}
		int len;
		int jh = 0;
		len = str.length();
		for (j = 0;j <= len - 1;j++)
		{
		if (str.charAt(j) > str.charAt(jh))
		{
			jh = j;
		}
		}
		for (j = 0;j <= jh;j++)
		{
		s = tangible.StringFunctions.changeCharacter(s, j, str.charAt(j));
		}
		for (j = jh + 1;j <= jh + 3;j++)
		{
		s = tangible.StringFunctions.changeCharacter(s, j, substr.charAt(j - jh - 1));
		}
		for (j = jh + 4;j <= len + 2;j++)
		{
		s = tangible.StringFunctions.changeCharacter(s, j, str.charAt(j - 3));
		}
		s = tangible.StringFunctions.changeCharacter(s, len + 3, '\0');
		System.out.println(s);
		System.out.print("\n");
		}
	}


}

