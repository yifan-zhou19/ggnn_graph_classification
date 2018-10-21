package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[10000][256];
	public static void Main()
	{
		int n;
		int i;
		int j;

		String p = new String(new char[256]);
		p = tangible.StringFunctions.changeCharacter(p, 'A', 'T');
		p = tangible.StringFunctions.changeCharacter(p, 'T', 'A');
		p = tangible.StringFunctions.changeCharacter(p, 'C', 'G');
		p = tangible.StringFunctions.changeCharacter(p, 'G', 'C');
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			for (j = 0;a[i][j] != '\0';j++)
			{
				System.out.printf("%c",p.charAt(a[i][j]));
				if (a[i][j + 1] == '\0')
				{
					System.out.print("\n");
				}
			}
		}


	}
}

