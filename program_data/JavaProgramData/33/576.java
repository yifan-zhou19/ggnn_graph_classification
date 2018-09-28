package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (int m = 0;m < s.length();m++)
			{
				if (s.charAt(m) == 'A')
				{
					s = tangible.StringFunctions.changeCharacter(s, m, 'T');
				}
				else if (s.charAt(m) == 'T')
				{
					s = tangible.StringFunctions.changeCharacter(s, m, 'A');
				}
				else if (s.charAt(m) == 'C')
				{
					s = tangible.StringFunctions.changeCharacter(s, m, 'G');
				}
				else if (s.charAt(m) == 'G')
				{
					s = tangible.StringFunctions.changeCharacter(s, m, 'C');
				}
			}
			System.out.println(s);
		}
		return 0;
	}
}

