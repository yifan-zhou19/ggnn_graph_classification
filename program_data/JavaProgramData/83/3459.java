package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] w = new int[10];
		int[] f = new int[10];
		int sw = 0;
		int i;
		int t;
		double ans;
		double[] j = new double[10];
		double a;
		double b;
		double sum = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i] = Integer.parseInt(tempVar2);
			}
			sw = sw + w[i];
		}
		for (t = 0;t <= n - 1;t++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f[t] = Integer.parseInt(tempVar3);
			}
			if (f[t] >= 90)
			{
				j[t] = 4.0;
			}
			if (f[t] >= 85 && f[t] <= 89)
			{
				j[t] = 3.7;
			}
			if (f[t] >= 82 && f[t] <= 84)
			{
				j[t] = 3.3;
			}
			if (f[t] >= 78 && f[t] <= 81)
			{
				j[t] = 3.0;
			}
			if (f[t] >= 75 && f[t] <= 77)
			{
				j[t] = 2.7;
			}
			if (f[t] >= 72 && f[t] <= 74)
			{
				j[t] = 2.3;
			}
			if (f[t] >= 68 && f[t] <= 71)
			{
				j[t] = 2.0;
			}
			if (f[t] >= 64 && f[t] <= 67)
			{
				j[t] = 1.5;
			}
			if (f[t] >= 60 && f[t] <= 63)
			{
				j[t] = 1.0;
			}
			if (f[t] >= 0 && f[t] <= 59)
			{
				j[t] = 0.0;
			}
			a = j[t];
			b = w[t];
			sum = sum + a * b;
		}
		ans = sum / sw;
		System.out.printf("%.2lf",ans);
		return 0;
	}



}

