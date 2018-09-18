package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] num = new double[300];
		double sum = 0;
		double min = 10000;
		double max = 0;
		double temp = 0;
		double aver;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		aver = 1.0 * sum / n;
		for (i = 0; i < n; i++)
		{
			if (Math.abs(num[i] - aver) >= temp)
			{
				temp = num[i] - aver;
				if (num[i] >= max)
				{
					max = num[i];
				}
				if (num[i] <= min)
				{
					min = num[i];
				}
			}
		}
		if (min == max)
		{
			System.out.print(min);
			System.out.print("\n");
		}
		else if ((max - aver) - (aver - min) > 0)
		{
			System.out.print(max);
			System.out.print("\n");
		}
		else if ((max - aver) - (aver - min) < 0)
		{
			System.out.print(min);
			System.out.print("\n");
		}
		else
		{
			System.out.print(min);
			System.out.print(",");
			System.out.print(max);
			System.out.print("\n");
		}
		return 0;
	}
}

