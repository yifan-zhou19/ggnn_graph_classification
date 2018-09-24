package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[100][15];
		int i = 0;
		int j = 0;
		int x = 10;
		int k = 0;
		int m;
		int num = 0;
	for (i = 0;i < 100;i++)
	{
		if (x == -1)
		{
			break;
		}
		for (j = 0;j < 16;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			if (x == -1)
			{
				break;
			}
			if (x == 0)
			{
				break;
			}
			a[i][j] = x;
		}

	}
	k = i;
	for (i = 0;i < k - 1;i++)
	{
		for (j = 0;j < 15;j++)
		{
			for (m = j + 1;m < 15;m++)
			{
			if (a[i][j] * 1.0 / a[i][m] == 2 || a[i][m] * 1.0 / a[i][j] == 2)
			{
				num++;
			}
			}

		}
		System.out.printf("%d\n",num);
		num = 0;
	}

	}

}

