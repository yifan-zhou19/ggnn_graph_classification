package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[100]; //?????x?y???????d???????max??????
		double[] y = new double[100];
		double[] d = new double[5000];
		double max = 0;
		int n; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n - 1;i++) //????????????
		{
			for (int j = i + 1;j <= n;j++)
			{
				d[(2 * n - i) * (i - 1) / 2 + j - i] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]); //???????
				if (d[(2 * n - i) * (i - 1) / 2 + j - i] > max) //??????????
				{
					max = d[(2 * n - i) * (i - 1) / 2 + j - i]; //?????????
				}
			}
		}
		max = Math.sqrt(max); //??????
		System.out.printf("%.4f", max);
		System.out.printf("%.4f", "\n");
		return 0;
	}

}

