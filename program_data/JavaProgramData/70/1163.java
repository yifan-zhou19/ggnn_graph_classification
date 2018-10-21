package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] a = new double[100][2];
		double[] k = new double[10000];
		double p = 0;
		for (i = 0 ; i < n ; i++)
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0 ; i < n ; i++)
		{
			for (j = i + 1 ; j < n ; j++)
			{
				k[t++] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
			}
		}
		for (i = 0 ; i < t ; i++)
		{
			if (k[i] > p)
			{
				p = k[i];
			}
		}
		System.out.printf("%.4f\n", p);
	}



}

