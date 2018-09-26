package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		double[] x = new double[1010];
		double sum;
		double a;
		double s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			s = 0;
			a = 0;
			for (int j = 0;j < m;j++)
			{
				x[j] = ConsoleInput.readToWhiteSpace(true);
				sum = sum + x[j];
			}
			a = sum / m;
			for (int j = 0;j < m;j++)
			{
				s = s + Math.pow(x[j] - a,2);
			}
			s = s / m;
			s = Math.sqrt(s);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

