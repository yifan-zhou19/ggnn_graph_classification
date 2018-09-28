package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		String s = new String(new char[33]);
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
				s = tempVar2.charAt(0);
			}
			l = s.length();
			if (strcmp(s.charAt(l - 3), "ing") == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, l - 3, '\0');
			}
			else if (strcmp(s.charAt(l - 2), "er") == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, l - 2, '\0');
			}
			else if (strcmp(s.charAt(l - 2), "ly") == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, l - 2, '\0');
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}

}

