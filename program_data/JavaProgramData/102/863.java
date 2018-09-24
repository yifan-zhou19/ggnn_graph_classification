package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int nan;
		int nv;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[42][8];
		double[] b = new double[42];
		double[] c = new double[42];
		double[] d = new double[42];
		double x;
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
		j = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 'm')
			{
				c[j] = b[i];
				j++;
			}
			else
			{
				d[k] = b[i];
				k++;
			}
		}
		nan = j;
		nv = k;
		for (i = 0;i < nan;i++)
		{
			for (j = i;j < nan;j++)
			{
				if (c[j] < c[i])
				{
					x = c[j];
					c[j] = c[i];
					c[i] = x;
				}
			}
		}
		for (i = 0;i < nv;i++)
		{
			for (j = i;j < nv;j++)
			{
				if (d[j] > d[i])
				{
					x = d[j];
					d[j] = d[i];
					d[i] = x;
				}
			}
		}
		for (i = 0;i < nan;i++)
		{
			System.out.printf("%.2lf ",c[i]);
		}
		System.out.printf("%.2lf",d[0]);
		for (i = 1;i < nv;i++)
		{
			System.out.printf(" %.2lf",d[i]);
		}
		return 0;
	}

}

