package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		double[] sz = new double[1000];
		double ave;
		double result = 0;
		double add;
		double sum = 0;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			int n;
			sum = 0;
			result = 0;
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
					sz[j] = Double.parseDouble(tempVar3);
				}

			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
			for (p = sz;p < sz + n;p++)
			{
				sum += *p;
			}
			ave = sum / (double)n;

			for (p = sz;p < sz + n;p++)
			{
				result += (*p - ave) * (*p - ave);
			}
			add = Math.sqrt(result / (double)n);
			System.out.printf("%.5lf\n",add);
		}

		return 0;
	}

}

