package <missing>;

public class GlobalMembers
{
	public static double juli(double m, double n, double l)
	{
		double t;
		t = m * m + n * n + l * l;
		t = Math.sqrt(t);
		return t;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x = new double[11];
		double[] y = new double[11];
		double[] z = new double[11];
		double[] k = new double[56];

		double[] jiawei1 = new double[56];
		double[] jiawei2 = new double[56];
		double[] jiawei3 = new double[56];

		double[] jianwei1 = new double[56];
		double[] jianwei2 = new double[56];
		double[] jianwei3 = new double[56];
		double tran;

		for (i = 1;i < n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Double.parseDouble(tempVar4);
			}
		}
		m = 1;
		for (i = 1;i < 1 + n;i++)
		{
			for (j = i + 1;j < n + 1;j++)
			{
				k[m] = juli(x[i] - x[j], y[i] - y[j], z[i] - z[j]);
				jiawei1[m] = x[i];
				jiawei2[m] = y[i];
				jiawei3[m] = z[i];
				jianwei1[m] = x[j];
				jianwei2[m] = y[j];
				jianwei3[m] = z[j];
				m = m + 1;
			}
		}

		for (i = 1;i < m;i++)
		{
			for (j = i;j < m;j++)
			{

				if (k[i] < k[j])
				{
					tran = k[i];
					k[i] = k[j];
					k[j] = tran;

					tran = jiawei1[i];
					jiawei1[i] = jiawei1[j];
					jiawei1[j] = tran;

					tran = jiawei2[i];
					jiawei2[i] = jiawei2[j];
					jiawei2[j] = tran;

					tran = jiawei3[i];
					jiawei3[i] = jiawei3[j];
					jiawei3[j] = tran;

					tran = jianwei1[i];
					jianwei1[i] = jianwei1[j];
					jianwei1[j] = tran;

					tran = jianwei2[i];
					jianwei2[i] = jianwei2[j];
					jianwei2[j] = tran;

					tran = jianwei3[i];
					jianwei3[i] = jianwei3[j];
					jianwei3[j] = tran;
				}
			}
		}
			int v = 1;
			for (i = 1;i < m;i++)
			{

				for (j = i;j < m;j++)
				{

					if (k[i] == k[j])
					{

						for (v = 1;v < n + 1;v++)
						{

							if ((jiawei1[i] == x[v] && jiawei1[j] != x[v]) || (jiawei1[i] == jiawei1[j] && jiawei2[i] == y[v] && jiawei2[j] != x[v]) || (jiawei1[i] == jiawei1[j] && jiawei2[i] == jiawei2[j] && jiawei3[i] == z[v] && jiawei3[j] != z[v]) || (jiawei1[i] == jiawei1[j] && jiawei2[i] == jiawei2[j] && jiawei3[i] == jiawei3[j] && jianwei1[i] == x[v] && jianwei1[j] != x[v]) || (jiawei1[i] == jiawei1[j] && jiawei2[i] == jiawei2[j] && jiawei3[i] == jiawei3[j] && jianwei1[i] == jianwei1[j] && jianwei2[i] == y[v] && jianwei2[j] != y[v]) || (jiawei1[i] == jiawei1[j] && jiawei2[i] == jiawei2[j] && jiawei3[i] == jiawei3[j] && jianwei1[i] == jianwei1[j] && jianwei2[i] == jianwei2[j] && jianwei3[i] == z[v] && jianwei3[j] != z[v]))
							{

					tran = jiawei1[i];
					jiawei1[i] = jiawei1[j];
					jiawei1[j] = tran;

					tran = jiawei2[i];
					jiawei2[i] = jiawei2[j];
					jiawei2[j] = tran;

					tran = jiawei3[i];
					jiawei3[i] = jiawei3[j];
					jiawei3[j] = tran;

					tran = jianwei1[i];
					jianwei1[i] = jianwei1[j];
					jianwei1[j] = tran;

					tran = jianwei2[i];
					jianwei2[i] = jianwei2[j];
					jianwei2[j] = tran;

					tran = jianwei3[i];
					jianwei3[i] = jianwei3[j];
					jianwei3[j] = tran;


							}

						}

					}
				}
			}



		for (i = 1;i < n * (n - 1) / 2 + 1;i++)
		{
				 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",(int)jiawei1[i],(int)jiawei2[i],(int)jiawei3[i],(int)jianwei1[i],(int)jianwei2[i],(int)jianwei3[i],k[i]);
		}
		return 0;
	}






}

