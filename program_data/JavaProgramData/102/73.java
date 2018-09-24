package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m = 0;
		int f = 0;
		char[][] s = new char[40][10];
		double[] c = new double[40];
		double[] a = new double[40];
		double[] b = new double[40];
		double e;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(c[i]) = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][0] == 'm')
			{
				a[i] = c[i];
				m++;
			}
			if (s[i][0] == 'f')
			{
				b[i] = c[i];
				f++;
			}
		}
		for (k = 1;k <= 40;k++)
		{
			for (i = 0;i < 40 - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
				}
			}
		}
		for (k = 1;k <= 40;k++)
		{
			for (i = 0;i < 40 - k;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i + 1];
					b[i + 1] = b[i];
					b[i] = e;
				}
			}
		}
	   for (i = 40 - m;i < 40;i++)
	   {
			System.out.printf("%.2lf ",a[i]);
	   }
	   for (i = 39;i > 40 - f;i--)
	   {
			System.out.printf("%.2lf ",b[i]);
	   }
	   System.out.printf("%.2lf",b[40 - f]);
		return 0;
	}
}

