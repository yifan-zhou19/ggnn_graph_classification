package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
		  double[] A = new double[1000];
		  double sum = 0;
		  double a;
		  double b = 0;
		  double s;
		  double S;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  for (j = 0;j < m;j++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[j] = Double.parseDouble(tempVar3);
			}
			sum = sum + A[j];
		  }
		  a = (double)(sum / m);

		  for (j = 0;j < m;j++)
		  {
			 b = b + (A[j] - a) * (A[j] - a);
		  }
		  s = (double)b / m;
		  S = Math.sqrt(s);
		  System.out.printf("%.5lf\n",S);
		}
	}


}

