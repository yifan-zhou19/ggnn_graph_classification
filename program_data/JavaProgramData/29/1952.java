package <missing>;

public class GlobalMembers
{
	public static double dosum(int n)
	{
		int i;
		int co = 2;
		double[] a = new double[1000];
		double[] b = new double[1000];
		double sum = 0;
		a[0] = 2;
		a[1] = 3;
		b[0] = 1;
		b[1] = 2;
		for (i = 2;; i++)
		{
			if (co == n)
			{
				break;
			}
			a[i] = a[i - 1] + a[i - 2];
			b[i] = b[i - 1] + b[i - 2];
			co += 1;
		}
		for (i = 0; i < n; i++)
		{
			sum = sum + a[i] / b[i];
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		double[] a = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

			for (i = 1; i <= n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				if (m == 1)
				{
					a[0] = 2.000;
				}
				else
				{
					a[i - 1] = dosum(m);
				}
			}
			for (i = 0; i <= n - 1; i++)
			{
				System.out.printf("%.3lf\n", a[i]);
			}
	}
}

