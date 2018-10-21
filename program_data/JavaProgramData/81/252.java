package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int k;
		int m;
		int n;
		int t;
		int a;
		int[][] x = new int[500][500];
		int[] y = new int[10];


		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a >= 0 && a <= 4 && b >= 0 && b <= 4)
		{
			j = 0;

			for (j = 0;j <= 4;j++)
			{
			y[j] = x[a][j];
			x[a][j] = x[b][j];
			x[b][j] = y[j];
			}
		i = 0;
		j = 0;
			for (i = 0;i <= 4;i++)
			{
			for (j = 0;j <= 4;j++)
			{
				if (j == 0)
				{
					System.out.printf("%d",x[i][j]);
				}
				else
				{
					if (j == 4)
					{
						System.out.printf(" %d\n",x[i][j]);
					}
				else
				{
					System.out.printf(" %d",x[i][j]);
				}
				}
			}
			}
		}
		else
		{
			System.out.print("error");
		}


		return 0;
	}

}

