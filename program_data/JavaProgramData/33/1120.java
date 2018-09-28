package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[1000][300];
		char[][] b = new char[1000][300];
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
				a[i] = tempVar2.charAt(0);
			}
			b[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				if (a[i][j] == 'A')
				{
					b[i][j] = 'T';
				}
				if (a[i][j] == 'T')
				{
					b[i][j] = 'A';
				}
				if (a[i][j] == 'C')
				{
					b[i][j] = 'G';
				}
				if (a[i][j] == 'G')
				{
					b[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
		return 0;
	}
}

