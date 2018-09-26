package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String a = new String(new char[256]);
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			final String b = "";
			len = 0;
			a = new Scanner(System.in).nextLine();
			len = a.length();
			for (j = 0;j < len;j++)
			{
				if (a.charAt(j) == 'A')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'T');
				}
				else if (a.charAt(j) == 'T')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'A');
				}
				else if (a.charAt(j) == 'G')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'C');
				}
				else if (a.charAt(j) == 'C')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'G');
				}
			}
			System.out.println(b);
		}
		return 0;
	}
}

