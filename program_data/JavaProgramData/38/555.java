package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int i;
		int j;
		double[][] sz = new double[100][1000];
		double[] pj = new double[100];
		double b;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			double sum = 0.0;
			double d = 0.0;
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			  for (j = 0;j < n;j++)
			  {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   sz[i][j] = Double.parseDouble(tempVar3);
			   }
			   sum += sz[i][j];
			  }
		pj[i] = sum / n;
		for (j = 0;j < n;j++)
		{
		b = Math.pow((sz[i][j] - pj[i]),2);
			   d += b;
		}
		s[i] = Math.sqrt(d / n);

		}

		for (i = 0;i < k;i++)
		{
		System.out.printf("%.5f\n",s[i]);
		}
	}


}

