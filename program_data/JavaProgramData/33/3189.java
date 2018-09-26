package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int l;
		String s = new String(new char[300]);
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
			for (j = 0;j < l;j++)
			{
				if (s.charAt(j) == 'A')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) + 19);
				}
				else if (s.charAt(j) == 'T')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 19);
				}
				else if (s.charAt(j) == 'C')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) + 4);
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 4);
				}
			}
			System.out.printf("%s\n", s);
		}
		return 0;
	}

}

