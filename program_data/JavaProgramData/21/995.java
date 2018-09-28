package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[350];
		double[] b = new double[20];
		double temp;
		double sum = 0;
		int i;
		int j;
		int k = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
				a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum = sum + a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
		for (j = i;j < n;j++)
		{
						if (a[i] > a[j])
						{
									 temp = a[i];
									 a[i] = a[j];
									 a[j] = temp;
						}
		}
		}
		if (a[0] * n + a[n - 1] * n > sum * 2)
		{
								 for (i = 0;i < n;i++)
								 {
												 if (a[i] == a[n - 1])
												 {
															   b[k] = a[i];
															   k++;
												 }
								 }
		}
		if (a[0] * n + a[n - 1] * n == sum * 2)
		{
								 for (i = 0;i < n;i++)
								 {
												 if (a[i] == a[0] || a[i] == a[n - 1])
												 {
															   b[k] = a[i];
															   k++;
												 }
								 }
		}
		if (a[0] * n + a[n - 1] * n < sum * 2)
		{
								 for (i = 0;i < n;i++)
								 {
												 if (a[i] == a[0])
												 {
															   b[k] = a[i];
															   k++;
												 }
								 }
		}
		for (i = 0;i < k - 1;i++)
		{
		System.out.print(b[i]);
		System.out.print(",");
		}
		System.out.print(b[k - 1]);
			return 0;
	}
}

