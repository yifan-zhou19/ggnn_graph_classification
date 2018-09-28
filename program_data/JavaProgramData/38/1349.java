package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[100];
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			double n;
			n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			int i;
			double sum = 0;
			double ave;
			double result;
			double s = 0;
			for (i = 0;i < n;i++)
			{
				x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum += x[i];
			}
			ave = sum / n;
			for (i = 0;i < n;i++)
			{
				s = s + (x[i] - ave) * (x[i] - ave);
			}
			result = Math.sqrt(s / n);
			System.out.printf("%.5f", result);
			System.out.printf("%.5f", "\n");
			k--;
		}
		return 0;
	}
}

