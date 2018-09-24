package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[1000][256];

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			for (j = 0;j < 256;j++)
			{
				if (s[i][j] == 'A')
				{
					s[i][j] = 'T';
				}
				else if (s[i][j] == 'T')
				{
					s[i][j] = 'A';
				}
				else if (s[i][j] == 'C')
				{
					s[i][j] = 'G';
				}
				else if (s[i][j] == 'G')
				{
					s[i][j] = 'C';
				}
				if (s[i][j] == '\0')
				{
					s[i][j] = '\0';
					break;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}






		return 0;
	}
}

