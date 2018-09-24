package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double x1;
		double x2;
		double a;
		double b;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] m = new double[n];
		double[] y = new double[n];
		double[] z = new double[n];
		for (i = 1;i <= n;i++)
		{
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  m[i] = Double.parseDouble(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  y[i] = Double.parseDouble(tempVar3);
						  }
						  String tempVar4 = ConsoleInput.scanfRead(" ");
						  if (tempVar4 != null)
						  {
							  z[i] = Double.parseDouble(tempVar4);
						  }
		}
		for (i = 1;i <= n;i++)
		{
						  a = m[i];
						  b = y[i];
						  c = z[i];
						  if ((b * b - 4 * a * c) < 0)
						  {
										  x1 = -b / (2 * a);
										  x2 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
											if (x1 == -0)
											{
				  x1 = 0;
											}
			  if (x2 == -0)
			  {
				  x2 = 0;
			  }
										  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x2,x1,x2);
						  }
						  else
						  {
								x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
								x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
								if (x1 == x2)
								{
										   System.out.printf("x1=x2=%.5f\n",x1);
								}
									 else
									 {
										   System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
									 }
						  }
		}
	}

}

