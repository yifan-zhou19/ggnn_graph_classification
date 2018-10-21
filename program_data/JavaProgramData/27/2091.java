package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  float[] a = new float[100];
		  float[] b = new float[100];
		  float[] c = new float[100];
		  double d = 0;
		  double x1;
		  double x2;
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
								 a[i] = Float.parseFloat(tempVar2);
							 }
							 String tempVar3 = ConsoleInput.scanfRead(" ");
							 if (tempVar3 != null)
							 {
								 b[i] = Float.parseFloat(tempVar3);
							 }
							 String tempVar4 = ConsoleInput.scanfRead(" ");
							 if (tempVar4 != null)
							 {
								 c[i] = Float.parseFloat(tempVar4);
							 }
		  }
		  for (i = 0;i < n;i++)
		  {
							d = b[i] * b[i] - 4.0 * a[i] * c[i];
							if (d >= 0.001)
							{
							   x1 = (-b[i] + Math.sqrt(d)) / (2.0 * a[i]);
							   x2 = (-b[i] - Math.sqrt(d)) / (2.0 * a[i]);
							   System.out.printf("x1=%.5f;",x1);
							   System.out.printf("x2=%.5f\n",x2);
							}
							if (d < 0.001 && d>-0.001)
							{
							   x1 = (-b[i]) / (2.0 * a[i]);
							   System.out.printf("x1=x2=%.5f\n",x1);
							}
							if (d <= -0.001)
							{
							  double m;
							  double n;
							  m = -b[i] / (2.0 * a[i]);
							  n = Math.sqrt(-d) / (2.0 * a[i]);
							  if (m == 0)
							  {
								  System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",n,n);
							  }
							  else
							  {
								  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",m,n,m,n);
							  }
							}
		  }
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}
}

