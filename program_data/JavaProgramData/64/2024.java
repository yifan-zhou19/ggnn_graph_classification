package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int i;
		int j;
		for (i = 0;i <= n - 1;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		float[] d = new float[45];
		int[] s = new int[45];
		int[] e = new int[45];
		int t = 0;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				d[t] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				s[t] = i,e[t] = j;
				t++;
			}
		}
		float tempd;
		int temp;
		for (i = 0;i <= t - 2;i++)
		{
			for (j = t - 1;j >= i + 1;j--)
			{
				if (d[j] > d[j - 1])
				{
					tempd = d[j];
					d[j] = d[j - 1];
					d[j - 1] = tempd;
					temp = s[j];
					s[j] = s[j - 1];
					s[j - 1] = temp;
					temp = e[j];
					e[j] = e[j - 1];
					e[j - 1] = temp;
				}
			}
		}
		for (i = 0;i <= t - 1;i++)
		{
			System.out.printf("%.2f", "(");
			System.out.printf("%.2f", x[s[i]]);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", y[s[i]]);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", z[s[i]]);
			System.out.printf("%.2f", ")-(");
			System.out.printf("%.2f", x[e[i]]);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", y[e[i]]);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", z[e[i]]);
			System.out.printf("%.2f", ")=");
			System.out.printf("%.2f", d[i]);
			System.out.printf("%.2f", "\n");
		}
	}
}

