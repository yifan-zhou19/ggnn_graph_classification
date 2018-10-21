package <missing>;

public class GlobalMembers
{
	 /*#########????.cpp#########*
	*############??###############*
	*#########1000062710############*
	*********************************/
	public static int Main()
	{
		int[][] a = new int[6][6];
		int k = 0;
		int m = 0;
		int count = 0;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 1; k <= 5; k++)
		{
			for (m = 1; m <= 5; m++)
			{
				if ((a[m][k] > a[1][k]) || (a[m][k] > a[2][k]) || (a[m][k] > a[3][k]) || (a[m][k] > a[4][k]) || (a[m][k] > a[5][k]) || (a[m][k] < a[m][1]) || (a[m][k] < a[m][2]) || (a[m][k] < a[m][3]) || (a[m][k] < a[m][4]) || (a[m][k] < a[m][5]))
				{

					   if ((m == 5) && (k == 5) && (count == 0))
					   {
						   System.out.print("not found");
						   System.out.print("\n");
					   }
				}

				else
				{
						System.out.print(m);
						System.out.print(" ");
						System.out.print(k);
						System.out.print(" ");
						System.out.print(a[m][k]);
						System.out.print("\n");
						count = 1;
						break;
				}

			}

		}


		return 0;
	}
}

