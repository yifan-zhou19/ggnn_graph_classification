package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int[] a = new int[100];
	int[] b = new int[100];
	double[] s = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}

	a[1] = 2;
	b[1] = 1;
	s[1] = 2.0;
	for (i = 2;i < 100;i++)
	{
	a[i] = a[i - 1] + b[i - 1];
	b[i] = a[i - 1];
	s[i] = (a[i] + 0.0) / b[i] + s[i - 1];
	}
	for (i = 1;i <= m;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  System.out.printf("%.3lf\n",s[n]);
	}
	return 0;
	}

}

