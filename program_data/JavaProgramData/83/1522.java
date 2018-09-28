package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[10];
		double[] b = new double[10];
		double[] c = new double[10];
		int n;
		int i;
		int j;
		double s1;
		double s2;
		double jd;
		s1 = 0;
		s2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Double.parseDouble(tempVar2);
			}
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j - 1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] >= 90)
			{
				c[i] = 4.0;
			}
			else if (b[i] >= 85)
			{
				c[i] = 3.7;
			}
			else if (b[i] >= 82)
			{
				c[i] = 3.3;
			}
			else if (b[i] >= 78)
			{
				c[i] = 3.0;
			}
			else if (b[i] >= 75)
			{
				c[i] = 2.7;
			}
			else if (b[i] >= 72)
			{
				c[i] = 2.3;
			}
			else if (b[i] >= 68)
			{
				c[i] = 2.0;
			}
			else if (b[i] >= 64)
			{
				c[i] = 1.5;
			}
			else if (b[i] >= 60)
			{
				c[i] = 1.0;
			}
			else
			{
				c[i] = 0.0;
			}
		}
		  for (i = 0;i <= n - 1;i++)
		  {
			  s1 = s1 + a[i];
			  s2 = s2 + a[i] * c[i];
		  }

		  jd = s2 / (double)(s1);
		  System.out.printf("%.2lf",jd);
	}
}

