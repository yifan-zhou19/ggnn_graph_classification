package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[max + 1]);
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n - .0.getValue() != 0)
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
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 'A'+'T');
				}
				else if (s.charAt(j) == 'T')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 'T'+'A');
				}
				else if (s.charAt(j) == 'G')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 'G'+'C');
				}
				else if (s.charAt(j) == 'C')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j) - 'C'+'G');
				}
			}

		System.out.printf("%s\n",s);

		}
			return 0;
	}
}

