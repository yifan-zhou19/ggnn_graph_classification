package <missing>;

public class GlobalMembers
{
	//**********************************
	//*  ????homework_10.cpp       *
	//*  ??????1200012884        * 
	//*  ?????2012?10?31?      *
	//*  ?????????????    *
	//**********************************

	public static int Main()
	{
		int[][] a = new int[101][101];
		int row;
		int col;
		int i;
		int j;
		int count = 0;
		int time;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = -1;
		j = -1;
		time = row * col;
		for (;;)
		{
			i++;
		for (j += 1;j < col;j++)
		{
				System.out.print(a[i][j]);
				System.out.print("\n");
				time--;
		}
				if (time == 0)
				{
					break;
				}

		j--;

		for (i += 1;i < row;i++)
		{
				System.out.print(a[i][j]);
				System.out.print("\n");
				time--;
		}
				if (time == 0)
				{
					break;
				}

		i--;

		for (j -= 1;j >= count;j--)
		{
				System.out.print(a[i][j]);
				System.out.print("\n");
				time--;
		}
				if (time == 0)
				{
					break;
				}

		j++;

				count++;
		for (i -= 1;i >= count;i--)
		{
				System.out.print(a[i][j]);
				System.out.print("\n");
				time--;
		}
				if (time == 0)
				{
					break;
				}

		row--;
		col--;

		}
		return 0;
	}


}

