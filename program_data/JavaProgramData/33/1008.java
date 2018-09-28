package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[1000][1000];
		char[][] p = new char[1000][1000];
		int n;
		int i;
		int j;
		int[] m = new int[1000];
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
			m[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m[i];j++)
			{
				if (s[i][j] == 'A')
				{
					p[i][j] = 'T';
				}
				if (s[i][j] == 'T')
				{
					p[i][j] = 'A';
				}
				if (s[i][j] == 'C')
				{
					p[i][j] = 'G';
				}
				if (s[i][j] == 'G')
				{
					p[i][j] = 'C';
				}
				p[i][m[i]] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p[i]);
		}
		return 0;
	}

}

