package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int k;
		double[] lie = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		double sum = 0;
		double s1 = 0;
		double s2 = 0;
		double ave;
		double sqrt = double x;
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
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					lie[j] = Double.parseDouble(tempVar3);
				}
				sum += lie[j];
			}
			ave = sum / (double)n;
			for (j = 0;j < n;j++)
			{
				s1 += (lie[j] - ave) * (lie[j] - ave);
			}
			s2 = Math.sqrt(s1 / (double)n);
			System.out.printf("%.5lf\n",s2);
			sum = 0;
			s1 = 0;
			s2 = 0;
		}
	}

}

