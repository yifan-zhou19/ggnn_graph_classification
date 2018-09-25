package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int y;
		int w;
		int[][] a = new int[100][60];
		int[][] sum = new int[100][60];
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (k = 0;k < m;k++)
				{
					sum[i][k] = a[i][k] + 3 * k;
					if (sum[i][k] >= 57)
					{
						w = 60 - sum[i][k];
						if (w < 0)
						{
							System.out.printf("%d\n",60 - 3 * k);
							break;
						}
						else
						{
							System.out.printf("%d\n",60 - 3 * k - w);
							break;
						}

					}
					else
					{
						if (k == m - 1)
						{
							System.out.printf("%d\n",60 - (k + 1) * 3);
						}
					}


				}

			}
		}
	}




}

