package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[300]);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			i = s.length() - 1;
			if (s.charAt(i) == 'r')
			{
				s = tangible.StringFunctions.changeCharacter(s, i - 1, '\0');
			}
			if (s.charAt(i) == 'y')
			{
				s = tangible.StringFunctions.changeCharacter(s, i - 1, '\0');
			}
			if (s.charAt(i) == 'g')
			{
				s = tangible.StringFunctions.changeCharacter(s, i - 2, '\0');
			}
			System.out.printf("%s\n", s);
		}
		return 0;
	}
}

