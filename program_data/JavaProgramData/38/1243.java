package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double[] a = new double[100];
		double sum;
		double ave;
		double s2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			p = a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + j - 1 = Double.parseDouble(tempVar3);
				}
				sum += *(p + j - 1);
			}
			ave = sum / n;
			s2 = 0;
			for (j = 1;j <= n;j++)
			{
				s2 += (*(p + j - 1) - ave) * (*(p + j - 1) - ave);
			}
			System.out.printf("%.5lf\n",Math.sqrt(s2 / n));
		}

	}
}

