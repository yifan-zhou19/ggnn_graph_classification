package <missing>;

public class GlobalMembers
{
	public static int days(int m1, int m2, int[] e)
	{
		int sum = 0;
		for (int i = m2;i < m1;i++)
		{
			sum += e[i];
		}
		System.out.print(sum);
		System.out.print("\n");
		return sum + 1;
	}


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int k;
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[] a = new double[200];
			for (int i = 0;i < k;i++) //????
			{
				a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			double sum = 0;
			double average;
			for (int i = 0;i < k;i++) //?????
			{
				sum += a[i];
			}
			average = sum / k;
			sum = 0;
			for (int i = 0;i < k;i++)
			{
				sum += (a[i] - average) * (a[i] - average);
			}
			sum = sum / k; //????
			System.out.printf("%.5f", Math.sqrt(sum));
			System.out.printf("%.5f", "\n");
		}
	 return 0;

	}



}

