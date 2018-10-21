package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int m;
		double S;
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (m = 0;m < k;m++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 n = Integer.parseInt(tempVar2);
						 }
						 double[] x;
						 a = 0;
						 S = 0;
						 x = new double[n];
						 for (i = 0;i < n;i++)
						 {
										  String tempVar3 = ConsoleInput.scanfRead();
										  if (tempVar3 != null)
										  {
											  x[i] = Double.parseDouble(tempVar3);
										  }
										  a += x[i];
						 }
						 a = a / n;
						 for (i = 0;i < n;i++)
						 {
										  S += (x[i] - a) * (x[i] - a);
						 }
						 S = Math.sqrt(S / n);
						 System.out.printf("%.5lf\n",S);
		}

	}

}

