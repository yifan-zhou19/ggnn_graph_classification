package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 double a;
	 double b;
	 double c;
	 double x;
	 double y;
	 double p;
	 double q;
	 double disc;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (m = 1;m <= n;m++)
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
	  disc = b * b - 4 * a * c;
	  p = -b;
	  p = p / 2;
	  p = p / a;
	  if (disc > 0)
	  {
	   q = Math.sqrt(disc);
	   q = q / 2.0;
	   q = q / a;
	   x = p + q;
	   y = p - q;
	   System.out.printf("x1=%.5f;x2=%.5f",x,y);
	   System.out.print("\n");
	  }
	  else if (disc == 0)
	  {
	   System.out.printf("x1=x2=%.5f",p);
	   System.out.print("\n");
	  }
	  else
	  {
	   disc = -disc;
	   q = Math.sqrt(disc);
	   q = q / 2.0;
	   q = q / a;
	   if (p == -0)
	   {
		   p = 0;
	   }
	   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi",p,q,p,q);
	   System.out.print("\n");
	  }
	 }
	 return 0;
	}




}

