package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] c = new int[n];
		int i;
		int j;
		int k = 0;
		int t = 0;
		int sum = 0;
		int temp;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		double aver = (sum + 0.1) / n - 0.1 / n;
		double[] b = new double[n];
		double max = 0;
		for (i = 0;i < n;i++)
		{
			b[i] = a[i] - aver;
			b[i] = (b[i] > 0 ? b[i]: -b[i]);
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (j = 0;j < n;j++)
		{
			if (b[j] == max)
			{
				c[k++] = a[j];
				t = t + 1;
			}
		}
		if (t == 1)
		{
			System.out.print(c[0]);
			System.out.print("\n");
		}
		else
		{
			for (k = 1;k < t;k++)
			{
				for (j = 0;j < t - 1;j++)
				{
					if (c[j] > c[j + 1])
					{
						temp = c[j + 1];
						c[j + 1] = c[j];
						c[j] = temp;
					}
				}
			}
			for (k = 0;k < t - 1;k++)
			{
				System.out.print(c[k]);
				System.out.print(',');
			}
			System.out.print(c[k]);
			System.out.print("\n");
		}
		return 0;
	}

}

