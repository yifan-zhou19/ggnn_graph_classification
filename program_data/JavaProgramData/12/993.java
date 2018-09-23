package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[50][16];
		int[] b = new int[50];
		int[] c = new int[50];
		int i;
		int j;
		int m;
		int n;
		int o;
		int line;
		int num = 0;
		for (i = 0;i <= 49;i++)
		{
			for (j = 0;j <= 15;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				if (a[i][j] == 0 || a[i][j] == -1)
				{
					b[i] = j - 1;
					c[i] = 0;
					break;
				}
			}
			if (a[i][0] == -1)
			{
				break;
			}
			line = i;
		}
		for (m = 0;m <= line;m++)
		{
			for (n = 0;n <= b[m];n++)
			{
				for (o = 0;o <= b[m];o++)
				{
					if (a[m][n] == 2 * a[m][o])
					{
						c[m] = c[m] + 1;
					}
				}
			}
			System.out.printf("%d\n",c[m]);
		}
		return 0;
	}





}

