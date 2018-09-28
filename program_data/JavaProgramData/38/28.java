package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int[] n = new int[100];
		int i;
		int j;
		double[][] a = new double[100][1000];
		double[] s = new double[100];
		double f = new double(double x[],int k);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < num;i++)
		{
			System.out.printf("%.5f\n",f(a[i], n[i]));
		}
		return 0;
	}
	public static double f(double[] x, int k)
	{
		int i;
		double a;
		double sum = new double(double y[],int l);
		double s = 0;
		a = sum(x, k) / k;
		for (i = 0;i < k;i++)
		{
			s += Math.pow(x[i] - a,2);
		}
		s = Math.sqrt(s / k);
		return (s);
	}
	public static double sum(double[] y, int l)
	{
		int i;
		double c = 0;
		for (i = 0;i < l;i++)
		{
			c += y[i];
		}
		return (c);
	}
}

