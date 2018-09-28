package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double a = 1.0;
	  double b = 1.0;
	  double c = 1.0;
	  int n = 1;
	  int k = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  double[] e = new double[100];
	  double[] f = new double[100];
	  double[] g = new double[100];
	  for (k = 0;k < n;k++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			e[k] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			f[k] = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			g[k] = Double.parseDouble(tempVar4);
		}
	  }


	  for (k = 0;k < n;k++)
	  {
			  a = e[k];
			  b = f[k];
			  c = g[k];
			  if (b * b - 4 * a * c == 0)
			  {
				  System.out.printf("x1=x2=%.5lf\n",-b / (2 * a));
			  }
			  else if (b * b - 4 * a * c > 0)
			  {
							 System.out.printf("x1=%.5lf;x2=%.5lf\n",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			  }
			  else if (b * b - 4 * a * c < 0)
			  {
				  if (b == 0)
				  {
					System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",Math.sqrt(-(b * b - 4 * a * c)) / (2 * a),Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
				  }
				 else
				 {
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",-b / (2 * a),Math.sqrt(-(b * b - 4 * a * c)) / (2 * a),-b / (2 * a),-Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
				 }
			  }

	  }

	  return 0;

	}

}

