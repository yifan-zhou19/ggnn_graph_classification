package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String s = new String(new char[MAX + 1]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			s = new Scanner(System.in).nextLine();
			for (j = 0;s.charAt(j);j++)
			{
				switch (s.charAt(j))
				{
				case'A':
				s = tangible.StringFunctions.changeCharacter(s, j, 'T');
				break;
				case'T':
				s = tangible.StringFunctions.changeCharacter(s, j, 'A');
				break;
				case'C':
				s = tangible.StringFunctions.changeCharacter(s, j, 'G');
				break;
				case'G':
				s = tangible.StringFunctions.changeCharacter(s, j, 'C');
				break;
				}
			}
			System.out.println(s);
		}
		return 0;

	}

}

