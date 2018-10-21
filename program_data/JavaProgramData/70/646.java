package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[100];
		double[] b = new double[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		k = n * (n - 1) / 2;
		double[] c = new double[1000];
		int l;
		l = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (p = i + 1;p < n;p++)
			{
				c[l] = (a[i] - a[p]) * (a[i] - a[p]) + (b[i] - b[p]) * (b[i] - b[p]);
				l++;
			}
		}

		for (l = 0;l < k - 1;l++)
		{
			if (c[l] > c[l + 1])
			{
				c[l + 1] = c[l];
			}
		}
		System.out.printf("%.4lf",Math.sqrt(c[k - 1]));
	}

}

