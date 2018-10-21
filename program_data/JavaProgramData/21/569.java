package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double t;
		double[] b = new double[300];
		double[] a = new double[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double num;
		double sum = 0;
		for (i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}

		num = sum / n;
		double max = 0;

		for (i = 0; i < n; i++)
		{
			if (Math.abs(num - a[i]) > max)
			{
				max = Math.abs(num - a[i]);

			}
		}
		int j = 0;
		for (i = 0; i < n; i++)
		{
			double cha = Math.abs(num - a[i]);
			if (cha - max == 0)
			{
				b[j] = a[i];
				j++;
			}
		}

		for (i = 0; i < j - 1; i++)
		{
			for (k = 0; k < j - i - 1; k++)
			{
				if (b[k] > b[k + 1])
				{
					t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
				}
			}
		}

		for (i = 0; i < j - 1; i++)
		{
			System.out.print(b[i]);
			System.out.print(",");
		}
		System.out.print(b[j - 1]);
		return 0;
	}
}

