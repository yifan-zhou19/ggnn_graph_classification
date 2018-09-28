package <missing>;

public class GlobalMembers
{
	// ????????
	// ??????
	// ???2010?11?25?
	// ?????????


	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][0] == 0) // ???????
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (k = 1 ; k <= a[i][0] ; k++)
				{
					a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (j = 1 ; j <= a[i][0] ; j++)
				{
				if (a[i][j] + 3 * j <= 60 && a[i][j + 1] + 3 * (j + 1) > 63) //????1?????????????????????1???????????58?60???
				{
					System.out.print(60 - 3 * j);
					System.out.print("\n");
					break;
				}
				if (a[i][j] + 3 * j <= 60 && a[i][j + 1] + 3 * (j + 1) > 60 && a[i][j] + 3 * (j + 1) <= 63)
				{
					System.out.print(a[i][j + 1]);
					System.out.print("\n");
					break;
				}
				}
				if (j == a[i][0] + 1)
				{
					System.out.print(60 - 3 * a[i][0]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

