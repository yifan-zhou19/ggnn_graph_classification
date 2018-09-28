package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[] a = new double[n];
		  double b;
		  double c;
		  double[] x = new double[n];
		  double[] y = new double[n];
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
					b = Double.parseDouble(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					c = Double.parseDouble(tempVar4);
				}
				y[i] = (b * b - 4 * a[i] * c);
				if (b == 0)
				{
				x[i] = (b) / (2 * a[i]);
				}
				else
				{
				x[i] = (-b) / (2 * a[i]);
				}
		  }
		  for (i = 0;i < n;i++)
		  {
				  if (y[i] == 0)
				  {
					System.out.printf("x1=x2=%.5f\n",x[i]);
				  }
				  else if (y[i] > 0)
				  {
					y[i] = Math.sqrt(y[i]) / (2 * a[i]);
					System.out.printf("x1=%.5f;x2=%.5f\n",x[i] + y[i],x[i] - y[i]);
				  }
				  else
				  {
					y[i] = Math.sqrt(-y[i]) / (2 * a[i]);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x[i],y[i],x[i],y[i]);
				  }
		  }

	}

}

