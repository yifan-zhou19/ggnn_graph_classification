package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[][] point = new float[10][3];
		float[] lon = new float[100];
		float tem1;
		int n;
		int i;
		int j;
		int sum = 0;
		int[] x = new int[100];
		int[] y = new int[100];
		int tem;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		point[i][0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		point[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		point[i][2] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
		for (j = i + 1;j < n;j++)
		{
			lon[sum] = Math.sqrt((point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]));
			x[sum] = i;
			y[sum++] = j;
		}
		}
		for (i = 0;i < sum - 1;i++)
		{
		for (j = 0;j < sum - i - 1;j++)
		{
			if (lon[j] < lon[j + 1])
			{
				tem1 = lon[j];
				lon[j] = lon[j + 1];
				lon[j + 1] = tem1;
				tem = x[j];
				x[j] = x[j + 1];
				x[j + 1] = tem;
				tem = y[j];
				y[j] = y[j + 1];
				y[j + 1] = tem;
			}
		}
		}
		for (i = 0;i < sum;i++)
		{
			System.out.print('(');
			System.out.print(point[x[i]][0]);
			System.out.print(',');
			System.out.print(point[x[i]][1]);
			System.out.print(',');
			System.out.print(point[x[i]][2]);
			System.out.print(')');
			System.out.print('-');
			System.out.print('(');
			System.out.print(point[y[i]][0]);
			System.out.print(',');
			System.out.print(point[y[i]][1]);
			System.out.print(',');
			System.out.print(point[y[i]][2]);
			System.out.print(')');
			System.out.print('=');
			System.out.printf("%.2f",lon[i]);
			System.out.print("\n");
		}
	}
}

