package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		double[] shuzu = new double[1001];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		int i;
		double sum1 = 0;
		double sum2 = 0;
		double average;
		double S;

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
				n = Integer.parseInt(tempVar2);
			}
			for (p = shuzu;p < shuzu + n;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				sum1 += *p;
			}
			average = sum1 / n;

			for (p = shuzu;p < shuzu + n;p++)
			{
				sum2 += (*p - average) * (*p - average);
			}
			sum2 /= n;
			S = Math.sqrt(sum2);

			System.out.printf("%.5lf\n",S);
			sum1 = 0;
			sum2 = 0;
		}

		return 0;
	}

}

