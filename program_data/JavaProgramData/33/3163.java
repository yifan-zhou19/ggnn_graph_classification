package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String s = new String(new char[255]);
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
			int len = s.length();
			final String s1 = "";
			for (int j = 0;j < len;j++)
			{
				if (s.charAt(j) == 'A')
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j, 'T');
				}
				else if (s.charAt(j) == 'T')
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j, 'A');
				}
				else if (s.charAt(j) == 'C')
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j, 'G');
				}
				else if (s.charAt(j) == 'G')
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j, 'C');
				}
			}
			System.out.printf("%s\n", s1);
		}
		return 0;
	}
}

