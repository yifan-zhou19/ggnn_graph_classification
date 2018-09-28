package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int i = 0;
		int j = 0;
		int a = 0;
		int b = 0;
		double i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		int i5 = 0;
		double[] x = new double[10];
		double[] y = new double[10];
		double[] z = new double[10];
		double[] distance = new double[100];
		int[] p = new int[100];
		int[] q = new int[100];
		int[] p1 = new int[100];
		int[] q1 = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < n;m++)
		{
			x[m] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[m] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z[m] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 100;i++)
		{
			p[i] = 0;
			q[i] = 0;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
					distance[b] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
					p[b] = i;
					q[b] = j;
					//cout<<p[b]<<q[b];
					b++;
			}
		}
		i4 = 0;
		i5 = 0;
		for (i4 = 0;i4 < n * (n - 1) / 2 - 1;i4++)
		{
			for (i5 = i4 + 1;i5 < n * (n - 1) / 2;i5++)
			{
				if (distance[i5] > distance[i4])
				{
					i1 = distance[i4];
					distance[i4] = distance[i5];
					distance[i5] = i1;
					i2 = p[i4];
					p[i4] = p[i5];
					p[i5] = i2;
					i3 = q[i4];
					q[i4] = q[i5];
					q[i5] = i3;
				}

			}
		}
		i = 0;
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			if (distance[i] == distance[i + 1])
			{
				if (p[i] > p[i + 1])
				{
					i2 = p[i + 1];
					p[i + 1] = p[i];
					p[i] = i2;
					i3 = q[i + 1];
					q[i + 1] = q[i];
					q[i] = i3;
				}
				if (p[i] == p[i + 1] && q[i] > q[i + 1])
				{
					i2 = p[i + 1];
					p[i + 1] = p[i];
					p[i] = i2;
					i3 = q[i + 1];
					q[i + 1] = q[i];
					q[i] = i3;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.print("(");
			System.out.print(x[p[i]]);
			System.out.print(",");
			System.out.print(y[p[i]]);
			System.out.print(",");
			System.out.print(z[p[i]]);
			System.out.print(")");
			System.out.print("-(");
			System.out.print(x[q[i]]);
			System.out.print(",");
			System.out.print(y[q[i]]);
			System.out.print(",");
			System.out.print(z[q[i]]);
			System.out.print(")=");
			System.out.printf("%.2lf\n",distance[i]);
		}
		return 0;
	}

}

