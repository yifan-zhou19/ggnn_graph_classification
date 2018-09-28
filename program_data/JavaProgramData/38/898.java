package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] n = new int[100];
		double[][] a = new double[100][100];
		double[] all = new double[100];
		double[] aver = new double[100];
		double[] sqa = new double[100];
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
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			all[i] = 0;
			for (j = 0;j < n[i];j++)
			{
				all[i] = all[i] + a[i][j];
			}
			aver[i] = all[i] / (double)(n[i]);
		}
		for (i = 0;i < k;i++)
		{
			sqa[i] = 0;
			for (j = 0;j < n[i];j++)
			{
				sqa[i] = sqa[i] + (a[i][j] - aver[i]) * (a[i][j] - aver[i]);
			}
			s[i] = Math.sqrt(sqa[i] / (double)(n[i]));
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}


}

