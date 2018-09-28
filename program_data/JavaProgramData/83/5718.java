package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num1 = new int[10];
		int i;
		int[] num2 = new int[10];
		double[] sum = new double[10];
		double sum1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num1[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num2[i] = Integer.parseInt(tempVar3);
			}
			if (num2[i] < 60)
			{
				sum[i] = 0.0;
			}
			else if (num2[i] <= 63)
			{
				sum[i] = 1.0;
			}
			else if (num2[i] <= 67)
			{
				sum[i] = 1.5;
			}
			else if (num2[i] <= 71)
			{
				sum[i] = 2.0;
			}
			else if (num2[i] <= 74)
			{
				sum[i] = 2.3;
			}
			else if (num2[i] <= 77)
			{
				sum[i] = 2.7;
			}
			else if (num2[i] <= 81)
			{
				sum[i] = 3.0;
			}
			else if (num2[i] <= 84)
			{
				sum[i] = 3.3;
			}
			else if (num2[i] <= 89)
			{
				sum[i] = 3.7;
			}
			else if (num2[i] <= 100)
			{
				sum[i] = 4.0;
			}
		}
		double sum2 = 0;
		sum1 = 0;
		for (i = 0;i < n;i++)
		{
			sum1 = (double)num1[i] + sum1;
			sum2 = (double)num1[i] * sum[i] + sum2;
		}
		sum2 = (double)sum2 / sum1;
		System.out.printf("%.2f",sum2);
	}
}

