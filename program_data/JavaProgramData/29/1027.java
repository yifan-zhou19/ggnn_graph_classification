package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (j = 0;j < m;j++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		double[] c = new double[n];
		double s = 0;
		for (i = 0;i < n;i++)
		{
		  if (i == 0)
		  {
			a[i] = 2;
			b[i] = 1;
			c[i] = 2;
		  }
		  else
		  {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
			c[i] = 1.0 * a[i] / b[i];
		  }
		  s += c[i];
		}
		System.out.printf("%.3lf\n",s);
	  }
	}
}

