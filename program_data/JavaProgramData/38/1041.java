package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int j;
		int n;
		int i;
		double sum = 0;
		double ave = 0;
		double s = 0;
		double out;
		double[] sz = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= k;j++)
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
					sz[i] = tempVar3;
				}
				sum = sum + sz[i];
			}
			ave = sum / n;
			for (i = 0;i < n;i++)
			{
				s = s + (sz[i] - ave) * (sz[i] - ave);
			}
			out = Math.sqrt(s / n);
			System.out.printf("%.5f\n",out);
			sum = 0;
			s = 0;
		}
		return 0;
	}

}

