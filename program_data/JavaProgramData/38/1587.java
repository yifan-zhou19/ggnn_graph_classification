package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int n;
	  double[] p;
	  double s;
	  double a;
	  double x;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < k;i++)
	  {
		  s = 0;
		  a = 0;
		  x = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  p = new double[n];
		  for (j = 0;j < n;j++)
		  {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p[j] = Double.parseDouble(tempVar3);
			 }
			 x = x + p[j] / n;
		  }
		  for (j = 0;j < n;j++)
		  {
			 a = a + (p[j] - x) * (p[j] - x);
		  }
		  s = Math.sqrt(a / n);
		  System.out.printf("%.5lf\n",s);
	  }

	}

}

