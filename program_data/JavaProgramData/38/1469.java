package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i = 0;
		int j;
		int num;
		double[] shuzu = new double[101];
		double a;
		double a_1;
		double average;
		double average_1;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
		a = 0;
		a_1 = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < num;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			shuzu + j = tempVar3;
		}
		a += shuzu[j];
		}
		average = a / num;
		for (j = 0;j < num;j++)
		{
		a_1 += (shuzu[j] - average) * (shuzu[j] - average);
		}
		average_1 = a_1 / num;
		s = Math.sqrt(average_1);
		System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

