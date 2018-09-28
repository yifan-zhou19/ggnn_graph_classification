package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] p = new int[5][81]; //?????????
		int m; //m??????????? n???????
		int n;
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

		int i; //??????
		int j;
		int k;
		for (i = 0;i <= n;i++)
		{
			for (j = 0;j < 81;j++)
			{
							 p[i][j] = 0;
			}

			//??????????????
		}
		p[0][40] = m; //??????????????
		int add; //??
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 81;i++)
			{
				add = p[k][i];

					p[k + 1][i] += 2 * add;
					p[k + 1][i - 1] += add;
					p[k + 1][i + 1] += add;
					p[k + 1][i - 8] += add;
					p[k + 1][i - 9] += add;
					p[k + 1][i - 10] += add;
					p[k + 1][i + 8] += add;
					p[k + 1][i + 9] += add;
					p[k + 1][i + 10] += add;


			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				System.out.printf("%d",p[n][i * 9 + j]);
				if (j < 8)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
	}


}

