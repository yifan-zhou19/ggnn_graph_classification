package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double[] x = new double[9999];
		double[] y = new double[9999];
		double l;
		double m;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }

		 for (i = 1;i <= n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 x[i] = Double.parseDouble(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 y[i] = Double.parseDouble(tempVar3);
			 }

		 }
			l = Math.sqrt((x[1] - x[2]) * (x[1] - x[2]) + (y[1] - y[2]) * (y[1] - y[2]));
		 for (i = 1;i <= n;i++)
		 {


				for (k = i + 1;k <= n;k++)
				{
				   m = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]));
				   if (m > l)
				   {
					   l = m;
				   }


				}

		 }
		 System.out.printf("%.4lf\n",l);
		 return 0;
	}


}

