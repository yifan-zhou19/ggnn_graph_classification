package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int sum;
		int[][] a = new int[100][100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (j = 0; ;)
		{
			if (j < col - 1)
			{
				sum = j;
				for (; ;)
				{
					if (sum >= 0 && j - sum < row)
					{
						System.out.printf("%d\n",a[j - sum][sum]);
						sum--;
					}
					else
					{
						break;
					}
				}
				j++;
			}
			else
			{
				break;
			}
		}
		for (i = 0; ;)
		{
			if (i <= row - 1)
			{
				sum = col - 1 + i;
				for (; ;)
				{
					if (sum >= 0 && col - 1 + i - sum < row)
					{
						if (sum <= col - 1)
						{
							System.out.printf("%d\n",a[col - 1 + i - sum][sum]);
						}
						sum--;
					}
					else
					{
						break;
					}
				}
				i++;
			}
			else
			{
				break;
			}
		}
		return 0;
	}
}

