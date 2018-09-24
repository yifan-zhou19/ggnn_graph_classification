package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[][] a = new int[10][3];
		int i;
		int j;
		int[][] x = new int[100][2];
		int k = 0;
		int s;
		double[] d = new double[100];
		double t;
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
				d[k] = Math.sqrt((double)((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2])));
				x[k][0] = i;
				x[k][1] = j;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
			if (d[j] < d[j + 1])
			{
			t = d[j];
			d[j] = d[j + 1];
			d[j + 1] = t;
			s = x[j][0];
			x[j][0] = x[j + 1][0];
			x[j + 1][0] = s;
			s = x[j][1];
			x[j][1] = x[j + 1][1];
			x[j + 1][1] = s;
			}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[x[i][0]][0],a[x[i][0]][1],a[x[i][0]][2],a[x[i][1]][0],a[x[i][1]][1],a[x[i][1]][2],d[i]);
		}
	}

}

