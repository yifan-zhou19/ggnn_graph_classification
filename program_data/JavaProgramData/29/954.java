package <missing>;

public class GlobalMembers
{
	public static double F(double x)
	{
		double result = 0;
		double a = 2;
		double b = 1;
		double temp;
		int j;
		for (j = 0;j < x;j++)
		{
			result += (double)(a / b);
			temp = a;
			a = a + b;
			b = temp;
		}
		return result;
	}

	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		double[] shuzu = new double[m];
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(shuzu[i]) = Double.parseDouble(tempVar2);
			}
			shuzu[i] = F(shuzu[i]);
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n", shuzu[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(shuzu);
		return 0;
	}

}

