package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[300]);
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			for (j = 0;j <= l;j++)
			{
				if (a.charAt(j) == 'A')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'T');
					System.out.printf("%c", a.charAt(j));
				}
				else if (a.charAt(j) == 'T')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'A');
					System.out.printf("%c", a.charAt(j));
				}
				else if (a.charAt(j) == 'C')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'G');
					System.out.printf("%c", a.charAt(j));
				}
				else if (a.charAt(j) == 'G')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'C');
					System.out.printf("%c", a.charAt(j));
				}
			}
			System.out.print("\n");
		}

	return 0;
	}
}

