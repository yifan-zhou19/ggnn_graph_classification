package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int a = 0;a < k;a++)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] A = new int[100][100]; //??????
			int i;
			int j;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int[] p = new int[100]; //????
			p = A;
			int num = 0;
			for (j = 0;j < n;j++)
			{
				num = num + *(p[0] + j); //???????
			}

			for (i = 1;i < m - 1;i++) //??????????
			{
				num = num + p[i] + *(p[i] + n - 1);
			}

			for (j = 0;j < n;j++) //????????
			{
				num = num + *(p[m - 1] + j);
			}

			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

