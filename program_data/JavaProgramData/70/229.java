package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double[] d = new double[100];
		double[] f = new double[100];
		double a;
		double b;
		double m;
		int n;
		int i;
		int j;
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
				d[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f[i] = Double.parseDouble(tempVar3);
			}
		}
		m = (d[0] - d[1]) * (d[0] - d[1]) + (f[0] - f[1]) * (f[0] - f[1]);
		for (j = 2;j < n;j++)
		{
			for (i = 2;i <= j;i++)
			{
				a = (d[i] - d[i - 1]) * (d[i] - d[i - 1]) + (f[i] - f[i - 1]) * (f[i] - f[i - 1]);
				b = (d[i] - d[i - 2]) * (d[i] - d[i - 2]) + (f[i] - f[i - 2]) * (f[i] - f[i - 2]);
				if (a >= b != 0 && a >= m)
				{
					m = a;
				}
				if (b > a && b >= m)
				{
					m = b;
				}
				if (m > a && m > b)
				{
					m = m;
				}
			}
		}
		System.out.printf("%.4f",Math.sqrt(m));
	}
}

