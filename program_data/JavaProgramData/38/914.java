package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double[] num = new double[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		p = num;
		double sum;
		double aver;
		double a;
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + j = Double.parseDouble(tempVar3);
				}
				sum += (*(p + j));
			}
			aver = sum / m;
			sum = 0;
			for (j = 0;j < m;j++)
			{
				sum += Math.pow(((*(p + j)) - aver),2);
			}
			a = Math.sqrt(sum / m);
			System.out.printf("%.5lf\n",a);
		}
	}
}

