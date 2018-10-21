package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int[] b = new int[6];
		int i;
		int j;
		int k;
		int m = 0;
		int n;
		int t;
		for (i = 1; i < 6; i++)
		{
			for (j = 1; j < 6; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 1; k < 6; k++)
		{
			b[k] = a[k][1];
		}
		for (i = 1; i < 6; i++)
		{
			t = 0;
			for (j = 1; j < 6 ; j++)
			{
				if (b[i] <= a[i][j])
				{
					b[i] = a[i][j];
					n = j;
				}
			}
			for (k = 1; k < 6; k++)
			{
				if (b[i] > a[k][n])
				{
					t = 1;
				}
			}
			if (t == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(n);
				System.out.print(" ");
				System.out.print(b[i]);
				m = 1;
			}
		}
		if (m == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

