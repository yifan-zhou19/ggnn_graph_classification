package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[30];
		int[][] b = new int[45][6];
		int[][] btemp = new int[45][6];
		int i;
		int j;
		int k;
		int T;
		double d;
		double[] c = new double[45];
		double temp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		T = n * (n - 1) / 2;

		for (i = 0;i < 3 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		j = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (k = 1;k <= (n - 1) - i;k++)
			{
				d = Math.sqrt((a[3 * i] - a[3 * i + 3 * k]) * (a[3 * i] - a[3 * i + 3 * k]) + (a[3 * i + 1] - a[3 * i + 3 * k + 1]) * (a[3 * i + 1] - a[3 * i + 3 * k + 1]) + (a[3 * i + 2] - a[3 * i + 3 * k + 2]) * (a[3 * i + 2] - a[3 * i + 3 * k + 2]));
				b[j][0] = a[3 * i];
				b[j][3] = a[3 * i + 3 * k];
				b[j][1] = a[3 * i + 1];
				b[j][4] = a[3 * i + 3 * k + 1];
				b[j][2] = a[3 * i + 2];
				b[j][5] = a[3 * i + 3 * k + 2];
				c[j] = d;
				j++;
			}
		}

		for (i = 0;i < T;i++)
		{
			for (j = 0;j < T - i;j++)
			{
				if (c[j] < c[j + 1])
				{

					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;

					btemp[j][0] = b[j][0];
					btemp[j][1] = b[j][1];
					btemp[j][2] = b[j][2];
					btemp[j][3] = b[j][3];
					btemp[j][4] = b[j][4];
					btemp[j][5] = b[j][5];

					b[j][0] = b[j + 1][0];
					b[j][1] = b[j + 1][1];
					b[j][2] = b[j + 1][2];
					b[j][3] = b[j + 1][3];
					b[j][4] = b[j + 1][4];
					b[j][5] = b[j + 1][5];

					b[j + 1][0] = btemp[j][0];
					b[j + 1][1] = btemp[j][1];
					b[j + 1][2] = btemp[j][2];
					b[j + 1][3] = btemp[j][3];
					b[j + 1][4] = btemp[j][4];
					b[j + 1][5] = btemp[j][5];

				}
			}
		}

		for (j = 0;j < T;j++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",b[j][0],b[j][1],b[j][2],b[j][3],b[j][4],b[j][5],c[j]);
		}
	}
}

