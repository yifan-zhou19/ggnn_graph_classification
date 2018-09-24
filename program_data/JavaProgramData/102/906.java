package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[40][7];
		int k = 0;
		int l = 0;
		double[] d = new double[40];
		double[] e = new double[40];
		double[] f = new double[40];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(a[i],"male") == 0)
			{
				e[k] = d[i];
				k++;
			}
			else
			{
				f[l] = d[i];
				l++;
			}
		}
		int t;
		double p;
		for (i = 1;i <= k;i++)
		{
			for (t = 0;t < k - i;t++)
			{
				if (e[t] > e[t + 1])
				{
					p = e[t];
					e[t] = e[t + 1];
					e[t + 1] = p;
				}
			}
		}
		for (i = 1;i <= l;i++)
		{
			for (t = 0;t < l - i;t++)
			{
				if (f[t] < f[t + 1])
				{
					p = f[t];
					f[t] = f[t + 1];
					f[t + 1] = p;
				}
			}
		}
		System.out.printf("%.2lf",e[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(" %.2lf",e[i]);
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf(" %.2lf",f[i]);
		}
		return 0;
	}
}

