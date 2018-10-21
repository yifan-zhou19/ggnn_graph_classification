package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[33]);
		int c;
		int i;
		int j;
		int t;
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
			c = s.length();
			if ((s.charAt(c - 2) == 'e' && s.charAt(c - 1) == 'r') || (s.charAt(c - 2) == 'l' && s.charAt(c - 1) == 'y'))
			{
				s = tangible.StringFunctions.changeCharacter(s, c - 2, '\0');
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, c - 3, '\0');
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}
}

