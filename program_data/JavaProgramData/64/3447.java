package <missing>;

public class GlobalMembers
{
	//******************************************
	//*???????.cpp                     **
	//*??: ??     1100012808              **
	//*???2011.12.07                       **
	//******************************************
	public static double[] d = new double[45];
	public static int n;
	public static void maopaopaixu(double[] d)
	{
		int i;
		int j;
		double t;
		for (i = 0; i < n * (n - 1) / 2; i++)
		{
			for (j = 0; j < n * (n - 1) / 2 - i; j++)
			{
				if (d[j] < d[j + 1])
				{
					t = d[j];
					d[j] = d[j + 1];
					d[j + 1] = t;
				}
			}
		}
	}
	public static int Main() //???
	{ //?????
		int i;
		int j;
		int k = 0;
		int flag;
		int[][] a = new int[11][3];
		int[][] g = new int[10][10];
		double[][] b =
		{
			{0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				d[k] = Math.sqrt((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
				b[i][j] = d[k];
				k++;
			}
		}
		maopaopaixu(d);
		for (k = 0; k < n * (n - 1) / 2; k++)
		{
			flag = 0;
			for (i = 0; i < n; i++)
			{
				for (j = i + 1; j < n; j++)
				{
					if (Math.abs(b[i][j] - d[k]) < 0.00000001 && g[i][j] == 0)
					{
						System.out.print("(");
						System.out.print(a[i][0]);
						System.out.print(",");
						System.out.print(a[i][1]);
						System.out.print(",");
						System.out.print(a[i][2]);
						System.out.print(")");
						System.out.print("-");
						System.out.print("(");
						System.out.print(a[j][0]);
						System.out.print(",");
						System.out.print(a[j][1]);
						System.out.print(",");
						System.out.print(a[j][2]);
						System.out.print(")");
						System.out.print("=");
						System.out.printf("%.2f", d[k]);
						System.out.printf("%.2f", "\n");
						flag = 1;
						g[i][j] = 1;
						break;
					}

				}
				if (flag != 0)
				{
						break;
				}
			}
		}
		return 0;
	} //?????

}

