package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[5];
		int[] B = new int[5];
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int m;
		int n = 0;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0; i <= 4; i++)
		{
			A[i] = a[i][0];
			for (j = 0; j <= 4; j++)
			{
				if (a[i][j] >= A[i])
				{
					A[i] = a[i][j];
					m = j;
				}
			}

			B[m] = a[0][m];
			for (k = 0; k <= 4; k++)
			{
				if (a[k][m] <= B[m])
				{
					B[m] = a[k][m];
				}
			}
			if (A[i] == B[m])
			{
					n++;
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(m + 1);
					System.out.print(" ");
					System.out.print(a[i][m]);
					System.out.print("\n");
			}
		}
		if (n == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

