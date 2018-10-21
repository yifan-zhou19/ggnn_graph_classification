package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int i;
		int j;
		int k;
		double[] a = new double[100]; //????
		double t = 0;
		double d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 2 * n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j <= n;j++)
		{
			for (k = j + 1;k <= n;k++)
			{
				d = Math.sqrt((a[2 * j - 1] - a[2 * k - 1]) * (a[2 * j - 1] - a[2 * k - 1]) + (a[2 * j] - a[2 * k]) * (a[2 * j] - a[2 * k])); //??????????
				if (d > t)
				{
					t = d; //??d>t,t=d
				}
			}
		}
		System.out.printf("%.4f", t);
		System.out.printf("%.4f", "\n");
		return 0;
	}
}

