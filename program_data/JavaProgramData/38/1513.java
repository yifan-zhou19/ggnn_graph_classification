package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int n;
			int j;
			double[] num = new double[100];
			double aver;
			double sum = 0;
			double s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double * p;
			double p;
			p = num;
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
					p + j = Double.parseDouble(tempVar3);
				}
				s += *(p + j);
			}
			aver = s / n;
			for (j = 0;j < n;j++)
			{
				sum += ((*(p + j) - aver) * (*(p + j) - aver));
			}
			sum /= n;
			s = Math.sqrt(sum);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}


}

