package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[][] a = new double[100][3];
		double t;
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
			t = -a[i][1] / (2 * a[i][0]);
			if (a[i][1] == 0.0)
			{
				t = 0;
			}
			if (a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2] == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",t);
			}
			else if (a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2] > 0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",(-a[i][1] + Math.sqrt(a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2])) / (2 * a[i][0]),(-a[i][1] - Math.sqrt(a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2])) / (2 * a[i][0]));
			}
			else if (a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2] < 0)
			{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",t,Math.sqrt(4 * a[i][0] * a[i][2] - a[i][1] * a[i][1]) / (2 * a[i][0]),t,Math.sqrt(4 * a[i][0] * a[i][2] - a[i][1] * a[i][1]) / (2 * a[i][0]));
			}
		}
		return 0;
	}

}

