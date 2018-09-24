package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		String s = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			for (j = 0;j < l + 1;j++)
			{
				if (s.charAt(j) == '\0' && s.charAt(j - 1) == 'r' && s.charAt(j - 2) == 'e')
				{
					s = tangible.StringFunctions.changeCharacter(s, j - 1, '\0');
					s = tangible.StringFunctions.changeCharacter(s, j - 2, '\0');
				}
				else if (s.charAt(j) == '\0' && s.charAt(j - 1) == 'y' && s.charAt(j - 2) == 'l')
				{
					s = tangible.StringFunctions.changeCharacter(s, j - 1, '\0');
					s = tangible.StringFunctions.changeCharacter(s, j - 2, '\0');
				}
				else if (s.charAt(j) == '\0' && s.charAt(j - 1) == 'g' && s.charAt(j - 2) == 'n' && s.charAt(j - 3) == 'i')
				{
					s = tangible.StringFunctions.changeCharacter(s, j - 3, '\0');
				}
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}

}

