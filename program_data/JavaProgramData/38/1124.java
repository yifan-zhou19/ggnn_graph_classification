package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n1;
		int i;
		int j;
		int[] hhh = new int[k];
		double[][] h = new double[k][k];
		double[] hh = new double[k];
		double[] s = new double[k];
		double[] r = new double[k];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				hhh[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < hhh[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[i][j] = Double.parseDouble(tempVar3);
				}
				hh[i] += h[i][j];
			}
		}
		for (i = 0;i < n1;i++)
		{
			for (j = 0;j < hhh[i];j++)
			{
				r[i] += Math.pow(h[i][j] - hh[i] / hhh[i],2);
			}
			s[i] = Math.sqrt(r[i] / hhh[i]);
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}
}

