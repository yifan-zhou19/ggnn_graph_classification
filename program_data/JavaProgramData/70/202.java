package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int k;
		int p;
		int q;
		int t;
		int m;
		double[][] sta = new double[10][2];
		double[] dis = new double[45];
		double s;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sta[i][k] = Double.parseDouble(tempVar2);
				}
			}
		}
		m = 0;
		for (p = 0;p <= n - 1;p++)
		{
			for (t = p + 1;t <= n - 1;t++)
			{
				x = sta[p][0] - sta[t][0];
				y = sta[p][1] - sta[t][1];
				dis[m] = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
				m = m + 1;
			}
		}
		for (q = 0;q < m - 1;q++)
		{
			if (dis[q] > dis[q + 1])
			{
				s = dis[q + 1];
				dis[q + 1] = dis[q];
				dis[q] = s;
			}
		}
		System.out.printf("%.4f",dis[m - 1]);
	}
}

