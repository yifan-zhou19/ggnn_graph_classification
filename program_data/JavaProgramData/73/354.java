package <missing>;

public class GlobalMembers
{
	//Liloy Iris 2012.11.3
	//????
	public static int Main()
	{
		int i;
		int j;
		int[][] A = new int[6][6];
		int[] L = new int[6];
		int[] H = new int[6];
		int a;
		int b;
		int c = 0;
		for (i = 0;i < 6;i++)
		{
			A[i][0] = 0;
			A[0][i] = 0;
		}
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i < 6;i++)
		{
			a = A[i][1];
			H[i] = 1;
			L[i] = 1;
			b = A[1][i];
			for (j = 1;j < 6;j++)
			{
				if (a < A[i][j])
				{
					a = A[i][j];
					H[i] = j;
				}
				if (b > A[j][i])
				{
					b = A[j][i];
					L[i] = j;
				}
			}
		}
		for (i = 1;i < 6;i++)
		{
			if (H[L[i]] == i)
			{
				System.out.print(L[i]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print(" ");
				System.out.print(A[L[i]][i]);
				c = 1;
			}
		}
		if (c == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

