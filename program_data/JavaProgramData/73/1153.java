package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int[][] A = new int[5][5];
		int[] B = new int[5];
		int[] C = new int[5];
		int k;
		int i;
		int j;
		int n;
		int m;
		int x = 0;
		int a = 1;
		int b = 1;
		int c;
		int d;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					A[i][j] = Integer.parseInt(tempVar);
				}
			}
		}


		for (i = 0,m = 0;i < 5,m < 5;i++,m++)
		{
			for (j = 0;j < 5;j++)
			{
				for (k = 0;k < 5;k++)
				{
					if (A[i][j] > A[i][k])
					{
						a = a + 1;
					}
					else
					{
						a = a;
					}

				}
				if (a == 5)
				{
					B[m] = A[i][j];
				}
				a = 1;
			}
		}

		for (j = 0,n = 0;j < 5,n < 5;j++,n++)
		{
			for (i = 0;i < 5;i++)
			{
				for (k = 0;k < 5;k++)
				{
					if (A[i][j] < A[k][j])
					{
						b = b + 1;
					}
					else
					{
						b = b;
					}
				}
				if (b == 5)
				{
					C[n] = A[i][j];
				}
				b = 1;

			}
		}

		for (m = 0;m < 5;m++)
		{
			for (n = 0;n < 5;n++)
			{
				if (B[m] == C[n])
				{
					x = 1;
					c = m + 1;
					d = n + 1;
					System.out.printf("%d %d %d",c,d,B[m]);
				}
			}
		}

			if (x == 0)
			{
				System.out.print("not found");
			}


		return 0;
	}
}

