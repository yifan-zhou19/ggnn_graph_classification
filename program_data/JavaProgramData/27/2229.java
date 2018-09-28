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
	  double H;
	  double p;
	  double q;
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
	  p = -b / (2 * a);
	  H = b * b - 4 * a * c;
			   if (H > 1e-6)
			   {
				   q = Math.sqrt(H) / (2 * a);
				   System.out.printf("x1=%.5f;x2=%.5f\n",p + q,p - q);
			   }
		 else
		 {
			 if (Math.abs(H) <= 1e-6)
			 {
				 System.out.printf("x1=x2=%.5f\n",p);
			 }
		 else
		 {
			 q = Math.sqrt(-H) / (2 * a);
			 if (p != 0)
			 {
				 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
			 }
										 else
										 {
											 System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",q,q);
										 }
		 }
		 }
	  }
	}

}

