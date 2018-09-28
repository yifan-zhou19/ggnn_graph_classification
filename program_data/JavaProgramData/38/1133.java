package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] k = new int[100];
		double[][] num = new double[100][100]; //?????
		double average;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			k[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < k[i];j++)
			{
				num[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < n;i++)
		{
			double total = 0.0;
			double sum = 0.0;
			double answer;
			for (int j = 0;j < k[i];j++)
			{
			  total += num[i][j];
			}
			average = total / k[i];
			for (int j = 0;j < k[i];j++)
			{
				sum += (num[i][j] - average) * (num[i][j] - average);
			}
			sum = sum / k[i];
			answer = Math.sqrt(sum);
			System.out.printf("%.5f", answer);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}

}

