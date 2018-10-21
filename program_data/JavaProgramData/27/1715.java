package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double a;
	 double b;
	 double c;
	 double p;
	 double p1;
	 double x1;
	 double x2;
	 double y1;
	 double z;
	 int n;
	 int i;
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
	  p = b * b - 4 * a * c;
	  if (p > 0)
	  {
	   x1 = (-b + Math.sqrt(p)) / (2 * a);
	   x2 = (-b - Math.sqrt(p)) / (2 * a);
	   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	  }
	  else if (p == 0)
	  {
	   x1 = (-b) / (2 * a);
	   x2 = (-b) / (2 * a);
	   System.out.printf("x1=x2=%.5lf\n",x1);
	  }
	  else
	  {
	   p1 = -p;
	   y1 = -b / (2 * a);
	   z = Math.sqrt(p1) / (2 * a);
	   System.out.printf("x1=%.5lf+%.5lfi;",y1,z);
	   System.out.printf("x2=%.5lf-%.5lfi\n",y1,z);
	  }
	 }
	 return 0;
	}

}

