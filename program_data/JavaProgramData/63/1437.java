package <missing>;

public class GlobalMembers
{
	//**************************** 
	//*???????            *
	//*????? 1200012708     *
	//*???2012?11?05?      *
	//**************************** 

	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < x1; i++) // ??????
		{
			for (j = 0; j < y2; j++)
			{
				int t = 0; // t??c[i][j]??
				for (int p = 0; p < y1; p++)
				{
					t += a[i][p] * b[p][j];
				}
				if (j > 0)
				{
					System.out.print(" ");
				}
				System.out.print(t);
			}
			System.out.print("\n");
		}

		return 0;
	}
}

