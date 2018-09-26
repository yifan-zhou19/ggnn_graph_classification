package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
			double p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (double)malloc((Double.SIZE / Byte.SIZE) * n);
			int j;
			double sum = 0.0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + j = Double.parseDouble(tempVar3);
				}
				sum += *(p + j);
			}
			double average;
			average = sum / n;
			double sum2 = 0.0;
			for (j = 0;j < n;j++)
			{
				sum2 += (*(p + j) - average) * (*(p + j) - average);
			}
			double ave = sum2 / n;
			double s;
			s = Math.sqrt(ave);
			System.out.printf("%.5lf\n",s);
		}
	}
}

