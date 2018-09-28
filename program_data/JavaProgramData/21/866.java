package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n];
		double[] dis = new double[n];
		double average;
		double sum;
		double temp0;
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		average = sum / n;
		for (i = 0;i < n;i++)
		{
			dis[i] = Math.abs(a[i] - average);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (dis[j] > dis[j + 1])
				{
					temp0 = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = temp0;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (dis[i] == dis[n - 1])
			{
				System.out.print(a[i]);
				i++;
				break;
			}
		}
		if (i <= n - 1)
		{
			for (j = i;j < n;j++)
			{
				System.out.print(',');
				System.out.print(a[j]);
			}
		}
		return 0;
	}
}

