package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] chengji = new double[10];
		double[] xuefen = new double[10];
		double total = 0;
		int i;
		int j;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[i] = Double.parseDouble(tempVar2);
			}
			total += xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chengji[i] = Double.parseDouble(tempVar3);
			}
		}

		int[] a = {90, 85, 82, 78, 75, 72, 68, 64, 60, 0};
		double[] b = {4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.5, 1.0, 0};
		double sum = 0;

		for (i = 0;i < n;i++)
		{
			j = 0;
			while (a[j] > chengji[i])
			{
				j++;
			}

			sum += xuefen[i] * b[j];

		}
		sum /= total;
		System.out.printf("%.2f\n",sum);
		return 0;
	}

}

