package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{

			int[][] array = new int[100][100];
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i != m;i++)
			{
				for (int j = 0;j != n;j++)
				{
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			if (m == 1 && n == 1)
			{
				sum = array[0][0];
			}
			else
			{
				for (int k = 0;k != n - 1;k++)
				{
					sum += array[0][k];
				}
				for (int k = 0;k != m - 1;k++)
				{
					sum += array[k][n - 1];
				}
				for (int k = n - 1;k != 0;k--)
				{
					sum += array[m - 1][k];
				}
				for (int k = m - 1;k != 0;k--)
				{
					sum += array[k][0];
				}
			}
			System.out.print(sum);
			System.out.print("\n");


		}
		return 0;
	}
}

