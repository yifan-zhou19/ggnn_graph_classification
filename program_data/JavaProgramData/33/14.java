package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int oper = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[257]);
		s = new Scanner(System.in).nextLine();
		for (i = 0; i < n; i++)
		{
			s = new Scanner(System.in).nextLine();
			for (j = 0; j < s.length(); j++)
			{
				switch (s.charAt(j))
				{
				case 'C':
					s = tangible.StringFunctions.changeCharacter(s, j, 'G');
					break;
				case 'G':
					s = tangible.StringFunctions.changeCharacter(s, j, 'C');
					break;
				case 'A':
					s = tangible.StringFunctions.changeCharacter(s, j, 'T');
					break;
				case 'T':
					s = tangible.StringFunctions.changeCharacter(s, j, 'A');
					break;
				}
			}
			if (oper != 0)
			{
				System.out.print("\n");
			}
			oper = 1;
			System.out.printf("%s", s);
		}
		return 0;
	}

}

