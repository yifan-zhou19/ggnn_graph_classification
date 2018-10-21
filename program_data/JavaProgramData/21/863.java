package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count = 0;
		int flag = 0;
		int i;
		int j;
		double x = 0.0;
		double max = 0.0;
		double[] num = new double[301];
		double n;
		double temp;
		double[] b = new double[301];
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			x = x + num[i];
		}
		x = x / n;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (num[j] > num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			if (num[i] >= x)
			{
				b[i] = num[i] - x;
			}
			else
			{
				b[i] = x - num[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (b[i] == max)
			{
				if (flag == 0)
				{
					System.out.print(num[i]);
					flag = 1;
				}
				else
				{
					System.out.print(',');
					System.out.print(num[i]);
				}
			}
		}
		return 0;
	}
}

