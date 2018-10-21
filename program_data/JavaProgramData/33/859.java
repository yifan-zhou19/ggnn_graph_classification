package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		char A = 'A';
		char T = 'T';
		char C = 'C';
		char G = 'G';
		String s = new String(new char[MAX + 1]);
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
				switch (s.charAt(j))
				{
				case'A':
				s = tangible.StringFunctions.changeCharacter(s, j, T);
				break;
				case'T':
				s = tangible.StringFunctions.changeCharacter(s, j, A);
				break;
				case'C':
				s = tangible.StringFunctions.changeCharacter(s, j, G);
				break;
				case'G':
				s = tangible.StringFunctions.changeCharacter(s, j, C);
				break;
				}
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}



}

