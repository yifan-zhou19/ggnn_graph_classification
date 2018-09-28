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
		for (i = 1;i <= n;i++)
		{
		   int m;
		   int k;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   double[] num = new double[m];
		   for (k = 0;k < m;k++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  num[k] = Double.parseDouble(tempVar3);
			  }
		   }
		   double p = num[0];
		   double q;
		   for (k = 1;k < m;k++)
		   {
			  p = p + num[k];
		   }
		   q = p / m;
		   double s = (num[0] - q) * (num[0] - q);
		   double w;
		   for (k = 1;k < m;k++)
		   {
			  s = s + (num[k] - q) * (num[k] - q);
		   }
		   w = Math.sqrt(s / m);
		   System.out.printf("%.5lf\n",w);
		}
		return 0;
	}



}

