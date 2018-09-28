package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		double[][] a = new double[100][2];
		double[][] d = new double[100][100];
		double m = 0;
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
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
			//printf("%f %f",s,t);
		}
		for (i = 0;i < n - 1;i++)
		{
		for (j = i + 1;j < n;j++)
		{
			d[i][j] = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
			//printf("%.4f\n",d[i][j]);
			if (d[i][j] > m)
			{
				m = d[i][j];
			}
		}
		}
		m = Math.sqrt(m);
		System.out.printf("%.4f\n",m);
	}

}

