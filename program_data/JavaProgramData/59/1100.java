package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int patient = 0;
		int[][] flag = new int[103][103];
		char[][] room = new char[103][103];
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
				room[i] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}


		for (k = 1;k < m;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					flag[i][j] = 0;
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (room[i][j] == '@' && flag[i][j] == 0)
					{
						if (room[i - 1][j] == '.')
						{
							room[i - 1][j] = '@';
							flag[i - 1][j] = 1;
						}
						if (room[i + 1][j] == '.')
						{
							room[i + 1][j] = '@';
							flag[i + 1][j] = 1;
						}
						if (room[i][j - 1] == '.')
						{
							room[i][j - 1] = '@';
							flag[i][j - 1] = 1;
						}
						if (room[i][j + 1] == '.')
						{
							room[i][j + 1] = '@';
							flag[i][j + 1] = 1;
						}
					}
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '@')
				{
					patient++;
				}
			}
		}

		System.out.printf("%d",patient);

		return 0;
	}

}

