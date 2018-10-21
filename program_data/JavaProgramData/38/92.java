package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		 double[] a = new double[1001];
		 double evg;
		 double sum = 0;
		 double[] p = a;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			sum = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
				p[i] = ConsoleInput.readToWhiteSpace(true);
				sum += p[i];
			}
		evg = sum / n;
		sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += (p[i] - evg) * (p[i] - evg);
		}
		sum /= n;
		sum = Math.sqrt(sum);
		System.out.printf("%.5f", sum);
		System.out.printf("%.5f", "\n");
		}

			return 0;
	}


}

