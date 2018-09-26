package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		String a = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == 'A' || a.charAt(j) == 'T')
				{
					if (a.charAt(j) == 'T')
					{
						a = tangible.StringFunctions.changeCharacter(a, j, 'A');
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, j, 'T');
					}
				}
				if (a.charAt(j) == 'G' || a.charAt(j) == 'C')
				{
					if (a.charAt(j) == 'C')
					{
						a = tangible.StringFunctions.changeCharacter(a, j, 'G');
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, j, 'C');
					}
				}
			}
			System.out.printf("%s\n",a);
		}
		return 0;
	}
}

