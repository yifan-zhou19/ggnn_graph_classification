package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
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
			for (int j = 0;j < s.length();j++)
			{
				switch (s.charAt(j))
				{
					case'A':
					s = tangible.StringFunctions.changeCharacter(s, j, 'T');
					break;
					case'T':
					s = tangible.StringFunctions.changeCharacter(s, j, 'A');
					break;
					case'G':
					s = tangible.StringFunctions.changeCharacter(s, j, 'C');
					break;
					case'C':
					s = tangible.StringFunctions.changeCharacter(s, j, 'G');
					break;
				}
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}
}

