package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int k = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[11];
		double[] y = new double[11];
		double[] z = new double[11];
		double[][] dis = new double[11][11];
		double[] temp = new double[50];
		double ins;
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[i][j] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]); //?i???j????????
				temp[k] = dis[i][j]; //??????????
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{ //?????????
			for (j = 0;j < k - i - 1;j++)
			{
				if (temp[j] > temp[j + 1])
				{
					ins = temp[j + 1];
					temp[j + 1] = temp[j];
					temp[j] = ins;
				}
			}
		}
		for (l = k - 1;l >= 0;l--)
		{ //????
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (dis[i][j] == temp[l])
					{ //????????????????
						System.out.printf("%f", '(');
						System.out.printf("%f", x[i]);
						System.out.printf("%f", ',');
						System.out.printf("%f", y[i]);
						System.out.printf("%f", ',');
						System.out.printf("%f", z[i]);
						System.out.printf("%f", ")-(");
						System.out.printf("%f", x[j]);
						System.out.printf("%f", ',');
						System.out.printf("%f", y[j]);
						System.out.printf("%f", ',');
						System.out.printf("%f", z[j]);
						System.out.printf("%f", ")=");
						System.out.printf("%.2f", Math.sqrt(temp[l]));
						System.out.printf("%.2f", "\n");
						//??????
						dis[i][j] = -1; //??????????????????-1?????temp[]??
					}

				}
			}
		}
		return 0;


	}

}

