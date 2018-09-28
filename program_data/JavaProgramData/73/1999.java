package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int maxi;
		int maxj;
		int g;
		int max;
		int k = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			g = 1;
			max = a[i][0];
			maxi = i;
			maxj = 0;

			for (j = 0;j < 5;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					maxi = i;
					maxj = j;
				}
			}
			for (j = 0;j < 5;j++)
			{
				if (a[maxi][maxj] > a[j][maxj])
				{
				g = 0;
				break;
				}
			}
			if (g != 0)
			{
				System.out.print(maxi + 1);
				System.out.print(" ");
				System.out.print(maxj + 1);
				System.out.print(" ");
				System.out.print(a[maxi][maxj]);
				System.out.print("\n");
				k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

