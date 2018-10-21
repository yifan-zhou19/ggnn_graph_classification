package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] num = new double[310];
		double[] pianli = new double[310];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double sum = 0;
		for (int i = 0;i < n;i++)
		{
			num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		double average = sum / n;
		double max = 0;
		for (int i = 1;i <= n - 1;i++)
		{
			for (int j = 0;j < n - i;j++)
			{
				if (num[j] > num[j + 1])
				{
					double t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			pianli[i] = num[i] - average;
			if (pianli[i] <= 0.00001)
			{
				pianli[i] = -pianli[i];
			}
			if (max < pianli[i])
			{
				max = pianli[i];
			}
		}
		int douhao = 0;
		for (int i = 0;i < n;i++)
		{
			if (pianli[i] > max - 0.0001 && pianli[i] < max + 0.0001)
			{
				if (douhao != 0)
				{
					System.out.print(",");
				}
				System.out.print(num[i]);
				douhao++;
			}
		}

		return 0;
	}
}

