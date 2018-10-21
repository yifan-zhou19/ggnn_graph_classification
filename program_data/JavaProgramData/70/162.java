public class po
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		po[] a;
		double b;
		double[] f;
		b = 0.0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = tangible.Arrays.initializeWithDefaultpoInstances(n);
		f = new double[n * n];
		for (i = 0;i < n;i++)
		{
			a[i].x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i].y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)

			{
				f[i * j] = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y));
			if (f[i * j] > b)
			{
				b = f[i * j];
			}
			}
		}

		System.out.printf("%.6d", b);
		return 0;
	}

}

