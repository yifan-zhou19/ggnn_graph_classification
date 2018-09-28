package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] yao = new int[100];
		int j;
		int i;
		double[][] a = new double[100][100];
		double s;
		double sum1 = 0.0;
		double sum2 = 0.0;
		double sum3 = 0.0;


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
			  yao[i] = Integer.parseInt(tempVar2);
		  }
		  for (j = 0;j < yao[i];j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Double.parseDouble(tempVar3);
			  }
		  }
		}
		for (i = 0;i < n;i++)
		{
			sum1 = 0.0;
			sum2 = 0.0;
			sum3 = 0.0;
		  for (j = 0;j < yao[i];j++)
		  {
			  sum1 += a[i][j];
		  }
			  sum2 = sum1 / (1.00 * yao[i]);
		  for (j = 0;j < yao[i];j++)
		  {
			 sum3 = sum3 + (a[i][j] - sum2) * (a[i][j] - sum2);
		  }
		  s = Math.sqrt(sum3 / (1.00 * yao[i]));
		  System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

