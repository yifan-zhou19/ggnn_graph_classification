package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int i;
			int j;
			int a;
			int b;
			int[][] x = new int[100][100];
			int sum = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < a; i++)
			{
				for (j = 0; j < b; j++)
				{
					x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (i = 0 ;i < b; i++)
			{
				sum = sum + x[0][i] + x[a - 1][i];
			}
			for (i = 1;i < a - 1;i++)
			{
				sum = sum + x[i][0] + x[i][b - 1];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

