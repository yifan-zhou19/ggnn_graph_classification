package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String s = new String(new char[5000]);
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
			for (j = 0;s.charAt(j);j++)
			{
				if (s.charAt(j) == 'A')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, 'T');
				}
				else
				{
					if (s.charAt(j) == 'T')
					{
						s = tangible.StringFunctions.changeCharacter(s, j, 'A');
					}
					else
					{
						if (s.charAt(j) == 'C')
						{
							s = tangible.StringFunctions.changeCharacter(s, j, 'G');
						}
						else
						{
							s = tangible.StringFunctions.changeCharacter(s, j, 'C');
						}
					}
				}
			}
			System.out.printf("%s\n", s);
		}
		return 0;
	}
}

