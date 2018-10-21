package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  double[] a = new double[n];
	  double[] b = new double[n];
	  double[] c = new double[n];
	  double[] d = new double[n];
	  double[] e = new double[n];
	  double p;
	  double q;
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
	  for (i = 0;i < n;i++)
	  {
		  q = b[i] * b[i] - 4 * a[i] * c[i];
		  p = -b[i] / (2 * a[i]);
		if (Math.abs(q) <= 1e-6)
		{
			d[i] = p;
			System.out.printf("x1=x2=%.5f\n",d[i]);
		}
		if (q > 1e-6)
		{
			d[i] = p + (Math.sqrt(q)) / (2 * a[i]);
			e[i] = p - (Math.sqrt(q)) / (2 * a[i]);
			System.out.printf("x1=%.5f;x2=%.5f\n",d[i],e[i]);
		}
		if (q < -1e-6)
		{
			d[i] = p;
			if (Math.abs(p) < 1e-6)
			{
				d[i] = 0;
			}
			e[i] = Math.sqrt(-q) / (2 * a[i]);
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",d[i],e[i],d[i],e[i]);
		}
	  }




	}




}

