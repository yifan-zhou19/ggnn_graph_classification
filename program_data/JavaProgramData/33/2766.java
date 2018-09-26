package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		String s = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			scanf("\n");
			m = s.length();
			for (j = 0;j < m;j++)
			{
				if (s.charAt(j) == 'A')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, 'T');
					continue;
				}
				else if (s.charAt(j) == 'T')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, 'A');
					continue;
				}
				else if (s.charAt(j) == 'C')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, 'G');
					continue;
				}
				else if (s.charAt(j) == 'G')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, 'C');
					continue;
				}
			}
			System.out.printf("%s",s);
			System.out.print("\n");
		}
		return 0;
	}

}

