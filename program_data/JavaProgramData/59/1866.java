package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int c = 0;
		int l;
		int[][] b = new int[106][106];
		char[][] room = new char[106][106];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					room[i][j] = tempVar2.charAt(0);
				}
				if (room[i][j] == '@')
				{
					b[i][j] = 1;
				}
			}
			scanf("\n");
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= n + 1;i++)
		{
			room[0][i] = '#';
			room[n + 1][i] = '#';
			room[i][0] = '#';
			room[i][n + 1] = '#';
		}
		for (l = 2;l <= m;l++)
		{
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (room[i][j] == '@')
				{
				if (room[i][j - 1] != '#')
				{
					b[i][j - 1] = 1;
				}
				if (room[i][j + 1] != '#')
				{
					b[i][j + 1] = 1;
				}
				if (room[i - 1][j] != '#')
				{
					b[i - 1][j] = 1;
				}
				if (room[i + 1][j] != '#')
				{
					b[i + 1][j] = 1;
				}
				}
			}
		}

	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (b[i][j] == 1)
			{
				room[i][j] = '@';
			}
		}
	}
		}
		 for (i = 1;i <= n;i++)
		 {
			 for (j = 1;j <= n;j++)
			 {
				 if (b[i][j] == 1)
				 {
					 c++;
				 }
			 }
		 }

		System.out.printf("%d",c);
		return 0;

	}










}

