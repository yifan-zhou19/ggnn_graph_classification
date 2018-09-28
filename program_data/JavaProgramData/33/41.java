package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] s = new char[1000][256];
		char[][] b = new char[1000][256];
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
				s[i] = tempVar2.charAt(0);
			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;s[i][j] != '\0';j++)
			{
				if (s[i][j] == 'A')
				{
					b[i][j] = 'T';
				}
				else if (s[i][j] == 'T')
				{
					b[i][j] = 'A';
				}
				else if (s[i][j] == 'G')
				{
					b[i][j] = 'C';
				}
				else if (s[i][j] == 'C')
				{
					b[i][j] = 'G';
				}
			}
			b[i][j] = '\0';

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",b[i]);
		}

		return 0;
	}
}

