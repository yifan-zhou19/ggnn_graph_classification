package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char s;
		char[][] l = new char[1000][256];
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
				l[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;(s = l[i][j]) != '\0';j++)
			{
				if (l[i][j] == 'A')
				{
					l[i][j] = 'T';
				}
				else if (l[i][j] == 'T')
				{
					l[i][j] = 'A';
				}
				if (l[i][j] == 'C')
				{
					l[i][j] = 'G';
				}
				else if (l[i][j] == 'G')
				{
					l[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n", l[i]);
		}
		return 0;
	}
}

