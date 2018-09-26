package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		double[] a = new double[1000];
		double sum1 = 0;
		double sum2 = 0;
		double ave1 = 0;
		double sum3 = 0;
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
				m = Integer.parseInt(tempVar2);
			}
		  for (j = 0;j < m;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[j] = Double.parseDouble(tempVar3);
			  }
			  sum1 += a[j];
		  }
		  ave1 = sum1 / m;
		  for (j = 0;j < m;j++)
		  {
			  sum2 += (a[j] - ave1) * (a[j] - ave1);
		  }
		  sum3 = Math.pow(sum2 / m,0.5);
		  System.out.printf("%.5lf\n",sum3);
		  sum1 = 0;
		  sum2 = 0;
		  sum3 = 0;
		  ave1 = 0;
		}
	}


}

