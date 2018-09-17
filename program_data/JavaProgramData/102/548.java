package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int p;
		int q;
		int j;
		double[] a = new double[40];
		double[] c = new double[40];
		double[] d = new double[40];
		double e;
		char[][] b = new char[40][6];
		p = 0;
		q = 0;
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
				b[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
			t = strcmp(b[i],"female");
			if (t == 0)
			{
				d[q] = a[i];
				q++;
			}
			else
			{
				c[p] = a[i];
				p++;
			}
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < p - 1 - i;j++)
			{
				if (c[j] > c[j + 1])
				{
					e = c[j + 1];
					c[j + 1] = c[j];
					c[j] = e;
				}
			}
		}
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < q - 1;j++)
			{
				if (d[j] < d[j + 1])
				{
					e = d[j];
					d[j] = d[j + 1];
					d[j + 1] = e;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%.2lf ",c[i]);
		}
		for (i = 0;i < q - 1;i++)
		{
			System.out.printf("%.2lf ",d[i]);
		}
		System.out.printf("%.2lf",d[q - 1]);
		return 0;
	}
}

