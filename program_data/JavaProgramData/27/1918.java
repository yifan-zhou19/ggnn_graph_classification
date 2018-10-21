package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int j;
		  int n;
		  double[] q = new double[100];
		  double[] w = new double[100];
		  double[] e = new double[100];
		  double a;
		  double b;
		  double c;
		  double p;
		  double x1;
		  double x2;
		  double h;
		  double g;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (j = 0;j <= n - 1;j++)
		  {
							 String tempVar2 = ConsoleInput.scanfRead();
							 if (tempVar2 != null)
							 {
								 q[j] = Double.parseDouble(tempVar2);
							 }
							 String tempVar3 = ConsoleInput.scanfRead(" ");
							 if (tempVar3 != null)
							 {
								 w[j] = Double.parseDouble(tempVar3);
							 }
							 String tempVar4 = ConsoleInput.scanfRead(" ");
							 if (tempVar4 != null)
							 {
								 e[j] = Double.parseDouble(tempVar4);
							 }
		  }
		  for (j = 0;j <= n - 1;j++)
		  {
							 a = q[j];
							 b = w[j];
							 c = e[j];
							 p = b * b - 4 * a * c;
							 if (p > 0)
							 {
									if (b != 0)
									{
									x1 = (-b + Math.sqrt(p)) / (2 * a);
									x2 = (-b - Math.sqrt(p)) / (2 * a);
									System.out.printf("x1=%.5lf;x2=%.5lf",x1,x2);
									System.out.print("\n");
									}
									else
									{
									System.out.printf("x1=%.5lf;x2=-%.5lf",Math.sqrt(p) / (2 * a),Math.sqrt(p) / (2 * a));
									}
							 }
							 else
							 {
							 if (p == 0)
							 {
									 if (b != 0)
									 {
											 x1 = x2 = -b / (2 * a);
											 System.out.printf("x1=x2=%.5lf",x2);
									 }
									 else
									 {
									 System.out.print("x1=x2=0.00000");
									 }
									 System.out.print("\n");
							 }
							 else
							 {
								 if (b != 0)
								 {

										 h = -b / (2 * a);
										 g = (Math.sqrt(-p)) / (2 * a);
										 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi",h,g,h,g);
								 }
								 else
								 {
								 g = (Math.sqrt(-p)) / (2 * a);
								 System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi",g,g);
								 }
								 System.out.print("\n");
							 }
							 }
		  }
		  System.in.read();
		   System.in.read();
	}

}

