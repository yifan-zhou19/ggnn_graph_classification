package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
		int k = 0;
		int l;
		double t;
		char[][] a = new char[100][10];
		double[] b = new double[100];
		double[] m = new double[100];
		double[] f = new double[100];
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 'm')
			{
				m[j] = b[i];
				j++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 'f')
			{
				f[k] = b[i];
				k++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (l = i + 1;l < j;l++)
			{
				if (m[l] < m[i])
				{
					t = m[i];
					m[i] = m[l];
					m[l] = t;
				}
			}
		}

	for (i = 0;i < k;i++)
	{
			for (l = i + 1;l < k;l++)
			{
				if (f[l] > f[i])
				{
					t = f[i];
					f[i] = f[l];
					f[l] = t;
				}
			}
	}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2lf ",f[i]);

		}
			System.out.printf("%.2lf",f[k - 1]);
		return 0;
	}
}

