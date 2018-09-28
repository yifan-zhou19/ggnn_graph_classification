package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[20];
		int[] y = new int[20];
		int[] z = new int[20];
		int n;
		int[] flag1 = new int[200];
		int[] flag2 = new int[200];
		int i;
		int j;
		int k = 1;
		int p;
		double[] distance = new double[200];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= n; i++)
		{
			for (j = i + 1; j <= n; j++, k++)
			{
				distance[k] = Math.sqrt(Math.pow(x[i] - x[j], 2.0) + Math.pow(y[i] - y[j], 2.0) + Math.pow(z[i] - z[j], 2.0));
				flag1[k] = i;
				flag2[k] = j;
			}
		}
		for (k = 1; k <= n * (n - 1) / 2; k++)
		{
			for (i = 1; i <= n * (n - 1) / 2 + 1 - k; i++)
			{
				if (distance[i] < distance[i + 1])
				{
					t = distance[i];
					distance[i] = distance[i + 1];
					distance[i + 1] = t;
					p = flag1[i];
					flag1[i] = flag1[i + 1];
					flag1[i + 1] = p;
					p = flag2[i];
					flag2[i] = flag2[i + 1];
					flag2[i + 1] = p;
				}
			}
		}
		for (i = 1; i <= n * (n - 1) / 2; i++)
		{
			System.out.print("(");
			System.out.print(x[flag1[i]]);
			System.out.print(",");
			System.out.print(y[flag1[i]]);
			System.out.print(",");
			System.out.print(z[flag1[i]]);
			System.out.print(")-(");
			System.out.print(x[flag2[i]]);
			System.out.print(",");
			System.out.print(y[flag2[i]]);
			System.out.print(",");
			System.out.print(z[flag2[i]]);
			System.out.print(")=");
			System.out.printf("%.2f", distance[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

