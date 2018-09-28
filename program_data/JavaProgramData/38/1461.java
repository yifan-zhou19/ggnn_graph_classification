package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
		int n;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		double[] num = new double[n];

		double sum = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num + i = tempVar3;
			}
			sum = sum + num[i];
		}


		double E;
		double D;
		double SUM = 0;
		E = sum / n;

		for (i = 0;i < n;i++)
		{
			num[i] = num[i] - E;
			SUM = SUM + num[i] * num[i];
		}
		D = SUM / n;

		System.out.printf("%.5lf\n",Math.sqrt(D));

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(num);
		}
		return 0;
	}
}

