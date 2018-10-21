package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double m = 0;
		double[] a = new double[110];
		double[] b = new double[110];
		double[] c = new double[110];
		double max = 0;
		double[][] s = new double[110][110];
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
			s[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
			if (s[i][j] > max)
			{
			max = s[i][j];
			}
		   }
		}

		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}

