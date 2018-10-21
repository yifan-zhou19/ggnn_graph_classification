package <missing>;

public class GlobalMembers
{
	public static void jisuanb(double[] b, int n, double[] a)
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			a[i + 2] = a[i] + a[i + 1];
			b[i] = a[i + 1] / a[i];
		}
	}
	public static int Main()
	{
		double sum = 0;
		double[] b = new double[100];
		double[] a = new double[100];
		int m;
		int i;
		int[] n = new int[100];
		a[1] = 1;
		a[2] = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			sum = 0;
			jisuanb(b, n[i], a);
			int j;
			for (j = 0;j < n[i];j++)
			{
	//			printf("xunhuan\n");
				sum += b[j + 1];
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}
}

