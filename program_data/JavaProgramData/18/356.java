package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int flag = 0;
		int gl = new int(int num[][200],int n);
		for (i = 0;i < n;i++)
		{
			int sum = 0;
			int[][] num = new int[200][200];
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						num[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
			sum = gl(num, n);
			System.out.printf("%d\n",sum);
		}
	}

	public static int gl(int[][] num, int n)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int min = 0;
		int flag = 0;
		int sum = 0;
		for (flag = 0;flag < n - 1;flag++)
		{
		for (i = 0;i < n;i++)
		{
			min = num[i][0];
			for (j = 0;j < n;j++)
			{
				if (num[i][j] < min)
				{
					min = num[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				num[i][j] = num[i][j] - min;
			}
		}
		for (i = 0;i < n;i++)
		{
			min = num[0][i];
			for (j = 0;j < n;j++)
			{
				if (num[j][i] < min)
				{
					min = num[j][i];
				}
			}
			for (j = 0;j < n;j++)
			{
				num[j][i] = num[j][i] - min;
			}
		}
		sum += num[1][1];



			for (j = 0;j < n;j++)
			{
				for (i = 2;i < n;i++)
				{
					num[j][i - 1] = num[j][i];
				}
				num[j][i] = 0;
			}
			for (j = 0;j < n;j++)
			{
				for (i = 2;i < n;i++)
				{
					num[i - 1][j] = num[i][j];
				}
				num[j][i] = 0;
			}
		}
				return sum;
	}

}

