package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][2];
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[i] = 0;
			int[][] b = new int[100][100];
			for (int j = 0;j < a[i][0];j++)
			{
				for (int k = 0;k < a[i][1];k++)
				{
					b[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int j = 0;j < a[i][1];j++)
			{
				num[i] = num[i] + b[0][j];
			}
			for (int j = 0;j < a[i][1];j++)
			{
				num[i] = num[i] + b[a[i][0] - 1][j];
			}
			for (int j = 1;j < a[i][0] - 1;j++)
			{
				num[i] = num[i] + b[j][0];
			}
			for (int j = 1;j < a[i][0] - 1;j++)
			{
				num[i] = num[i] + b[j][a[i][1] - 1];
			}
		}
		for (int i = 0;i < n;i++)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

