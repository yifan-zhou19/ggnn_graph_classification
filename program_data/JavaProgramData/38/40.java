package <missing>;

public class GlobalMembers
{
	// shang.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < num;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] x = new double[101];
			double sum = 0;
			double ave;
			double final = 0;
			double result;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = tempVar3;
				}
				sum = sum + x[j];
			}
			ave = sum / n;
			for (j = 0;j < n;j++)
			{
				final = final + (x[j] - ave) * (x[j] - ave);
			}
			result = Math.sqrt(final / n);
			System.out.printf("%.5f\n",result);
		}
	}


}

