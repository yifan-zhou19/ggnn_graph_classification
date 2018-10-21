package <missing>;

public class GlobalMembers
{
	public static int[][] n = new int[100][3];
	public static int Main()
	{
		int m;
		int i;
		int j;
		int t;
		int[][] y = new int[100][2];
		int l = 0;
		double[][] k = new double[30][30];
		double max = 0;
		double[][] x = new double[30][30];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 3;j++)
			{
				n[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = m - 1;j > i;j--)
			{
				for (t = 0;t < 3;t++)
				{
					k[i][j] += (n[i][t] - n[j][t]) * (n[i][t] - n[j][t]);
				}
				k[i][j] = Math.sqrt(k[i][j]);
				x[i][j] = k[i][j];
			}
		}
		for (t = 1;t < m;t++)
		{
			l = l + t;
		}
		for (t = 0;t < l;t++)
		{
			max = 0;
			for (i = 0;i < m;i++)
			{
				for (j = i + 1;j < m;j++)
				{
					if (x[i][j] > max)
					{
						max = x[i][j];
						y[t][0] = i;
						y[t][1] = j;
					}
				}
			}
			x[y[t][0]][y[t][1]] = 0;
		}
		for (t = 0;t < l;t++)
		{
			System.out.print('(');
			System.out.print(n[y[t][0]][0]);
			System.out.print(',');
			System.out.print(n[y[t][0]][1]);
			System.out.print(',');
			System.out.print(n[y[t][0]][2]);
			System.out.print(')');
			System.out.print('-');
			System.out.print('(');
			System.out.print(n[y[t][1]][0]);
			System.out.print(',');
			System.out.print(n[y[t][1]][1]);
			System.out.print(',');
			System.out.print(n[y[t][1]][2]);
			System.out.print(')');
			System.out.print('=');
			System.out.printf("%.2f", k[y[t][0]][y[t][1]]);
			System.out.printf("%.2f", "\n");
		}
		char dd;
		dd = ConsoleInput.readToWhiteSpace(true).charAt(0);
		return 0;
	}






}

