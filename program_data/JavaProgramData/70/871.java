package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[999];
		double[] b = new double[999];
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double max = 0;
		int i;
		for (i = 0;i <= k - 1;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		int j;
		int m;
		double p;
		for (j = 0;j <= k - 1;j++)
		{
			for (m = 0;m <= k - 1;m++)
			{
				p = Math.sqrt((a[j] - a[m]) * (a[j] - a[m]) + (b[j] - b[m]) * (b[j] - b[m]));
				if (p > max)
				{
					max = p;
				}
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

