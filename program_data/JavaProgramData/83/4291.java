package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double G = 0;
		double P = 0;
		double k;
		double[] c = new double[10];
		int[] a = new int[10];
		int[] b = new int[10];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int m = 1;m <= n;m++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[m] = Integer.parseInt(tempVar3);
			}
		}
		for (int p = 1;p <= n;p++)
		{
			if (b[p] >= 90 && b[p] <= 100)
			{
				c[p] = 4.0 * a[p];
			}
			else if (b[p] >= 85 && b[p] <= 89)
			{
				c[p] = 3.7 * a[p];
			}
			else if (b[p] >= 82 && b[p] <= 84)
			{
				c[p] = 3.3 * a[p];
			}
			else if (b[p] >= 78 && b[p] <= 81)
			{
				c[p] = 3.0 * a[p];
			}
			else if (b[p] >= 75 && b[p] <= 77)
			{
				c[p] = 2.7 * a[p];
			}
			else if (b[p] >= 72 && b[p] <= 74)
			{
				c[p] = 2.3 * a[p];
			}
			else if (b[p] >= 68 && b[p] <= 71)
			{
				c[p] = 2.0 * a[p];
			}
			else if (b[p] >= 64 && b[p] <= 67)
			{
				c[p] = 1.5 * a[p];
			}
			else if (b[p] >= 60 && b[p] <= 63)
			{
				c[p] = 1.0 * a[p];
			}
			else
			{
				c[p] = 0;
			}
		}
		for (int q = 1;q <= n;q++)
		{
			G = G + c[q];
		}
		for (int x = 1;x <= n;x++)
		{
			P = P + a[x];
		}
		k = 1.0 * G / P;
		System.out.printf("%.2lf",k);
		return 0;
	}
}

