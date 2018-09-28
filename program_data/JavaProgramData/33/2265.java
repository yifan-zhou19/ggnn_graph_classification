package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		char[][] b = new char[10000][256];
		int n;
		int i;
		int j;
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
				a = tempVar2.charAt(0);
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) == 'A')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'T');
				}
				else if (a.charAt(j) == 'T')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'A');
				}
				else if (a.charAt(j) == 'C')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'G');
				}
				else if (a.charAt(j) == 'G')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'C');
				}
			}
			b[i] = a;
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(b[i]);
		}
		return 0;
	}

}

