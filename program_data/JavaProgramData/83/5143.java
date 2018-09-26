package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xiajie = {100, 90, 85, 82, 78, 75, 72, 68, 64, 60, 0};
		double[] st = {0, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.5, 1.0, 0};
		int n;
		int[] score = new int[10];
		int defen;
		int i;
		int j;
		int sums = 0;
		double sumj = 0.0;
		double[] jidian = new double[10];
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
				score[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				defen = Integer.parseInt(tempVar3);
			}
			j = 0;
			while ((j < 10) && (defen < xiajie[j]))
			{
				jidian[i] = st[++j];
			}
			jidian[i] *= score[i];
		}
		for (i = 1;i <= n;i++)
		{
			sumj += jidian[i];
		}
		for (i = 1;i <= n;i++)
		{
			sums += score[i];
		}
		System.out.printf("%.2lf",1.0 * sumj / sums);
	}
}

