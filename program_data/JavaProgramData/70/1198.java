package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int l;
	int n;
	double[] x = new double[100];
	double[] y = new double[100];
	double dis;
	double sum;
	double xj;
	double yj;
	double zdj = 0;
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
			x[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[i] = Double.parseDouble(tempVar3);
		}
		for (j = 0;j < i;j++)
		{
			xj = x[i] - x[j];
		yj = y[i] - y[j];
		dis = Math.sqrt(xj * xj + yj * yj);
		if (dis > zdj)
		{
			zdj = dis;
		}
		}
	}
		System.out.printf("%.4lf", zdj);
			return 0;
	}
}

