package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] n = new int[100];
		int i;
		int j;
		double[] x = new double[1000];
		double ave = 0.00;
		double sum = 0.00;
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
					x[j] = Double.parseDouble(tempVar3);
				}
				ave = ave + x[j];
			}
			ave = ave / n[i];
			for (j = 0;j < n[i];j++)
			{
				sum = sum + (x[j] - ave) * (x[j] - ave);
			}
			s[i] = Math.sqrt(sum / n[i]);
			ave = 0.00;
			sum = 0.00;
		}
		System.out.printf("%.5f",s[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf("\n%.5f",s[i]);
		}
		return 0;
	}
}

