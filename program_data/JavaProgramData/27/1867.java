package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;

	  double[] a = new double[100];
	  double[] b = new double[100];
	  double[] c = new double[100];
	  double delta;
	  double x1;
	  double x2;
	  double x_a;
	  double x_b;
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
	  delta = b[i] * b[i] - 4 * a[i] * c[i];
	  if (delta > 0)
	  {
		  x1 = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
	  x2 = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
	  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	  }

	  else if (delta == 0)
	  {
		  x1 = (-b[i]) / (2 * a[i]);
	  System.out.printf("x1=x2=%.5lf\n",x1);
	  }

	  else
	  {
		  x_a = (-b[i]) / (2 * a[i]);
	  x_b = Math.sqrt(-delta) / (2 * a[i]);
	  if (x_a == -0)
	  {
		  x_a = 0;
	  }
	  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x_a,x_b,x_a,x_b);
	  }


	  }


	}
}

