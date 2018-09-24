package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		double[][] a = new double[50][3];
		double x1;
		double x2;
		double s1;
		double s2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (e = 0;e < 3;e++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][e] = Double.parseDouble(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2] >= 0)
			{
				x1 = (-a[i][1] + Math.sqrt(a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2])) / (2 * a[i][0]);
				x2 = (-a[i][1] - Math.sqrt(a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2])) / (2 * a[i][0]);
				if (x1 != x2)
				{
					System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				}
				else
				{
					System.out.printf("x1=x2=%.5lf\n",x1);
				}
			}
			else
			{
				s1 = -a[i][1] / (2 * a[i][0]);
				s2 = Math.sqrt(4 * a[i][0] * a[i][2] - a[i][1] * a[i][1]) / (2 * a[i][0]);
				if (s1 == 0)
				{
					s1 = -s1;
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",s1,s2,s1,s2);
			}
		}
		return 0;
	}
}

