package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int[] c = new int[100];
		int m;
		int t = 0;
		for (i = 0;i < 5;i++)
		{
			m = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > a[i][m])
				{
					m = j;
				}
			}
			c[10 * i + m]++;
		}
		for (j = 0;j < 5;j++)
		{
			m = 0;
			for (i = 0;i < 5;i++)
			{
				if (a[i][j] < a[m][j])
				{
					m = i;
				}
			}
			c[10 * m + j]++;
		}
		for (i = 0;i < 100;i++)
		{
			if (c[i] > 1)
			{
				System.out.printf("%d %d %d\n",i / 10 + 1,i % 10 + 1,a[i / 10][i % 10]);
				t = 1;
			}
		}
		if (t == 0)
		{
			System.out.print("not found\n");
		}
		return 0;

	}
}

