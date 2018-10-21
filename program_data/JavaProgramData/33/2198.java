package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char f = char x;
		int n;
		int i;
		int j;
		String s = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			s = new Scanner(System.in).nextLine();
			for (j = 0; s.charAt(j) != '\0'; j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, f(s.charAt(j)));
			}
			s = tangible.StringFunctions.changeCharacter(s, j, '\0');
			System.out.println(s);
		}
	}
	public static char f(char x)
	{
		switch (x)
		{
		case 'A':
			return 'T';
			break;
		case 'T':
			return 'A';
			break;
		case 'C':
			return 'G';
			break;
		case 'G':
			return 'C';
			break;
		}
	}
}

