package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[101][101];
		char[][] map = new char[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar2 != null)
				{
					map[i][j] = tempVar2.charAt(0);
				}
				if (map[i][j] == '.')
				{
					a[i][j] = 1; //1??????
				}
				else if (map[i][j] == '#')
				{
					a[i][j] = 0; //0??????
				}
				else
				{
					a[i][j] = 2; //2???????
				}
			}
		}
		int m;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		m = m - 1;
		while (m-- != 0)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == 2)
					{
						if (a[i - 1][j] == 1)
						{
							a[i - 1][j] = 3; //3???????????
						}
						if (a[i + 1][j] == 1)
						{
							a[i + 1][j] = 3;
						}
						if (a[i][j - 1] == 1)
						{
							a[i][j - 1] = 3;
						}
						if (a[i][j + 1] == 1)
						{
							a[i][j + 1] = 3;
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == 3)
					{
						a[i][j] = 2;
					}
				}
			}





		}
		int num = 0;
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == 2)
					{
						num++;
					}
				}
		}
		System.out.printf("%d",num);



	}
}

