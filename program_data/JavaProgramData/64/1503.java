package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double x;
		double y;
		double z;
		int[][] a = new int[10][3];
		double[] b = new double[45];
		int[] c = new int[45];
		int[] d = new int[45];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				x = y = z = 0;
				x = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]);
				y = (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
				z = (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]);
				b[k] = Math.sqrt(x + y + z);
				c[k] = i;
				d[k] = j;
				k++;
			}
		}
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - i - 1;j++)
			{
				if (b[j] < b[j + 1])
				{
						x = b[j];
						b[j] = b[j + 1];
						b[j + 1] = x;
						k = c[j];
						c[j] = c[j + 1];
						c[j + 1] = k;
						k = d[j];
						d[j] = d[j + 1];
						d[j + 1] = k;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.print("(");
			System.out.print(a[c[i]][0]);
			System.out.print(",");
			System.out.print(a[c[i]][1]);
			System.out.print(",");
			System.out.print(a[c[i]][2]);
			System.out.print(")-(");
			System.out.print(a[d[i]][0]);
			System.out.print(",");
			System.out.print(a[d[i]][1]);
			System.out.print(",");
			System.out.print(a[d[i]][2]);
			System.out.print(")=");
			System.out.printf("%.2f",b[i]);
			System.out.print("\n");
		}
		return 0;
	}


}

