package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] a = new int[100];
		double[][] b = new double[100][1000];
		double[] c = new double[100];
		double[] d = new double[100];
		double[] jun = new double[100];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < a[i];j++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i][j] = Double.parseDouble(tempVar3);
		 }
		}
		}
	   for (i = 0;i < k;i++)
	   {
		c[i] = 0;
		for (j = 0;j < a[i];j++)
		{
		 c[i] += b[i][j];
		}
	   }
	   for (i = 0;i < k;i++)
	   {
		jun[i] = c[i] / a[i];
	   }
	   for (i = 0;i < k;i++)
	   {
		d[i] = 0;
		for (j = 0;j < a[i];j++)
		{
		 d[i] += Math.pow(b[i][j] - jun[i],2);
		}
	   }
	  for (i = 0;i < k;i++)
	  {
	   s[i] = Math.sqrt(d[i] / a[i]);
	   System.out.printf("%.5lf\n",s[i]);
	  }
	  return 0;
	}
}

