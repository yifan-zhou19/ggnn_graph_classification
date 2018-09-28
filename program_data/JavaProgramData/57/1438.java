package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		String s = new String(new char[20]);
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
			m = s.length();
			for (j = 0;j <= m;j++)
			{
				if (s.charAt(m - 2) == 'e' && s.charAt(m - 1) == 'r')
				{
					s = tangible.StringFunctions.changeCharacter(s, m - 2, '\0');
					s = tangible.StringFunctions.changeCharacter(s, m - 1, '\0');
				}
				else if (s.charAt(m - 2) == 'l' && s.charAt(m - 1) == 'y')
				{
					s = tangible.StringFunctions.changeCharacter(s, m - 2, '\0');
					s = tangible.StringFunctions.changeCharacter(s, m - 1, '\0');
				}
				else if (s.charAt(m - 3) == 'i' && s.charAt(m - 2) == 'n' && s.charAt(m - 1) == 'g')
				{
					s = tangible.StringFunctions.changeCharacter(s, m - 3, '\0');
					s = tangible.StringFunctions.changeCharacter(s, m - 2, '\0');
					s = tangible.StringFunctions.changeCharacter(s, m - 1, '\0');
				}
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}


}

