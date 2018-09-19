package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p = 0;
		int q = 0;
		int j;
		int k;
		int m;
		double[] c = new double[40];
		double[] d = new double[40];
		char[] a = {0, '\0', '\0', '\0', '\0', '\0'};
		double b;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			m = a.length();
			if (a[0] == 'm')
			{
				c[p] = b;
				p = p + 1;
			}
			else
			{
				d[q] = b;
				q = q + 1;
			}
		}
		for (k = 1;k < p;k++)
		{
			for (j = 0;j < p - k;j++)
			{
				if (c[j] > c[j + 1])
				{
					e = c[j + 1];
					c[j + 1] = c[j];
					c[j] = e;
				}
			}
		}
		for (k = 1;k < q;k++)
		{
			for (j = 0;j < q - k;j++)
			{
				if (d[j] < d[j + 1])
				{
					e = d[j + 1];
					d[j + 1] = d[j];
					d[j] = e;
				}
			}
		}
		for (j = 0;j < p;j++)
		{
			System.out.printf("%.2lf ",c[j]);
		}
		for (j = 0;j < q - 1;j++)
		{
			System.out.printf("%.2lf ",d[j]);
		}
		System.out.printf("%.2lf",d[q - 1]);
		return 0;
	}

}

