package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] geshu = new int[100];
		double[] shuju = new double[100];
		double[] S = new double[100];
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   geshu[i] = Integer.parseInt(tempVar2);
		   }
		   for (k = 1;k < geshu[i] + 1;k++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  (shuju[k]) = Double.parseDouble(tempVar3);
			  }
		   }

		double sum = 0;
		double a;
		double b = 0;
		for (k = 1;k < geshu[i] + 1;k++)
		{
		   sum += shuju[k];
		}
		a = sum / (geshu[i]);
		for (k = 1;k < geshu[i] + 1;k++)
		{
		   b += (shuju[k] - a) * (shuju[k] - a);
		}
		S[i] = Math.sqrt(b / geshu[i]);
		}
		for (i = 0;i < n;i++)
		{
		  System.out.printf("%.5lf\n",S[i]);
		}
	return 0;
	}

}

