package <missing>;

public class GlobalMembers
{
	public static double[] num = new double[400];
	public static double[] dis = new double[400];

	public static int Main()
	{
		int n;
		int i;
		int j;
		double temp;
		double ave = 0;
		final double min = 1e-6;
		double max = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			 num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 ave += num[i];
		}
		ave = ave / n;
		for (i = n - 2;i >= 0;i--)
		{
			for (j = 0;j <= i;j++)
			{
				if (num[j] > num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			dis[i] = Math.abs(num[i] - ave);
		}
		for (i = 0;i < n;i++)
		{
			if (max < dis[i])
			{
				max = dis[i];
			}
		}
		for (j = n - 1;j >= 0;j--)
		{
			if (Math.abs(max - dis[j]) < min)
			{
				break;
			}
		}
		for (i = 0;i < j;i++)
		{
				if (Math.abs(max - dis[i]) < min)
				{
					System.out.print(num[i]);
					System.out.print(",");
				}
		}
		System.out.print(num[j]);


		return 0;
	}

}

