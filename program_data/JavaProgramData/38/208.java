package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		double[] p;
		p = a;
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double sum1 = 0;
		double s;
		double sum2 = 0;

		for (int i = 1;i <= n;i++)
		{
			sum1 = 0;
			sum2 = 0;
			s = 0;
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < k;j++)
			{
				p[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum1 += p[j];
			}


			sum1 = sum1 / k;

			for (int l = 0;l < k;l++)
			{
				sum2 += (p[l] - sum1) * (p[l] - sum1);
			}

			sum2 = sum2 / k;
			s = Math.sqrt(sum2);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}

}

