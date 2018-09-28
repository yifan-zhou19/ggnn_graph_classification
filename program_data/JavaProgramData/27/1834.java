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
		  double y;
		  double e;
		  double f;
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
		  y = b * b - 4 * a * c;
		  if (y > 0)
		  {
				 e = (-b + Math.sqrt(y)) / (2 * a);
				 f = (-b - Math.sqrt(y)) / (2 * a);
				 System.out.printf("x1=%.5f;",e);
				 System.out.printf("x2=%.5f\n",f);
		  }
		  else
		  {
			 if (y == 0)
			 {
				 e = (-b) / (2 * a);
				 System.out.printf("x1=x2=%.5f\n",e);
			 }
			 else
			 {
				 e = Math.sqrt(-y) / (2 * a);
				 f = (-b) / (2 * a);
				 if (f == 0)
				 {
						 f = 0.00000;
				 }
				 System.out.printf("x1=%.5f+%.5fi;",f,e);
				 System.out.printf("x2=%.5f-%.5fi\n",f,e);
			 }
		  }
		   }
		   System.in.read();
		   System.in.read();
		   System.in.read();
		   System.in.read();
			System.in.read();
		   System.in.read();
		   System.in.read();
		   System.in.read();

	}
}

