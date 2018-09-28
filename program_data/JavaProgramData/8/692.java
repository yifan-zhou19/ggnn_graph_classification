package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] length = new int[2];
		int[][] a = new int[2][100];
		int i;
		int j;
		int t;
		int m;
		length[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		length[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < length[i];j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 2;i++)
		{
			for (m = 1;m < length[i];m++)
			{
				for (j = 0;j < length[i] - m;j++)
				{
					 if (a[i][j] > a[i][j + 1])
					 {
						t = a[i][j];
						a[i][j] = a[i][j + 1];
						a[i][j + 1] = t;
					 }
				}
			}
		}
		for (j = 0;j < length[0];j++)
		{
			System.out.print(a[0][j]);
			System.out.print(" ");
		}
		System.out.print(a[1][0]);
		for (j = 1;j < length[1];j++)
		{
			System.out.print(" ");
			System.out.print(a[1][j]);
		}
		return 0;
	}
}

