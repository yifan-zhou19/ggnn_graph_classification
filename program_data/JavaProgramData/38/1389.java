package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[][] sz = new double[50][100];
		double[] pj = new double[50];
		double[] fc = new double[50];
		double[] zs = new double[50];
		double[] fch = new double[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
		   zs[i] = 0;
		   fc[i] = 0;
		   pj[i] = 0;
		   fch[i] = 0;
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
		   }
		   for (j = 0;j < n;j++)
		   {
			  zs[i] += sz[i][j];
		   }
		   pj[i] = zs[i] / n;
		   for (j = 0;j < n;j++)
		   {
			  fch[i] += (sz[i][j] - pj[i]) * (sz[i][j] - pj[i]);
		   }
		   fc[i] = Math.sqrt(fch[i] / n);
		}
		for (i = 0;i < k;i++)
		{
		   System.out.printf("%.5lf\n",fc[i]);
		}
		int a;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

