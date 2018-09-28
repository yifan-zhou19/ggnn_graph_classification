package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			int n;
			double sum1 = 0;
			double sum2 = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < n;i++)
			{
				double a;
				a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum1 += a;
				sum2 += a * a;
			}
			double result = 0;
			double average = sum1 / n;
			result += sum2 + n * average * average-2 * average * sum1;
			result = result / n;
			result = Math.sqrt(result);
			System.out.printf("%.5f", result);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}

}

