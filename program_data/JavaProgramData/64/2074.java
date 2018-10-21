package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j = 1;
		int[] x = new int[11];
		int[] y = new int[11];
		int[] z = new int[11];
		int a;
		int b;
		int k;
		double[] d = new double[50];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < n;i++)
		{
			for (k = i + 1;k <= n;k++)
			{
			d[j] = Math.sqrt(Math.pow(x[i] - x[k],2.0) + Math.pow(y[i] - y[k],2.0) + Math.pow(z[i] - z[k],2.0));
			j++;
			}
		}
		for (j = 1;j <= (n * (n - 1) / 2 - 1);j++)
		{
			for (i = 1;i <= (n * (n - 1) / 2 - j);i++)
			{
				if (d[i] < d[i + 1])
				{
					t = d[i];
					d[i] = d[i + 1];
					d[i + 1] = t;
				}
			}
		}
		for (i = 1;i <= (n * (n - 1) / 2);i++)
		{
			if (d[i] == d[i + 1])
			{
				continue;
			}
			for (a = 1;a < n;a++)
			{
				for (b = a + 1;b <= n;b++)
				{
					if (Math.sqrt(Math.pow(x[a] - x[b],2.0) + Math.pow(y[a] - y[b],2.0) + Math.pow(z[a] - z[b],2.0)) == d[i])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[a],y[a],z[a],x[b],y[b],z[b],d[i]);
					}
				}
			}
		}
		return 0;
	}
}

