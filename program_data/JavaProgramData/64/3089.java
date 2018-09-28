package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		double[] a = new double[11];
		double[] b = new double[11];
		double[] c = new double[11];
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		double max;
		double[][] dis = new double[10][11];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < n;i++) //??
		{
			for (j = i + 1;j <= n;j++)
			{
				dis[i][j] = (double)Math.pow((double)Math.pow(a[i] - a[j],2) + (double)Math.pow(b[i] - b[j],2) + (double)Math.pow(c[i] - c[j],2),0.5);
				if (dis[i][j] < 0)
				{
					dis[i][j] = -dis[i][j];
				}
			}
		}
		for (k = 1;k <= n * (n - 1) / 2;k++) //?????????
		{
			max = dis[1][2];
			p = 1;
			q = 2;
			for (i = 1;i < n;i++)
			{
				for (j = i + 1;j <= n;j++)
				{
					if (dis[i][j] > max)
					{
						max = dis[i][j];
						p = i;
						q = j;
					}
				}
			}
			System.out.print('(');
			System.out.print((int)a[p]);
			System.out.print(',');
			System.out.print((int)b[p]);
			System.out.print(',');
			System.out.print((int)c[p]);
			System.out.print(')');
			System.out.print('-');
			System.out.print('(');
			System.out.print((int)a[q]);
			System.out.print(',');
			System.out.print((int)b[q]);
			System.out.print(',');
			System.out.print((int)c[q]);
			System.out.print(')');
			System.out.print('=');
			System.out.printf("%.2f", dis[p][q]);
			System.out.printf("%.2f", "\n");
			dis[p][q] = 0;
		}
		return 0;
	}
}

