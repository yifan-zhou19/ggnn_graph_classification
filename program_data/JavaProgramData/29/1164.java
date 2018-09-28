package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int temp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		double[] sum = new double[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			l = 1;
			k = 2;
			sum[i] = 0;
			for (j = 0;j < n;j++)
			{
			   sum[i] = sum[i] + 1.0 * k / l;
			   temp = l + k;
			   l = k;
			   k = temp;
			}

		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%.3lf\n",sum[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sum);
		return 0;
	}
}

