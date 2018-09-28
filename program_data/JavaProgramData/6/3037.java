package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][2];
		int[][] b = new int[100][100];
		int[] c = new int[100];
		int i;
		int j;
		int k;
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < a[i][0];j++)
			{
				for (k = 0;k < a[i][1];k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						b[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 0;j < a[i][1];j++)
			{
				c[i] = c[i] + b[0][j];
			}
			for (j = 0;j < a[i][1] && a[i][0] != 1;j++)
			{
				c[i] += b[a[i][0] - 1][j];
			}
			for (j = 1;j < a[i][0] - 1;j++)
			{
				c[i] = c[i] + b[j][0];
			}
			for (j = 1;j < a[i][0] - 1 && a[i][1] != 1;j++)
			{
				c[i] += b[j][a[i][1] - 1];
			}
			for (j = 0;j < 100;j++)
			{
				for (k = 0;k < 100;k++)
				{
					b[j][k] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
		return 0;
	}
}

