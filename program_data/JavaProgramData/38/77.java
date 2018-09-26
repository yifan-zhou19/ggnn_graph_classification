package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[] a = new double[100];
			double[] p = a;
			for (j = 0;j < n;j++)
			{
				p[j] = ConsoleInput.readToWhiteSpace(true);
			}
			double averge;
			double sum = 0;
			double s;
			for (j = 0;j < n;j++)
			{
				sum = sum + p[j];
			}
			averge = sum / n;
			sum = 0;
			for (j = 0;j < n;j++)
			{
				sum = sum + (p[j] - averge) * (p[j] - averge);
			}
			s = Math.sqrt(sum / n);
			System.out.printf("%.5f\n", s);
		}
		return 0;
	}

}

