package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int[] n = new int[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double c = 0;
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		a[0] = 2;
		a[1] = 3;
		for (i = 0;i < m;i++)
		{
			for (k = 2;k < n[i];k++)
			{
				a[k] = a[k - 1] + a[k - 2];
			}
		}
		b[0] = 1;
		b[1] = 2;
		for (i = 0;i < m;i++)
		{
			for (k = 2;k < n[i];k++)
			{
				b[k] = b[k - 1] + b[k - 2];
			}
		}
		for (i = 0;i < m;i++)
		{
			s = 0;
			c = 0;
			for (k = 0;k < n[i];k++)
			{
				c = a[k] / b[k];
				s = s + c;
			}
			System.out.printf("%.3lf\n",s);
		}
		return 0;
	}


}

