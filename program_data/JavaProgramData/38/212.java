package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double S;
		double mean;
		double sum = 0;
		while (k-- != 0)
		{
			double[] num = new double[101];
			double[] p = num;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
				num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum += num[i];
			}
			mean = sum / n;
			sum = 0;
			while (i > 0)
			{
				sum += Math.pow(p[(--i)] - mean,2);
			}
			mean = sum / n;
			S = Math.sqrt(mean);
			sum = 0;
			System.out.printf("%.5f", S);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}

}

