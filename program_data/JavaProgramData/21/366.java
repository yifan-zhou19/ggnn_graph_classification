package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] c = new int[300];
		int k;
		double a = 0;
		double[] b = new double[300];
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
			c[i] = Integer.parseInt(tempVar2);
		}
		a += c[i];
		}
	 a /= n;
		for (i = 0;i < n;i++)
		{
		 b[i] = c[i] - a;
		}
		for (i = n - 1;i > 0;i--)
		{
	  for (k = 0;k < i;k++)
	  {
	   if (b[k] > b[k + 1])
	   {
	   double t = b[k];
	   b[k] = b[k + 1];
	   b[k + 1] = t;
	   }
	  }
		}
	 if (b[n - 1] == 0 - b[0])
	 {
	  System.out.printf("%.0lf,%.0lf",b[0] + a,b[n - 1] + a);
	 }
	 else if (b[n - 1] < 0 - b[0])
	 {
	  System.out.printf("%.0lf",b[0] + a);
	 }
	else if (b[n - 1] > 0 - b[0])
	{
	  System.out.printf("%.0lf",b[n - 1] + a);
	}
	}

}

