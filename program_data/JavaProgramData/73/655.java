package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] matrix = new int[5][5];
		int i;
		int j;
		int k;
		int m;
		int s;
		int t;
		int n = 0;

		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
			matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0; i < 5; i++)
		{
			s = i;
			t = 0;
			m = matrix[i][0];

			for (j = 0; j < 5; j++)
			{
				if (m < matrix[i][j])
				{
					m = matrix[i][j];
					t = j;
				}
			}

			j = 0;

			for (k = 0; k < 5; k++)
			{
				if (m > matrix[k][t])
				{
					j++;
				}
			}

			if (j == 0)
			{
				System.out.print(s + 1);
				System.out.print(" ");
				System.out.print(t + 1);
				System.out.print(" ");
				System.out.print(m);
				System.out.print("\n");
				n++;
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

