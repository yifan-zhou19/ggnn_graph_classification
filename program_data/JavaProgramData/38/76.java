package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		double[] x = new double[100];
		double w;
		double sum;
		double a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0.0;
			for (i = 0;i < s;i++)
			{
				x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum = sum + x[i];
			}
			a = sum / s;
			sum = 0.0;
			for (i = 0;i < s;i++)
			{
				sum = sum + (x[i] - a) * (x[i] - a);
			}
			System.out.printf("%.5f", Math.sqrt(sum / s));
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

