package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		double[] data = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int n;
			int j;
			double sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					data[j] = Double.parseDouble(tempVar3);
				}
				sum += data[j];
			}
			sum /= n;
			double s = 0;
			for (j = 0;j < n;j++)
			{
				s += Math.pow((data[j] - sum),2);
			}
			System.out.printf("%.5f\n",Math.sqrt(s / n));
		}
		return 0;
	}

}

