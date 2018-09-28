package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  double[][] a = new double[100][3];
	  double delta;
	  double x1;
	  double x2;
	  double real1;
	  double real2;
	  double imz1;
	  double imz2;
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  for (j = 0;j <= 2;j++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i][j] = Double.parseDouble(tempVar2);
			  }
		  }
		  delta = a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2];
		  if (delta > 0)
		  {
			  x1 = ((-1) * a[i][1] + Math.sqrt(delta)) / (2 * a[i][0]);
		  x2 = ((-1) * a[i][1] - Math.sqrt(delta)) / (2 * a[i][0]);
		  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		  }
		  else if (Math.abs(delta) < 1e-5)
		  {
			  x1 = ((-1) * a[i][1]) / (2 * a[i][0]);
		  System.out.printf("x1=x2=%.5lf\n",x1);
		  }
		  else
		  {
			  real1 = (-1) * a[i][1] / (2 * a[i][0]);
		  imz1 = Math.sqrt((-1) * delta) / (2 * a[i][0]);
		  real2 = (-1) * a[i][1] / (2 * a[i][0]);
		  imz2 = Math.sqrt((-1) * delta) / (2 * a[i][0]);
		  if (Math.abs(real1) < 1e-5)
		  {
		  real1 = Math.abs(real1);
		  }
		  if (Math.abs(real2) < 1e-5)
		  {
		  real2 = Math.abs(real2);
		  }
		  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",real1,imz1,real2,imz2);
		  }
	  }

	}

}

