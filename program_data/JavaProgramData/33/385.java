package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[10000][1000];
		int i = 0;
		int j = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0; i < n; i++)
		{
			while (s[i][j] != '\0')
			{
				if (s[i][j] == 'A')
				{
					s[i][j] = 'T';
				}
				else if (s[i][j] == 'T')
				{
					s[i][j] = 'A';
				}
				else if (s[i][j] == 'G')
				{
					s[i][j] = 'C';
				}
				else if (s[i][j] == 'C')
				{
					s[i][j] = 'G';
				}
				j++;
			}
		//	printf("%s\n", s[i]);
			j = 0;
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n", s[i]);
		}
		return 0;
	}
}

