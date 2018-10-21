package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int[][] A = new int[50][105];
		int[][] B = new int[50][105];
		int k;
		int j;
		char[][] a = new char[50][105];
		char[][] b = new char[50][105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i < n)
		{
			System.in.read();
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.in.read();
			b[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.in.read();
			k = 0;
			j = 0;
		for (k = String.valueOf(a[i]).length() - 1; k >= 0;k--)
		{
			A[i][j] = a[i][k] - '0';
			j++;
		}
			 j = 0;
		for (k = String.valueOf(b[i]).length() - 1;k >= 0;k--)
		{
			B[i][j] = b[i][k] - '0';
			j++;
		}
			for (j = 0;j < 105;j++)
			{
				A[i][j] = A[i][j] - B[i][j];
				if (A[i][j] < 0)
				{
				A[i][j] = A[i][j] + 10;
				A[i][j + 1] = A[i][j + 1] - 1;
				}
			}
			j = 104;
			while (A[i][j] == 0)
			{
				j--;
			}
				for (k = j;k >= 0;k--)
				{
					System.out.print(A[i][k]);
				}
				 System.out.print("\n");
				 i++;
		}
		return 0;
	}
}

