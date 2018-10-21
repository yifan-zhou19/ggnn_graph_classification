package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[10000];
		double[] b = new double[10000];
		double[] c = new double[10000];
		double[][] d = new double[10000][2];
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (a[i] < 0)
			{
				a[i] = -a[i],b[i] = -b[i],c[i] = -c[i];
				if (b[i] * b[i] - 4 * a[i] * c[i] >= 0)
				{
					d[i][0] = (-b[i]) / (2 * a[i]);
					d[i][1] = (Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				}
				if (b[i] * b[i] - 4 * a[i] * c[i] < 0)
				{
					d[i][0] = (-b[i]) / (2 * a[i]);
					d[i][1] = (Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i])) / (2 * a[i]);
				}
			}
			if (a[i] > 0)
			{
				if (b[i] * b[i] - 4 * a[i] * c[i] >= 0)
				{
					d[i][0] = (-b[i]) / (2 * a[i]);
					d[i][1] = (Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				}
				if (b[i] * b[i] - 4 * a[i] * c[i] < 0)
				{
					d[i][0] = (-b[i]) / (2 * a[i]);
					d[i][1] = (Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i])) / (2 * a[i]);
				}
			}
		}
		for (j = 1;j <= n;j++)
		{
			if (b[j] * b[j] - 4 * a[j] * c[j] > 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", d[j][0] + d[j][1]);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", d[j][0] - d[j][1]);
				System.out.printf("%.5f", "\n");
			}
			if (b[j] * b[j] - 4 * a[j] * c[j] == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", d[j][0]);
				System.out.printf("%.5f", "\n");
			}
			if (b[j] * b[j] - 4 * a[j] * c[j] < 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", d[j][0]);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", d[j][1]);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", d[j][0]);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", d[j][1]);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

