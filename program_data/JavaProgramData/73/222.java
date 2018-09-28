package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????? **
	//*??????  1200062706**
	//*???2012.11.13  **
	//********************************

	public static int Main()
	{
		int i;
		int j;
		int[][] x = new int[5][5];
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				int a;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				x[i][j] = a;
			}
		}
		int[] y = new int[5];
		for (i = 0; i < 5; i++)
		{
			int max = 0;
			for (j = 0; j < 5; j++)
			{
				if (max > x[i][j])
				{
					max = max;
				}
				else
				{
					max = x[i][j];
				}
				y[i] = max;
			}
		}
		int[] y1 = new int[5];
		for (i = 0; i < 5; i++)
		{
			int min = x[0][i];
			for (j = 0; j < 5; j++)
			{
				if (min < x[j][i])
				{
					min = min;
				}
				else
				{
					min = x[j][i];
				}
				y1[i] = min;
			}
		}
		int k = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				if (y[i] == y1[j])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(y[i]);
					System.out.print("\n");
				}
				else
				{
					k = k + 1;
				}
				if (k == 25)
				{
					System.out.print("not found");
					System.out.print("\n");
				}
			}
		}

		return 0;
	}


}

