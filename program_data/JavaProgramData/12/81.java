package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int sum = 0;
		int[][] a = new int[20][20];
		int[] b = new int[20];
		for (i = 0;;i++)
		{
			for (j = 0;;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				if (a[i][j] == -1)
				{
					m = i;
					break;
				}
				if (a[i][j] == 0)
				{
					b[i] = j;
					break;
				}


			}
			if (a[i][j] == -1)
			{
				break;
			}


		}



		for (i = 0;i < m;i++)
		{
			sum = 0;
			for (j = 0;j < b[i];j++)
			{
				for (k = 0;k <= j;k++)
				{
					if (a[i][j] % a[i][k] == 0 && a[i][j] / a[i][k] == 2)
					{
						sum++;
					}
					else if (a[i][k] % a[i][j] == 0 && a[i][k] / a[i][j] == 2)
					{
						sum++;
					}
				}

			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

