package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][3];
		int[][] dian = new int[50][2];
		int n;
		int i;
		int j;
		int k = 0;
		int m;
		double[] d = new double[50];
		double temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
				dian[k][0] = i;
				dian[k][1] = j;
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (d[j] < d[j + 1])
				{
					temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
					m = dian[j][0],dian[j][0] = dian[j + 1][0],dian[j + 1][0] = m;
					m = dian[j][1],dian[j][1] = dian[j + 1][1],dian[j + 1][1] = m;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.print("(");
			System.out.print(a[dian[i][0]][0]);
			System.out.print(",");
			System.out.print(a[dian[i][0]][1]);
			System.out.print(",");
			System.out.print(a[dian[i][0]][2]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(a[dian[i][1]][0]);
			System.out.print(",");
			System.out.print(a[dian[i][1]][1]);
			System.out.print(",");
			System.out.print(a[dian[i][1]][2]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", d[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

