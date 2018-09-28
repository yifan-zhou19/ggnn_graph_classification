package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[100001];
		double[] b = new double[19991];
		double ans = 0.0;
		int mmax = 0;

		for (i = 1;i <= n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n;i++)
		{
		for (int j = i + 1;j <= n;j++)
		{
			if ((sqrt)((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j])) > ans)
			{
				ans = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
				mmax = i;
			}
		}
		}
		System.out.printf("%.4f\n",ans);
	}

}

