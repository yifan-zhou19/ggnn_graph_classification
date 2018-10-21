package <missing>;

public class GlobalMembers
{
	public static double fuhao(double x)
	{
	  double result;
	  if ((x < 0) && (0 - x < 0.00001))
	  {
	   result = 0;
	  }
	  else
	  {
		  result = x;
	  }
	  return result;
	}
	public static int Main()
	{
	  double[] a = new double[100];
	  double[] b = new double[100];
	  double[] c = new double[100];
	  double[] x1 = new double[100];
	  double[] x2 = new double[100];
	  double[] delta = new double[100];
	  int n;
	  int i;
	  int[] decide = new int[100];
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
		delta[i] = b[i] * b[i] - 4 * a[i] * c[i];
		//printf("input done,delta=%f\n",delta[i]);
	  }
	  for (i = 0;i < n;i++)
	  {
		if (delta[i] > 0)
		{
			decide[i] = 1;
		}
		else
		{
		  if (delta[i] < 0)
		  {
			  decide[i] = -1;
		  }
		  else
		  {
			  decide[i] = 0;
		  }
		}
		if (decide[i] == 1)
		{
			System.out.printf("x1=%.5f;x2=%.5f\n",(fuhao((0 - b[i] + Math.sqrt(delta[i])) / (2 * a[i]))),(fuhao((0 - b[i] - Math.sqrt(delta[i])) / (2 * a[i]))));
		}
		else
		{
		  if (decide[i] == 0)
		  {
			  System.out.printf("x1=x2=%.5f\n",fuhao((0 - b[i]) / (2 * a[i])));
		  }
		  else
		  {
			  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",fuhao((0 - b[i]) / (2 * a[i])),(Math.sqrt(-delta[i])) / (2 * a[i]),fuhao((0 - b[i]) / (2 * a[i])),((Math.sqrt(-delta[i])) / (2 * a[i])));
		  }
		}
	  }
	  return 0;
	}


}

