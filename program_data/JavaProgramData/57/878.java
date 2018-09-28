package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[33]);
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			for (j = 0;j < len;j++)
			{
				if (s.charAt(j) == 'e' && s.charAt(j + 1) == 'r' && s.charAt(j + 2) == '\0')
				{
				s = tangible.StringFunctions.changeCharacter(s, j, '\0');
				}
				else if (s.charAt(j) == 'l' && s.charAt(j + 1) == 'y' && s.charAt(j + 2) == '\0')
				{
				s = tangible.StringFunctions.changeCharacter(s, j, '\0');
				}
				else if (s.charAt(j) == 'i' && s.charAt(j + 1) == 'n' && s.charAt(j + 2) == 'g' && s.charAt(j + 3) == '\0')
				{
				s = tangible.StringFunctions.changeCharacter(s, j, '\0');
				}
			}
			System.out.printf("%s\n",s);
		}



		return 0;
	}


}

