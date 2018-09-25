package <missing>;

public class GlobalMembers
{
	public static double dis(double a,double b,double c,double d)
	{
		double l = (a - c) * (a - c) + (b - d) * (b - d);
		return (l);
	}
	public static int Main()
	{
		int n;
		int m = 0;
		int i;
		int j;
		int k;
		int r;
		double[][] p = new double[10][2];
		double[] res = new double[100];
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
				p[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i][1] = Double.parseDouble(tempVar3);
			}
		}

		for (j = 0;j < n;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				res[m] = dis(p[j][0], p[j][1], p[k][0], p[k][1]);
				m++;
			}
		}
		for (i = 1;i < m;i++)
		{
			if (res[i] < res[i - 1])
			{
			   res[i] = res[i - 1];
			}
		}
		System.out.printf("%.4f",Math.sqrt(res[m - 1]));
	}
}

