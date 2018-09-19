package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n + 1];
		double[] dif = new double[n + 1];
		double ave;
		double sum = 0;
		double max = 0;
		for (i = 1;i < n + 1;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + x[i];
		}
		ave = sum / n;
		for (i = 1;i < n + 1;i++)
		{
			for (j = i;j < n + 1;j++)
			{
				if (x[j] < x[i])
				{
					t = x[i];
					x[i] = x[j];
					x[j] = t;
				}
			}
		}
		for (i = 1;i < n + 1;i++)
		{
			dif[i] = x[i] - ave;
			if (dif[i] < 0)
			{
				dif[i] = -dif[i];
			}
			if (dif[i] > max)
			{
				max = dif[i];
			}
		}
		int flag = 0;
		for (i = 1;i < n + 1;i++)
		{
			if (dif[i] == max)
			{
				if (flag == 0)
				{
					System.out.print(x[i]);
					flag++;
				}
				else
				{
					System.out.print(",");
					System.out.print(x[i]);
				}
			}
		}
		return 0;
	}
}

