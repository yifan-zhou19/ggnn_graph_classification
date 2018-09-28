package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int k;
		int p = 0;
		int m = 0;
		int n = 0;
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}

		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{

				for (k = 1;k < 6;k++)
				{
					if (k == j && j != 5)
					{
						k++;
					}
					else if (j == 5 && k == 5)
					{
						break;
					}
					if (a[i][j] > a[i][k])
					{
						p++;
					}
				}
				if (p == 4)
				{
					for (k = 1;k < 6;k++)
					{
						if (k == i)
						{
							k++;
						}
						if (a[i][j] < a[k][j])
						{
							m++;
						}
					}
					if (m == 4)
					{
						 System.out.printf("%d %d %d\n",i,j,a[i][j]);
						n++;
					}
				}
				p = 0;
				m = 0;
			}
		}


		if (n == 0)
		{
			System.out.print("not found\n");
		}
	}





}

