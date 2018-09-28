package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String z = new String(new char[256]);
		String x = new String(new char[256]);
		char A;
		char T;
		char C;
		char G;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			z = new Scanner(System.in).nextLine();
			for (j = 0;z.charAt(j);j++)
			{
				if (z.charAt(j) == 'A')
				{
					x = tangible.StringFunctions.changeCharacter(x, j, 'T');
				}
				if (z.charAt(j) == 'T')
				{
					x = tangible.StringFunctions.changeCharacter(x, j, 'A');
				}
				if (z.charAt(j) == 'C')
				{
					x = tangible.StringFunctions.changeCharacter(x, j, 'G');
				}
				if (z.charAt(j) == 'G')
				{
					x = tangible.StringFunctions.changeCharacter(x, j, 'C');
				}
			}
			x = tangible.StringFunctions.changeCharacter(x, j, '\0');
			System.out.printf("%s\n",x);
		}
		return 0;
	}
}

