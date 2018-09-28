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
	 double x1;
	 double x2;
	 double t;
	 double m;
	 double p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (j = 1;j <= n;j++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Double.parseDouble(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  c = Double.parseDouble(tempVar4);
		  }
	  t = b * b - 4 * a * c;
	  m = -b / (2 * a);
	  if (t > 0.0000001)
	  {
		p = Math.sqrt(t) / (2 * a);
	  x1 = m + p;
	  x2 = m - p;
	  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	  }
	 else
	 {
		 if (Math.abs(t) <= 0.0000001)
		 {
			 x1 = x2 = m;
		 System.out.printf("x1=x2=%.5lf\n",x1);
		 }
	 else
	 {
		 if (t < -0.0000001)
		 {
			 p = Math.sqrt(-t) / (2 * a);
		 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m,p,m,p);
		 }
	 }
	 }
	  }
	return 0;
	}


}

