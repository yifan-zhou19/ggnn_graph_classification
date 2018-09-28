package <missing>;

public class GlobalMembers
{
	/**
	????4.cpp
	?  ?????
	?  ??11.02
	?  ??????
	*/

	public static int Main()
	{
		int[][] a = new int[5][5];
		int cnt = 0;
		int i;
		int j;
		int p;
		int k;
		int m;
		int rowmax;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < 5;i++)
		{
			rowmax = a[i][0];
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] >= rowmax)
				{
					rowmax = a[i][j];
				}

			}

			for (j = 0;j < 5;j++)
			{
				if (a[i][j] == rowmax)
				{
					p = j;
				}
			}


			for (k = 0;k < 5;k++)
			{
				if (a[i][p] <= a[k][p])
				{
					m = i;
				}
				else
				{
					m = -1;
					break;
				}
			}

			if (m == i)
			{
				System.out.print(m + 1);
				System.out.print(" ");
				System.out.print(p + 1);
				System.out.print(" ");
				System.out.print(a[i][p]);
				System.out.print("\n");
				cnt++;
			}

		}

		if (cnt == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}


}

