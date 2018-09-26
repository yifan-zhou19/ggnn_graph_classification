package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int K = 0;
		double G;
		double S = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		double[] c = new double[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90)
			{
				c[i] = 4.0;
			}
			else if (b[i] >= 85)
			{
				c[i] = 3.7;
			}
			else if (b[i] >= 82)
			{
				c[i] = 3.3;
			}
			else if (b[i] >= 78)
			{
				c[i] = 3.0;
			}
			else if (b[i] >= 75)
			{
				c[i] = 2.7;
			}
			else if (b[i] >= 72)
			{
				c[i] = 2.3;
			}
			else if (b[i] >= 68)
			{
				c[i] = 2.0;
			}
			else if (b[i] >= 64)
			{
				c[i] = 1.5;
			}
			else if (b[i] >= 60)
			{
				c[i] = 1.0;
			}
			else
			{
				c[i] = 0.0;
			}
		}
		for (i = 0;i < n;i++)
		{
			S = S + 1.0 * a[i] * c[i];
		}
		for (i = 0;i < n;i++)
		{
			K = K + a[i];
		}
		G = 1.0 * S / K;
		System.out.printf("%.2lf",G);
		return 0;
	}

}

