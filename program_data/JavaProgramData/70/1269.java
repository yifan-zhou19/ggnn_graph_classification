package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[2000];
		double[] b = new double[2000];
		double k;
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		   a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				k = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]);
				if (k > max)
				{
					max = k;
				}
			}
		}
			max = Math.sqrt(max);
		System.out.printf("%.4f", max);
		System.out.printf("%.4f", "\n");

	return 0;
	}

}

