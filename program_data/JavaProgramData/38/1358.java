package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //??????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			double[] x = new double[101]; //???????
			double[] p = x;
			double n;
			double sum = 0;
			n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < n;j++)
			{
				p[j] = ConsoleInput.readToWhiteSpace(true);
				sum += p[j]; //????
			}
			double ave;
			double s;
			ave = sum / n; //?????
			sum = 0;
			for (int j = 0;j < n;j++)
			{
				sum += Math.pow(p[j] - ave,2); //????
			}
			s = Math.sqrt(sum / n);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

