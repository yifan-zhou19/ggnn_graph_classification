package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int sum;
	 int i;
	 int j;
	 int k;
	 int[][] a = new int[101][101];
	 int lenth;
	 int min;

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
		for (i = 1 ; i <= n ; i++)
		{
			sum = 0;
			lenth = n;

			for (j = 1 ; j <= n ; j++)
			{
				for (k = 1 ; k <= n ; k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}

			for (lenth = n ; lenth > 1 ; lenth--)
			{
				for (j = 1 ;j <= lenth ; j++)
				{
					min = 1000;
					for (k = 1 ; k <= lenth ; k++)
					{
						if (a[j][k] < min)
						{
							min = a[j][k];
						}
					}
					for (k = 1; k <= lenth ; k++)
					{
						if (a[j][k] != 0)
						{
							a[j][k] = a[j][k] - min;
						}
					}
				}
				for (j = 1 ;j <= lenth ; j++)
				{
					min = 1000;
					for (k = 1 ; k <= lenth ; k++)
					{
						if (a[k][j] < min)
						{
							min = a[k][j];
						}
					}
					for (k = 1; k <= lenth ; k++)
					{
						if (a[k][j] != 0)
						{
							a[k][j] = a[k][j] - min;
						}
					}
				}
				sum = sum + a[2][2];

				for (j = 1; j <= lenth ; j++)
				{
					for (k = 2; k <= lenth ; k++)
					{
						a[j][k] = a[j][k + 1];
					}
				}
				for (j = 2; j <= lenth ; j++)
				{
					for (k = 1; k <= lenth ; k++)
					{
						a[j][k] = a[j + 1][k];
					}
				}
			}
			System.out.printf("%d\n",sum);
		}


	 return 0;
	}

































}

