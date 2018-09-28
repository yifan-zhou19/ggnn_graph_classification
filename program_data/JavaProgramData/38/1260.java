package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int k;
		int i;
		int j;
		double[] b = new double[100];
		double cnt;
		double average;
		double s;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			average = 0;
			cnt = 0;
			s = 0;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < a[i];j++)
			{
				b[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				average += b[j];
			}
			average = average / a[i];
			for (j = 0;j < a[i];j++)
			{
				cnt += (b[j] - average) * (b[j] - average);
			}
			cnt = cnt / a[i];
			s = Math.sqrt(cnt);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

