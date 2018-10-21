package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		float[] x = new float[1001];
		double s;
		double sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			sum = 0.0;
			s = 0.0;
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < k;j++)
			{
				x[j] = ConsoleInput.readToWhiteSpace(true);
				sum += x[j];
			}
			sum = sum / k;
			for (j = 0;j < k;j++)
			{
				s = s + (sum - x[j]) * (sum - x[j]);
			}
			s = Math.sqrt(s / k);
			System.out.printf("\n%.5f",s);
		}
		return 0;
	}
}

