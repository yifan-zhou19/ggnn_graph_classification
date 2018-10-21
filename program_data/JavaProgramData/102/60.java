package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int d = 0;
		int i;
		int j;
		int r;
		double[] s = new double[40];
		double[] a = new double[40];
		double[] b = new double[40];
		String c = new String(new char[10]);
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
				c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Double.parseDouble(tempVar3);
			}
			if (c.length() == 4)
			{
				a[m] = s[i];
				m++;
			}
			else
			{
				b[d] = s[i];
				d++;
			}
		}
		for (j = m - 1;j > 0;j--)
		{
			for (r = 0;r < j;r++)
			{
				if (a[r] > a[r + 1])
				{
					double tmp;
					tmp = a[r + 1];
					a[r + 1] = a[r];
					a[r] = tmp;
				}
			}
		}
		for (j = d - 1;j > 0;j--)
		{
			for (r = 0;r < j;r++)
			{
				if (b[r] < b[r + 1])
				{
					double tmp;
					tmp = b[r + 1];
					b[r + 1] = b[r];
					b[r] = tmp;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",a[i]);
		}
		for (i = 0;i < d;i++)
		{
			if (i == d - 1)
			{
				System.out.printf("%.2lf",b[i]);
			}
			else
			{
				System.out.printf("%.2lf ",b[i]);
			}
		}
		return 0;
	}
}

