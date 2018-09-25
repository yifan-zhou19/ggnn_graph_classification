package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int p;
		int q;
		double[] h = new double[40];
		double[] n = new double[40];
		double[] f = new double[40];
		double s;
		char[][] a = new char[40][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
		}
		j = 0;
		k = 0;
		for (i = 0;i < t;i++)
		{
			if (a[i][0] == 'm')
			{
				n[j] = h[i];
				j++;
			}
			if (a[i][0] == 'f')
			{
				f[k] = h[i];
				k++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (p = j - 1;p > i;p--)
			{
				if (n[p] < n[p - 1])
				{
					s = n[p];
					n[p] = n[p - 1];
					n[p - 1] = s;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",n[i]);
		}
		for (i = 0;i < k;i++)
		{
			for (q = k - 1;q > i;q--)
			{
				if (f[q] > f[q - 1])
				{
					s = f[q];
					f[q] = f[q - 1];
					f[q - 1] = s;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.2lf",f[i]);
			if (i != (k - 1))
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

