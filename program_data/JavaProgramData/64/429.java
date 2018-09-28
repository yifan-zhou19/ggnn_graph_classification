package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[10][3];
		int i;
		int j;
		int[][][] d = new int[45][2][2];
		int k = 0;
		int c;
		int x;
		int y;
		double z;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k][0][0] = i;
				d[k][0][1] = j;
				d[k][1][1] = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]);
				k++;

			}
		}
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - i - 1;j++)
			{
				if (d[j][1][1] < d[j + 1][1][1])
				{
					c = d[j][0][0];
					d[j][0][0] = d[j + 1][0][0];
					d[j + 1][0][0] = c;
					c = d[j][0][1];
					d[j][0][1] = d[j + 1][0][1];
					d[j + 1][0][1] = c;
					c = d[j][1][1];
					d[j][1][1] = d[j + 1][1][1];
					d[j + 1][1][1] = c;
				}

			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			z = Math.sqrt(d[i][1][1] * 1.0);
			x = d[i][0][0];
			y = d[i][0][1];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", a[x][0],a[x][1],a[x][2],a[y][0],a[y][1],a[y][2],z);
		}


		return 0;
	}
}

