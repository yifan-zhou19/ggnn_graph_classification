package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int x;
	int n;
	int m;
	double a;
	double b;
	double d;
	double[] u = new double[100];
	double[] sz = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	a = 0,b = 0,d = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	   for (j = 0;j < m;j++)
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 sz[j] = Double.parseDouble(tempVar3);
		 }
		 a = sz[j] + a;
	   }
		 double b = a / m;
		 for (x = 0;x < m;x++)
		 {
			 double c = (sz[x] - b) * (sz[x] - b);
			  d = d + c;
		 }
	   u[i] = Math.sqrt(d / m);
	}
	   for (i = 0;i < n;i++)
	   {
	   System.out.printf("%.5lf\n",u[i]);
	   }
	return 0;
	}

}

