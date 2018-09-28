package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] shuzu = new double[K][N];
		int k;
		int n;
		int i;
		int j;
		double sum_a = 0;
		double a;
		double sum_s = 0;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shuzu[j][i] = Double.parseDouble(tempVar3);
				}
				sum_a += shuzu[j][i];
			}
			a = sum_a / n;
			for (i = 0;i < n;i++)
			{
				sum_s += (shuzu[j][i] - a) * (shuzu[j][i] - a);
			}
			s = Math.sqrt(sum_s / n);
			System.out.printf("%.5lf\n",s);
			sum_a = 0;
			sum_s = 0;
		}
		return 0;
	}
}

