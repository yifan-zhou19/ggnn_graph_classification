package <missing>;

public class GlobalMembers
{
	//*************************************************
	//?????????????                      * 
	//?????                                      *
	//???2013/11/3                                 *
	//???????????????                  *
	//*************************************************
	public static int Main()
	{
		int a;
		int n;
		int m;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < a;i++)
		{
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] A = new int[100][100];
			for (int j = 0;j < m;j++)
			{
				for (int k = 0;k < n;k++)
				{
					A[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (m == 1 && n == 1)
			{
				System.out.print(A[0][0]);
				System.out.print("\n");
			}
			else
			{
				for (int j = 0;j < m;j++)
				{
				sum = sum + A[j][0] + A[j][n - 1];
				}
			for (int j = 0;j < n;j++)
			{
				sum = sum + A[0][j] + A[m - 1][j];
			}
				sum = sum - A[0][0] - A[0][n - 1] - A[m - 1][n - 1] - A[m - 1][0];
				System.out.print(sum);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

