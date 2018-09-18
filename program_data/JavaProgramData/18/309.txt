package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int min;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int tn;
		int sum;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			sum = 0;
			tn = n;
			while (tn > 1)
			{
				//guiling
				for (i = 0;i < tn;i++)
				{
					min = a[i][0];
					for (j = 0;j < tn;j++)
					{
						if (min > a[i][j])
						{
							min = a[i][j];
						}
					}
					for (j = 0;j < tn;j++)
					{
						a[i][j] -= min;
					}
				}
				for (i = 0;i < tn;i++)
				{
						min = a[0][i];
					for (j = 0;j < tn;j++)
					{
						if (min > a[j][i])
						{
							min = a[j][i];
						}
					}
					for (j = 0;j < tn;j++)
					{
						a[j][i] -= min;
					}
				}


				//xiaoxu
				sum += a[1][1];
				for (i = 1;i < tn - 1;i++)
				{
					for (j = 0;j < tn;j++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
				for (i = 1;i < tn - 1;i++)
				{
					for (j = 0;j < tn;j++)
					{
						a[j][i] = a[j][i + 1];
					}
				}
				tn--;
			}
			System.out.printf("%d\n",sum);
		}
	}

}

