package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			int n;
			double[] a = new double[100];
			double average = 0;
			double s = 0;
			double sum = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < n;j++)
			{
			a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0;j < n;j++)
			{
			sum += a[j];
			}
			average = sum / n;
			for (j = 0;j < n;j++)
			{
			s += (a[j] - average) * (a[j] - average);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}

}

