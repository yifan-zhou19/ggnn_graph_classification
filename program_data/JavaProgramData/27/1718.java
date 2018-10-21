package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int j;
	 double[] a = new double[100];
	 double[] b = new double[100];
	 double[] c = new double[100];
	 double p;
	 double q;
	 double u;
	 double x1;
	 double x2;
	 char r;
	 char s;
	 char t;
	 r = 'i';
	 s = '+';
	 t = '-';
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (j = 0;j < n;j++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[j] = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b[j] = Double.parseDouble(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  c[j] = Double.parseDouble(tempVar4);
	  }
	p = (-b[j]) / (2 * a[j]);
	q = b[j] * b[j] - 4 * a[j] * c[j];
	if (p != 0)
	{
	if (q > 0)
	{
		x1 = p + Math.sqrt(q) / (2 * a[j]);
	x2 = p - Math.sqrt(q) / (2 * a[j]);
	System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	}
	else if (q < 0)
	{
	u = Math.sqrt(-q) / (2 * a[j]);
	System.out.printf("x1=%.5lf%c%.5lf%c;x2=%.5lf%c%.5lf%c\n",p,s,u,r,p,t,u,r);
	}
	else
	{
	System.out.printf("x1=x2=%.5lf\n",p);
	}
	}
	else
	{
		p = (b[j]) / (2 * a[j]);
	if (q > 0)
	{
		x1 = p + Math.sqrt(q) / (2 * a[j]);
	x2 = p - Math.sqrt(q) / (2 * a[j]);
	System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	}
	else if (q < 0)
	{
	u = Math.sqrt(-q) / (2 * a[j]);
	System.out.printf("x1=%.5lf%c%.5lf%c;x2=%.5lf%c%.5lf%c\n",p,s,u,r,p,t,u,r);
	}
	else
	{
	System.out.printf("x1=x2=%.5lf\n",p);
	}
	}
	 }
	}
}

