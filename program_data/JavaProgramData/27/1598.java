package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  double[] a = new double[999];
	  double[] b = new double[999];
	  double[] c = new double[999];
	  double x1;
	  double x2;
	  double d;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  i = 1;


	  while (i <= n)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Double.parseDouble(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  c[i] = Double.parseDouble(tempVar4);
		  }
		  i = i + 1;
	  }


	  {
	   i = 1;
	   for (i = 1;i <= n;)
	   {
		  if (b[i] != 0)
		  {
			  d = b[i] * b[i] - 4 * a[i] * c[i];
			if (d > 0)
			{
				  x1 = (-b[i] + Math.sqrt(d)) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(d)) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if (d == 0)
			{
				  x1 = -b[i] / (2 * a[i]);
				x2 = -b[i] / (2 * a[i]);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (d < 0)
			{
				  x1 = -b[i] / (2 * a[i]);
				x2 = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
			}
		  }
	 if (b[i] == 0)
	 {
	   d = b[i] * b[i] - 4 * a[i] * c[i];
			if (d > 0)
			{
				  x1 = (-b[i] + Math.sqrt(d)) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(d)) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if (d == 0)
			{
				  x1 = (fabs)(-b[i] / (2 * a[i]));
				x2 = (fabs)(-b[i] / (2 * a[i]));
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (d < 0)
			{
				  x1 = (fabs)(-b[i] / (2 * a[i]));
				x2 = (fabs)(Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]));
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
			}

	 }
		i = i + 1;
	   }
  }
	}
}

