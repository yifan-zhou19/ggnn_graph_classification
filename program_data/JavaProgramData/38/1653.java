package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int[] geshu = new int[100];
		double[] shu = new double[100];
		double sum;
		double ave;
		double sss;
		double[] ans = new double[100];
		for (i = 0;i < a;i++)
		{
			sum = 0.0;
			ave = 0.0;
			sss = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				geshu[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < geshu[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shu[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + shu[j];
			}
			ave = sum / geshu[i];
			for (k = 0;k < geshu[i];k++)
			{
				sss = sss + (shu[k] - ave) * (shu[k] - ave);
			}
			ans[i] = (Math.sqrt(sss / geshu[i]));

		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%.5lf\n",ans[i]);
		}



		return 0;
	}
}

