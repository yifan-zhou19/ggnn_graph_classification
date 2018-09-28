package <missing>;

public class GlobalMembers
{
	public static float[][] a = new float[100][1000];
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] n = new int[100];
		double[] p = new double[100];
		double[] s = new double[100];
		double[] sum = new double[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
				n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 0;j < n[i];j++)
				{
					a[i][j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				p[i] += a[i][j];
			}
		}
		for (i = 0;i < k;i++)
		{
			p[i] = p[i] / n[i];
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				sum[i] += Math.pow(a[i][j] - p[i],2);
			}
		}
		for (i = 0;i < k;i++)
		{
				s[i] = Math.sqrt(sum[i] / n[i]);
				System.out.printf("%.5f\n", s[i]);
		}
		return 0;
	}


}

