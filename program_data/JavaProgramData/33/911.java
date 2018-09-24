package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String s = new String(new char[256]);
		char A;
		char G;
		char C;
		char T;
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
						s = tangible.StringFunctions.changeCharacter(s, j, 'T');
						break;
					case'G':
						s = tangible.StringFunctions.changeCharacter(s, j, 'C');
						break;
					case'C':
						s = tangible.StringFunctions.changeCharacter(s, j, 'G');
						break;
					case'T':
						s = tangible.StringFunctions.changeCharacter(s, j, 'A');
						break;
				}
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}
}

