package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int I;
		int J;
		int t = 0;
		for (i = 0 ; i <= 4 ; i++)
		{
			for (j = 0 ; j <= 4 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0 ; i <= 4 ; i++)
		{
			if (t != 0)
			{
				break;
			}
			for (j = 0 ; j <= 4 ; j++)
			{
				if (a[i][j] > t)
				{
					t = a[i][j], I = i, J = j;
				}
			}
			for (int k = 0 ; k <= 4 ; k++)
			{
				if (a[k][J] < t)
				{
					t = 0;
				}
			}
		}
		if (t == 0)
		{
			System.out.print("not found");
		}
		else
		{
			System.out.print(I + 1);
			System.out.print(" ");
			System.out.print(J + 1);
			System.out.print(" ");
			System.out.print(t);
		}

		return 0;
	}
}

