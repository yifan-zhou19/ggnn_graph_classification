package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double[][] d = new double[20][3];
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
	  d[i][0] = a;
	  d[i][1] = b;
	  d[i][2] = c;
	 }
	 for (i = 0;i < n;i++)
	 {
	  double a;
	  double b;
	  double c;
	  double p;
	  a = d[i][0];
	  b = d[i][1];
	  c = d[i][2];

	  p = b * b - 4 * a * c;
	  if (p == 0)
	  {
		  if (b == 0)
		  {
			  System.out.printf("x1=x2=%.5lf\n",Math.abs((-b) / (2 * a)));
		  }
		 else
		 {
			 System.out.printf("x1=x2=%.5lf\n",(-b) / (2 * a));
		 }
	  }
	  if (p > 0)
	  {
		  System.out.printf("x1=%.5lf;x2=%.5lf\n",(-b + Math.sqrt(p)) / (2 * a),(-b - Math.sqrt(p)) / (2 * a));
	  }
	  if (p < 0)
	  {
		  if (b == 0)
		  {
			  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", (b) / (2 * a), Math.sqrt(-p) / (2 * a),(b) / (2 * a),Math.sqrt(-p) / (2 * a));
		  }
	 else
	 {
		 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", (-b) / (2 * a), Math.sqrt(-p) / (2 * a),(-b) / (2 * a),Math.sqrt(-p) / (2 * a));
	 }
	  }
	 }
	 return 0;
	}

}

