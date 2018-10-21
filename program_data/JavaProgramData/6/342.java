package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int ii;
		int m;
		int n;
		int i;
		int j;
		int[][] str = new int[111][111];
		int total;

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (ii = 1 ; ii <= num ; ii++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (i = 0 ; i < m ; i++)
			{
				for (j = 0 ; j < n ; j++)
				{
					str[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			total = 0;

			for (i = 0 ; i < n ; i++)
			{
				total = total + *(str + i); //???
			}

			for (i = 0 ; i < n ; i++)
			{
				total = total + *(*(str + m - 1) + i); //?m?
			}

			for (i = 1 ; i < m - 1 ; i++)
			{
				total = total + **(str + i); //???
			}

			for (i = 1 ; i < m - 1 ; i++)
			{
				total = total + *(*(str + i) + n - 1); //???
			}

			System.out.print(total);
			System.out.print("\n");

		}

		return 0;
	}







}

