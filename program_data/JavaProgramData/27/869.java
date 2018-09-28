package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double a;
	 double b;
	 double c;
	 double d;
	 double e;
	 double q;
	 double x1;
	 double x2;
	 int n;
	 int i = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (i < n)
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
	  d = b * b - 4 * a * c;
	  if (d > 0)
	  {
		   x1 = (-b + Math.sqrt(d)) / (2 * a);
		x2 = (-b - Math.sqrt(d)) / (2 * a);
		System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
	  }
	  if (d == 0)
	  {
		   x1 = -b / (2 * a);
		System.out.printf("x1=x2=%.5f\n",x1);
	  }
	  if (d < 0)
	  {
		   e = (Math.sqrt(-d)) / (2 * a);
		if (b != 0)
		{
			 q = (-b) / (2 * a);
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",q,e,q,e);
		}
		else
		{
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b,e,b,e);
		}
	  }
	  i = i + 1;
	 }
	 return 0;
	}
}

