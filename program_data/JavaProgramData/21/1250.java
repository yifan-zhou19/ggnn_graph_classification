package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double p;
		double sum = 0.0;
		int i;
		int n;
		int[] m = new int[300];
		int k = 0;
		int temp;
		double[] c = new double[300];
		double[] a = new double[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		p = sum / n;
		for (i = 0;i < n;i++)
		{
			double x = a[i] - p;
			c[i] = Math.abs(x);
		}
		double max = 0;
		for (i = 0;i < n;i++)
		{
			if (c[i] >= max)
			{
				max = c[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == max)
			{
				m[k] = i;
				k++;
			}
		}
		for (int j = 0;j < k - 1;j++)
		{
			for (int s = 0;s <= k - 1 - j;s++)
			{
				if (c[m[j]] < c[m[j + 1]])
				{
					temp = c[m[j]];
					c[m[j]] = c[m[j + 1]];
					c[m[j + 1]] = temp;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.print(a[m[i]]);
			System.out.print(",");
		}
		System.out.print(a[m[k - 1]]);
		System.out.print("\n");

	}
}

