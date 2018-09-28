package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] a = new char[1000][300];
		char[][] b = new char[1000][300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int m;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0,m = 0;a[i][j];j++)
			{
				if (a[i][j] == 'A')
				{
					b[i][m] = 'T';
					m++;
				}
				if (a[i][j] == 'T')
				{
					b[i][m] = 'A';
					m++;
				}
				if (a[i][j] == 'C')
				{
					b[i][m] = 'G';
					m++;
				}
				if (a[i][j] == 'G')
				{
					b[i][m] = 'C';
					m++;
				}
			}
			b[i][m] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
		return 0;
	}

}

