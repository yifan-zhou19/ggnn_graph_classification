public class raul
{
		public double a1;
		public double a2;
		public double b1;
		public double b2;
		public double c;
}

package <missing>;

public class GlobalMembers
{
		public static raul[] dian = tangible.Arrays.initializeWithDefaultraulInstances(100);
		public static raul t = new raul();

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		double[][] a = new double[50][2];
		for (i = 1;i <= n;i++)
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		int j;
		int m = 1;
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				dian[m].a1 = a[i][0];
				dian[m].a2 = a[i][1];
				dian[m].b1 = a[j][0];
				dian[m].b2 = a[j][1];
				dian[m].c = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
				dian[m].c = Math.sqrt(dian[m].c);
				m++;
			}
		}
		double max = dian[1].c;
		for (i = 2;i <= m;i++)
		{
			if (dian[i].c > max)
			{
				max = dian[i].c;
			}
		}
		System.out.printf("%.4f", max);
		return 0;
	}
}

