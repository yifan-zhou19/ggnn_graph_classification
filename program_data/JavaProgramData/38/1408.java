package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double sum = 0;
			double[] a = new double[100];
			double[] p = a;
			for (int i = 0;i < m;i++)
			{

				p[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum += p[0];
				p++;
			}
			p = a;
			double ava = sum / m;
			double sq = 0;
			for (int i = 0;i < m;i++)
			{
				sq += (p[0] - ava) * (p[0] - ava);
				p++;
			}
			System.out.printf("%.5f\n", Math.sqrt(sq / m));

		}

	}
}

