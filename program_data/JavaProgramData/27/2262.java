package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
					int i;
					int n;
					double[] a = new double[100];
					double[] b = new double[100];
					double[] c = new double[100];
					double[] d = new double[100];
					double[] x = new double[100];
					double[] y = new double[100];
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						n = Integer.parseInt(tempVar);
					}
					i = 0;
					for (i = 0;i < n;i++)
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
					}
					i = 0;
					while (i < n)
					{
							  if (b[i] * b[i] - 4 * a[i] * c[i] >= 0)
							  {
							  x[i] = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
							  y[i] = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
							  if (x[i] == y[i])
							  {
							  System.out.printf("x1=x2=%.5lf\n",x[i]);
							  }
							  else
							  {
								  System.out.printf("x1=%.5lf;x2=%.5lf\n",x[i],y[i]);
							  }
							  }
							  else
							  {
	if (b[i] == 0)
	{
								  d[i] = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]);
								  x[i] = b[i] / (2 * a[i]);
	System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x[i],d[i],x[i],d[i]);
	}
	else
	{
	d[i] = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]);
								  x[i] = -b[i] / (2 * a[i]);
	System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x[i],d[i],x[i],d[i]);
	}
							  }
							  i = i + 1;
					}
	}


}

