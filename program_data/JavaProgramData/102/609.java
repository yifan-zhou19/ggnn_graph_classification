package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int d;
		int b;
		double[] a = new double[100];
		double[] m = new double[100];
		double[] f = new double[100];
		double c;
		char[][] s = new char[100][100];
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][0] == 'f')
			{
		f[j] = a[i];
		j++;
			}
			if (s[i][0] == 'm')
			{
		m[k] = a[i];
		k++;
			}
		}
		for (d = 1;d <= k;d++)
		{
			for (b = 0;b < k - d;b++)
			{
				if (m[b] > m[b + 1])
				{
					c = m[b + 1];
					m[b + 1] = m[b];
					m[b] = c;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%.2lf ",m[i]);
		}
		for (d = 1;d <= j;d++)
		{
			for (b = 0;b < j - d;b++)
			{
				if (f[b] < f[b + 1])
				{
					c = f[b + 1];
					f[b + 1] = f[b];
					f[b] = c;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
		System.out.printf("%.2lf ",f[i]);
		}
		System.out.printf("%.2lf",f[j - 1]);
	return 0;
	}

}

