package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int c;
	 double a;
	 double r;
	 double[] b = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
	  r = 0.0;
	  a = 2.0 / 1;
	  for (c = 1;c <= n;c++)
	  {
		r += a;
		a = 1.0 / a + 1;
	  }
		b[i] = r;
		}
		for (i = 1;i <= m;i++)
		{
	System.out.printf("%.3lf\n",b[i]);
		}
		return 0;
	}

}

