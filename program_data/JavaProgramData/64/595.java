package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int i;
		int j;
		int[] h = new int[200];
		int[] l = new int[200];
		int t = 1;
		int q;
		int z;
		double[] d = new double[200];
		double k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				d[t] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
				h[t] = i;
				l[t] = j;
				t++;
			}
		}
		for (i = 1;i <= n * (n - 1) / 2 - 1;i++)
		{
			for (j = 1;j <= n * (n - 1) / 2 - i;j++)
			{
				if (d[j] < d[j + 1])
				{
					k = d[j];
					d[j] = d[j + 1];
					d[j + 1] = k;
					z = h[j];
					h[j] = h[j + 1];
					h[j + 1] = z;
					z = l[j];
					l[j] = l[j + 1];
					l[j + 1] = z;

				}
			}
		}
		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			System.out.print("(");
			System.out.print(a[h[i]]);
			System.out.print(",");
			System.out.print(b[h[i]]);
			System.out.print(",");
			System.out.print(c[h[i]]);
			System.out.print(")-(");
			System.out.print(a[l[i]]);
			System.out.print(",");
			System.out.print(b[l[i]]);
			System.out.print(",");
			System.out.print(c[l[i]]);
			System.out.print(")=");
			System.out.printf("%.2f\n",d[i]);
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

