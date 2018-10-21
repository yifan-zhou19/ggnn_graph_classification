package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[11][3];
		float[][] d = new float[10][10];
		float h = 0.0F;
		float max = 0.0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				h = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]);
				d[i][j] = Math.sqrt(h);
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (d[i][j] > max)
					{
						max = d[i][j];
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (d[i][j] == max)
					{
						System.out.print("(");
						System.out.print(a[i][0]);
						System.out.print(",");
						System.out.print(a[i][1]);
						System.out.print(",");
						System.out.print(a[i][2]);
						System.out.print(")-(");
						System.out.print(a[j][0]);
						System.out.print(",");
						System.out.print(a[j][1]);
						System.out.print(",");
						System.out.print(a[j][2]);
						System.out.print(")=");
						System.out.printf("%.2f", d[i][j]);
						System.out.printf("%.2f", "\n");
						d[i][j] = -1F;
					}
				}
			}
			max = 0.0F;
		}
		return 0;
	}
}

