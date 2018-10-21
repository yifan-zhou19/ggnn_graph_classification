package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double max = 0;
		double lmax;
		double[] a = new double[100];
		double[] b = new double[100];
		double[][] s = new double[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		   a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				s[i][j] = Math.pow((a[i] - a[j]),2) + Math.pow((b[i] - b[j]),2); //?????????????
			if (s[i][j] > max)
			{
				max = s[i][j]; //?????????????
			}
			}
		}
		lmax = Math.sqrt(max);
		System.out.printf("%.4f\n",lmax); //????????
		return 0;
	}
}

