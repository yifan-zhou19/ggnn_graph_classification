package <missing>;

public class GlobalMembers
{
	public static double fangcha(double[] array, int k)
	{
		double sum = 0;
		for (int i = 0;i < k;i++)
		{
			sum += array[i];
		}
		double arrange = sum / k;
		double[] array2 = new double[101];
		for (int i = 0;i < k;i++)
		{
			array2[i] = (array[i] - arrange) * (array[i] - arrange);
		}
		double sum2 = 0;
		for (int i = 0;i < k;i++)
		{
			sum2 += array2[i];
		}
		double result = Math.sqrt(sum2 / k);
		return result;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int k;
			double[] num = new double[101];
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < k;j++)
			{
				num[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.printf("%.5lf\n",fangcha(num, k));
		}
		return 0;
	}
}

