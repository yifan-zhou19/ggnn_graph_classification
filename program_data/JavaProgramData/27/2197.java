package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double d;
		double e;
		double f;
		int n;
		int i;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Double.parseDouble(tempVar4);
			}
		}
		for (i = 1;i <= n;i++)
		{
						  d = b[i] * b[i] - 4 * a[i] * c[i];
						  e = -b[i] / (2 * a[i]);
						  if (e == 0)
						  {
							  e = 0.00000;
						  }
						  f = Math.sqrt(Math.abs(d)) / (2 * a[i]);
						  if (d == 0)
						  {
							  System.out.printf("x1=x2=%.5lf", e);
						  }
						  if (d > 0)
						  {
							  System.out.printf("x1=%.5lf;x2=%.5lf", (e + f),(e - f));
						  }
						  if (d < 0)
						  {
							  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi", e, f, e, f);
						  }
						  if (i < n)
						  {
							  System.out.print("\n");
						  }
		}
		return 0;
	}

}

