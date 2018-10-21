package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
						  double a;
						  double b;
						  double c;
						  double m;
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
						  m = b * b - 4 * a * c;
		  if (Math.abs(m) <= 1e-6)
		  {
						   if (Math.abs(b) <= 1e-6)
						   {
									System.out.printf("x1=x2=%.5f",b / (2 * a));
						   }
						   else
						   {
									System.out.printf("x1=x2=%.5f",-b / (2 * a));
						   }
		  }
		  else
		  {
			   if (m > 1e-6)
			   {
				  System.out.printf("x1=%.5lf;x2=%.5lf",(-b + Math.sqrt(m)) / (2 * a),(-b - Math.sqrt(m)) / (2 * a));
			   }
			   else
			   {
							   if (Math.abs(b) <= 1e-6)
							   {
									System.out.printf("x1=%.5lf+%.5lfi;x2=%.5f-%.5fi",b / (2 * a),Math.sqrt(-m) / (2 * a),b / (2 * a),Math.sqrt(-m) / (2 * a));
							   }
							   else
							   {
									System.out.printf("x1=%.5lf+%.5lfi;x2=%.5f-%.5fi",-b / (2 * a),Math.sqrt(-m) / (2 * a),-b / (2 * a),Math.sqrt(-m) / (2 * a));
							   }
			   }
		  }
		  System.out.print("\n");
		  }
	}

}

