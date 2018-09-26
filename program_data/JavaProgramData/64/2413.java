package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int p;
		int q;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x = new double[200];
		double[] y = new double[200];
		double[] z = new double[200];
		double[][] jl = new double[200][200];
		double[] jljl = new double[200];
		double[] dhi = new double[200];
		double[] dhj = new double[200];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(x[i]) = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(y[i]) = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(z[i]) = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				jl[i][j] = Math.sqrt(((x[j]) - (x[i])) * ((x[j]) - (x[i])) + ((y[j]) - (y[i])) * ((y[j]) - (y[i])) + ((z[j]) - (z[i])) * ((z[j]) - (z[i])));
				jljl[k] = jl[i][j];
				dhi[k] = i;
				dhj[k] = j;
				k++;
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			for (j = n * (n - 1) / 2 - 1;j > i;j--)
			{
				if (jljl[j] > jljl[j - 1])
				{
					t = jljl[j];
					jljl[j] = jljl[j - 1];
					jljl[j - 1] = t;
					t = dhi[j];
					dhi[j] = dhi[j - 1];
					dhi[j - 1] = t;
					t = dhj[j];
					dhj[j] = dhj[j - 1];
					dhj[j - 1] = t;
				}
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				jl[i][j] = jljl[k];
				p = (int)dhi[k];
				q = (int)dhj[k];
				k++;
				System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",x[p],y[p],z[p],x[q],y[q],z[q],jl[i][j]);
			}
		}
		return 0;
	}

}

