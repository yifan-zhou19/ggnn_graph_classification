package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[33]);
		String r = new String(new char[33]);
		int i;
		int n;
		int j;
		int l;
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
			for (j = 0;s.charAt(j);j++)
			{
				r = tangible.StringFunctions.changeCharacter(r, j, s.charAt(j));
			}
			for (j = 0;s.charAt(j);j++)
			{
				if (s.charAt(j) == 'e' && s.charAt(j + 1) == 'r' && j == l - 1 - 1)
				{
					r = tangible.StringFunctions.changeCharacter(r, j, '\0');
				}
				if (s.charAt(j) == 'l' && s.charAt(j + 1) == 'y' && j == l - 1 - 1)
				{
					r = tangible.StringFunctions.changeCharacter(r, j, '\0');
				}
				if (s.charAt(j) == 'i' && s.charAt(j + 1) == 'n' && s.charAt(j + 2) == 'g' && j == l - 1 - 2)
				{
					r = tangible.StringFunctions.changeCharacter(r, j, '\0');
				}
			}
			System.out.printf("%s\n",r);
		}
		return 0;
	}
}

