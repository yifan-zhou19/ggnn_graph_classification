package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 double a;
	 double b;
	 double c;
	 double dt;
	 double p;
	 double q;
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
	  dt = b * b - 4 * a * c;
	  if (dt == 0)
	  {
	   p = -b / 2 / a;
	   if (p == 0)
	   {
		   p = 0;
	   }
	   System.out.printf("x1=x2=%.5lf\n",p);
	  }
	  else if (dt > 0)
	  {
	   p = (-b + Math.sqrt(dt)) / 2 / a;
	   q = (-b - Math.sqrt(dt)) / 2 / a;
	   System.out.printf("x1=%.5lf;x2=%.5lf\n",p,q);
	  }
	  else
	  {
	   p = -b / 2 / a;
	   q = Math.sqrt(-dt) / 2 / a;
	   if (p == 0)
	   {
		   p = 0;
	   }
	   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
	  }
	 }
	 return 0;
	}


}

