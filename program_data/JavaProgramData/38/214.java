package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= k - 1;i++)
		{
		double n;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[100];
		double sum = 0;
		double pingjun;
		double sum1 = 0;
		for (int s = 0;s <= n - 1;s++)
		{
			a[s] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}


		for (int s = 0;s <= n - 1;s++)

		{
			sum = sum + a[s];

		}
		pingjun = sum / n;
		for (int s = 0;s <= n - 1;s++)
		{
			sum1 = sum1 + (a[s] - pingjun) * (a[s] - pingjun);
		}
		System.out.printf("%.5f", Math.sqrt((1 / n) * sum1));
		System.out.printf("%.5f", "\n");
		}
	return 0;
	}


}

