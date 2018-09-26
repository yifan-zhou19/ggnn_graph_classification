package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] num = new int[100][100];
		int flag = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
			//num[i][n] = -10;

		}

		//for(j = 0; j<=n; j++)
		//{
			//num[m][j] = -10;
		//}


		i = 0;
		j = 0;
		flag = 1;
		while (true)
		{
			if (num[i][j] != -10)
			{
				System.out.printf("%d\n", num[i][j]);
				num[i][j] = -10;
			}
			else
			{
				break;
			}

			if (flag == 1)
			{
				if (j + 1 < n && num[i][j + 1] != -10)
				{
					j++;
				}
				else if (i + 1 < m)
				{
					i++;
					flag = 2;
				}
			}
			else if (flag == 2)
			{
				if (i + 1 < m && num[i + 1][j] != -10)
				{
					i++;
				}
				else if (j - 1 >= 0)
				{
					j--;
					flag = 3;
				}
			}
			else if (flag == 3)
			{
				if (j - 1 >= 0 && num[i][j - 1] != -10)
				{
					j--;
				}
				else if (i - 1 >= 0)
				{
					i--;
					flag = 4;
				}
			}
			else if (flag == 4)
			{
				if (i - 1 >= 0 && num[i - 1][j] != -10)
				{
					i--;
				}
				else if (j + 1 < n)
				{
					j++;
					flag = 1;
				}
			}

		}

		return 0;
	}

}

