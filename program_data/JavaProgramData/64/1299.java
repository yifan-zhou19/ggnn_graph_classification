package <missing>;

public class GlobalMembers
{
	/*
	 *???? distanceorder.cpp
	 *??????
	 *????: 2012-11-10
	 *???????????????
	 */
	public static int Main()
	{
		int n; //i,j,l?????
		int i;
		int j;
		int l;
		int k = 0;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // ??n?????
		int[] y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] z = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[][] piont = new int[6][100]; // ?????????
		float a; //a?????
		float[] dis = {0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		for (i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i <= n - 2; i++)
		{
			for (j = i + 1; j <= n - 1; j++)
			{
				dis[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])); // ?????????
				piont[0][k] = x[i];
				piont[1][k] = y[i];
				piont[2][k] = z[i];
				piont[3][k] = x[j];
				piont[4][k] = y[j];
				piont[5][k] = z[j]; // ???????????????
				k = k + 1;
			} //?????k???
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = 0; j < k - 1 - i; j++)
			{
				if (dis[j] < dis[j + 1])
				{
					a = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = a;
					for (l = 0; l <= 5; l++)
					{
							b = piont[l][j];
					piont[l][j] = piont[l][j + 1];
					piont[l][j + 1] = b;
					}
				} // ?????????????
			}
		}
		for (i = 0; i < k ; i++)
		{
			System.out.printf("%f", "(");
			System.out.printf("%f", piont[0][i]);
			System.out.printf("%f", ",");
			System.out.printf("%f", piont[1][i]);
			System.out.printf("%f", ",");
			System.out.printf("%f", piont[2][i]);
			System.out.printf("%f", ")-(");
			System.out.printf("%f", piont[3][i]);
			System.out.printf("%f", ",");
			System.out.printf("%f", piont[4][i]);
			System.out.printf("%f", ",");
			System.out.printf("%f", piont[5][i]);
			System.out.printf("%f", ")=");
			System.out.printf("%.2f", dis[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

