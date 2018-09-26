package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[N][M];
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
			for (j = 0;a[i][j];j++)
			{
				if (a[i][j] == 'A')
				{
					a[i][j] = 'T';
				}
				else if (a[i][j] == 'T')
				{
					a[i][j] = 'A';
				}
				else if (a[i][j] == 'C')
				{
					a[i][j] = 'G';
				}
				else if (a[i][j] == 'G')
				{
						a[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%s\n",a[i]);
		}
	return 0;
	}
}

