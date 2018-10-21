package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i = 0;
		int k = 0;
		double x_1 = 1;
		double x_2 = 1;
		double x_3 = 2;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			n = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < n;k++)
			{

				x_3 = x_1 + x_2;
				sum += x_3 / x_2;
				x_1 = x_2;
				x_2 = x_3;
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0;
			x_3 = 2;
			x_1 = 1;
			x_2 = 1;
		}


	}


}

