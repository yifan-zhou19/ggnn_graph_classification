package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
		int m = 1;
		int[] x = new int[100];
		int[] y = new int[100];
		int[][] location = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					location[i][j] = Integer.parseInt(tempVar2);
				}
				if (location[i][j] == 0)
				{
					x[k] = j;
					k++;
					y[m] = i;
					m++;
				}
			}
		}
		System.out.printf("%d\n",(y[m - 1] - y[1] - 1) * (x[k - 1] - x[1] - 1));
		return 0;
	}

}

