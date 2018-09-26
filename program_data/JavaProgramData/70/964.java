package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double distance = new double(double,double,double,double);
		int n;
		int i;
		int j;
		double[][] a = new double[50][2];
		double max = 0;
		double temp;
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
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n;j++)
			{
				temp = distance(a[i][0], a[i][1], a[j][0], a[j][1]);
			if (temp > max)
			{
				max = temp;
			}
			}
		}
		System.out.printf("%.4f\n",max);
	}
	public static double distance(double a,double b,double c,double d)
	{
		double k;
		k = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
		return (k);
	}
}

