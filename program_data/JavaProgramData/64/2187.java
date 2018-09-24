package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[][] point = new float[10][3];
		float[] distant = new float[45];
		float t;
		int n;
		int i;
		int j;
		int k = 0;
		int p;
		int[][] d = new int[45][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				point[i][j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++,k++)
			{ //distant????????????d??????????????
				distant[k] = Math.sqrt(Math.pow((point[i][0] - point[j][0]),2) + Math.pow((point[i][1] - point[j][1]),2) + Math.pow((point[i][2] - point[j][2]),2));
				d[k][0] = i;
				d[k][1] = j;
			}
		}
		for (i = 1;i < n * (n - 1) / 2;i++) //?????????distance????
		{
			for (j = 0;j < n * (n - 1) / 2 - i;j++)
			{
				if (distant[j] < distant[j + 1])
				{
					t = distant[j];
					distant[j] = distant[j + 1];
					distant[j + 1] = t;
					p = d[j][0];
					d[j][0] = d[j + 1][0];
					d[j + 1][0] = p;
					p = d[j][1];
					d[j][1] = d[j + 1][1];
					d[j + 1][1] = p;
				}
			}
		}
		for (k = 0;k < (n * (n - 1) / 2);k++) //????
		{
			System.out.print('(');
			System.out.printf("%f", point[d[k][0]][0]);
			System.out.printf("%f", ',');
			System.out.printf("%f", point[d[k][0]][1]);
			System.out.printf("%f", ',');
			System.out.printf("%f", point[d[k][0]][2]);
			System.out.printf("%f", ')');
			System.out.printf("%f", '-');
			System.out.printf("%f", '(');
			System.out.printf("%f", point[d[k][1]][0]);
			System.out.printf("%f", ',');
			System.out.printf("%f", point[d[k][1]][1]);
			System.out.printf("%f", ',');
			System.out.printf("%f", point[d[k][1]][2]);
			System.out.printf("%f", ')');
			System.out.printf("%f", '=');
			System.out.printf("%.2f", distant[k]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

