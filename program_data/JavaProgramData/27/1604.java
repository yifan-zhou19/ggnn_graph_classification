package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[][] a = new double[100][3];
		double x1;
		double x2;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2] > 0)
			{
				x1 = (-a[i][1] + Math.sqrt(a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2])) / (2 * a[i][0]);
				x2 = (-a[i][1] - Math.sqrt(a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2])) / (2 * a[i][0]);
				System.out.printf("x1=%.5lf;",x1);
				System.out.printf("x2=%.5lf\n",x2);
			}
			if (a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2] == 0)
			{
				x1 = (-a[i][1]) / (2 * a[i][0]);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2] < 0)
			{
				if (a[i][1] == 0)
				{
					y = (Math.sqrt(-a[i][1] * a[i][1] + 4 * a[i][0] * a[i][2])) / (2 * a[i][0]);
					System.out.printf("x1=0.00000+%.5lfi;",y);
					System.out.printf("x2=0.00000-%.5lfi\n",y);
				}
				else if (a[i][1] != 0)
				{
					x1 = (-a[i][1]) / (2 * a[i][0]);
					y = (Math.sqrt(-a[i][1] * a[i][1] + 4 * a[i][0] * a[i][2])) / (2 * a[i][0]);
					System.out.printf("x1=%.5lf+%.5lfi;",x1,y);
					System.out.printf("x2=%.5lf-%.5lfi\n",x1,y);
				}
			}
		}
		return 0;
	}
}

