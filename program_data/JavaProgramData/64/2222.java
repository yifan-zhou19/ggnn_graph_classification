package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int x;
		int y;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] e = new int[100];
		double[] d = new double[100];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				e[t] = 10 * i + j;
			d[e[t]] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
			t++;
			}
		}
		for (i = 1;i < t;i++)
		{
			for (j = 0;j < t - i;j++)
			{
				if (d[e[j]] < d[e[j + 1]])
				{
			m = e[j];
			e[j] = e[j + 1];
			e[j + 1] = m;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			x = e[i] % 10;
		y = (e[i] - x) / 10;
		System.out.print("(");
		System.out.print(a[y]);
		System.out.print(",");
		System.out.print(b[y]);
		System.out.print(",");
		System.out.print(c[y]);
		System.out.print(")-(");
		System.out.print(a[x]);
		System.out.print(",");
		System.out.print(b[x]);
		System.out.print(",");
		System.out.print(c[x]);
		System.out.print(")=");
		System.out.printf("%.2f", d[e[i]]);
		System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

