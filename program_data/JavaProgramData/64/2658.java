package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int r;
		int t;
		float[] x = new float[10];
		float[] y = new float[10];
		float[] z = new float[10];
		float[][] d =
		{
			{-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F}
		};
		float max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			z[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				 d[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		}
		for (int k = 0;k < (n * (n - 1) / 2);k++)
		{
			max = 0F;
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (d[i][j] > max)
					{
							max = d[i][j];
							r = i;
							t = j;
					}
				}
			}
			d[r][t] = -1F;
			System.out.print('(');
			System.out.print(x[r]);
			System.out.print(',');
			System.out.print(y[r]);
			System.out.print(',');
			System.out.print(z[r]);
			System.out.print(")-(");
			System.out.print(x[t]);
			System.out.print(',');
			System.out.print(y[t]);
			System.out.print(',');
			System.out.print(z[t]);
			System.out.print(")=");
			System.out.printf("%.2f\n",max);
		}
	return 0;
	}
}

