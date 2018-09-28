package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int n;
		String a = new String(new char[1000]);
		char[][] b = new char[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
					b[i][j] = 'T';
				}
				else if (a.charAt(j) == 'T')
				{
					b[i][j] = 'A';
				}
				else if (a.charAt(j) == 'C')
				{
					b[i][j] = 'G';
				}
				else if (a.charAt(j) == 'G')
				{
					b[i][j] = 'C';
				}

			}
			b[i][j] = '\0';
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;b[i][j] != '\0';j++)
			{
					System.out.printf("%c",b[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

