public class dian
{
	public double x;
	public double y;

}

package <missing>;

public class GlobalMembers
{
	public static dian[] dian = tangible.Arrays.initializeWithDefaultdianInstances(100);
	public static void Main()
	{
		double max = new double(double a[1000],int n);
		int n;
		int i;
		int j;
		int m = 0;
		double[] k = new double[1000];

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
				dian[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dian[i].y = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				k[m] = (dian[i].x - dian[j].x) * (dian[i].x - dian[j].x) + (dian[i].y - dian[j].y) * (dian[i].y - dian[j].y);
			m++;
			}
		}
		System.out.printf("%.4lf",Math.sqrt(max(k, m)));
	}
	public static double max(double[] a, int n)
	{
		int i;
		int j;
		double t;

			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
			if (a[j] < a[j + 1])
			{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
				}
			}
		   return a[0];
	}
}

