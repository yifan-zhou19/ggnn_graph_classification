package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[] a = new double[500];
		  double[] b = new double[500];
		  double[] c = new double[500];
		  double x1;
		  double x2;
		  double e;
		  for (m = 1;m <= n;m++)
		  {
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   a[m] = Double.parseDouble(tempVar2);
						   }
						   String tempVar3 = ConsoleInput.scanfRead(" ");
						   if (tempVar3 != null)
						   {
							   b[m] = Double.parseDouble(tempVar3);
						   }
						   String tempVar4 = ConsoleInput.scanfRead(" ");
						   if (tempVar4 != null)
						   {
							   c[m] = Double.parseDouble(tempVar4);
						   }
		  }
		  for (m = 1;m <= n;m++)
		  {
						   if ((b[m] * b[m] - 4 * a[m] * c[m]) == 0)
						   {
							  x1 = -b[m] / (2 * a[m]),x2 = -b[m] / (2 * a[m]);
							  System.out.printf("x1=x2=%.5f\n",x1);
						   }
						   else if ((b[m] * b[m] - 4 * a[m] * c[m]) > 0)
						   {
							  x1 = (-b[m] + Math.sqrt(b[m] * b[m] - 4 * a[m] * c[m])) / (2 * a[m]);
							  x2 = (-b[m] - Math.sqrt(b[m] * b[m] - 4 * a[m] * c[m])) / (2 * a[m]);
							  System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
						   }
						   else
						   {
								 e = Math.sqrt(-b[m] * b[m] + 4 * a[m] * c[m]) / (2 * a[m]);
								 if (b[m] == 0)
								 {
								 System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",e,e);
								 }
								 else
								 {
								 x1 = -b[m] / (2 * a[m]);
								 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,e,x1,e);
								 }
						   }
		  }
		  return 0;
	}





}

