package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int j;
	 double a;
	 double b;
	 double c;
	 double p;
	 double q;
	 double r;
	 double u;
	 double v;
	 double t;
	 double x1;
	 double x2;
	 char i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 double[][] m = new double[100][3];
	 for (j = 0;j < n;j++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = Double.parseDouble(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  c = Double.parseDouble(tempVar4);
	  }
	  m[j][0] = a;
	  m[j][1] = b;
	  m[j][2] = c;
	 }
		for (j = 0;j < n;j++)
		{
	p = m[j][0];
	q = m[j][1];
	r = m[j][2];
	t = q * q - 4 * p * r;
	if (t > 0)
	{
	  double p1;
	  p1 = 2 * p;
	  x1 = (-q + Math.sqrt(t)) / p1;
	  x2 = (-q - Math.sqrt(t)) / p1;
	  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	}
	  else
	  {
	   if (t == 0)
	   {
	   x1 = -q / (2 * p);
	   x2 = -q / (2 * p);
	   System.out.printf("x1=x2=%.5lf\n",x1);
	   }
	   else
	   {
	   u = Math.sqrt(-t) / (2 * p);
	   v = (-q) / (2 * p);
	  if (v != 0)
	  {
	   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",v,u,v,u);
	  }
	  else
	  {
	   System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",u,u);
	  }
	   }
	  }
		}
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}

}

