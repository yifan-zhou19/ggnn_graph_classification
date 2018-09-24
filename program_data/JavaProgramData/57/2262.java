package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
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
			m = s.length();
			if (s.charAt(m - 1) == 'g')
			{
				s = tangible.StringFunctions.changeCharacter(s, m - 3, '\0');
				System.out.printf("%s\n",s);
			}
			else if (s.charAt(m - 1) == 'y')
			{
				s = tangible.StringFunctions.changeCharacter(s, m - 2, '\0');
				System.out.printf("%s\n",s);
			}
			else if (s.charAt(m - 1) == 'r')
			{
				s = tangible.StringFunctions.changeCharacter(s, m - 2, '\0');
				System.out.printf("%s\n",s);
			}
		}
		return 0;
	}
}

