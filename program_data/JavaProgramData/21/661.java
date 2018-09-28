package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] num = new double[500];
		int[] nums = new int[500];
		int i;
		int j;
		double sum = 0;
		for (i = 0; i < n; i++)
		{
			num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		sum = sum / n;
		double max = 0;
		for (i = 0; i < n; i++)
		{
			double s = Math.abs(num[i] - sum);
			if (s > max)
			{
				max = s;
			}

		}
		int shou = 0;
		for (i = 0; i < n; i++)
		{
			double p = Math.abs(num[i] - sum);
			if (Math.abs(p - max) < 1e-6)
			{
				if (shou != 0)
				{
					System.out.print(",");
				}
				shou = 1;
				System.out.print(num[i]);
			}
		}









	return 0;
	}
}

