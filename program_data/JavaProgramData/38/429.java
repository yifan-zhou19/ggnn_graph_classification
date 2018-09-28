package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k;
	 int j;
	 double[] b = new double[10000];
	 double c;
	 double[] d = new double[10000];
	 double m;
	 double[] sum = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	 for (i = 0;i < n;i++)
	 {
		 m = 0.0;
	 c = 0.0;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (j = 0;j < k;j++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[j] = Double.parseDouble(tempVar3);
		}
	  }
	  for (j = 0;j < k;j++)
	  {


			c = c + b[j];
	  }
	  for (j = 0;j < k;j++)
	  {
		 d[j] = b[j] - c / k;

		 m = m + d[j] * d[j];
	  }

		sum[i] = Math.sqrt(m / k);


	 }
	 for (i = 0;i < n;i++)
	 {

	  System.out.printf("%.5lf\n",sum[i]);
	 }
	 return 0;
	}


}

