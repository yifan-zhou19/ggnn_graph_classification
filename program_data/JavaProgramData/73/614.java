package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int k = 0;
		int i = 0;
		int j = 0;
		int[] M = new int[5];
		int[] m = new int[5];
		int[] t = new int[5];
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			M[i] = a[i][0];
			for (j = 0; j < 5; j++)
			{
				if (M[i] <= a[i][j])
				{
					M[i] = a[i][j];
					t[i] = j;
				}
			}
		}
		for (j = 0; j < 5; j++)
		{
			m[j] = a[0][j];
			for (i = 0; i < 5; i++)
			{
				if (m[j] >= a[i][j])
				{
					m[j] = a[i][j];

				}
			}
		}
		for (i = 0; i < 5; i++)
		{
				if (m[t[i]] == M[i])
				{
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print(t[i] + 1);
					System.out.print(' ');
					System.out.print(M[i]);
					System.out.print("\n");
				}
				else
				{
					k++;
				}
		}
				if (k == 5)
				{
					System.out.print("not found");
					System.out.print("\n");
				}
			return 0;
	}
}

