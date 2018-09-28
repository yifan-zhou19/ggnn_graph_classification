package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int a;
		int b;
		int p;
		int q;
		int i;
		int j;
		int k = 1;
		int x = 1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= a - 1; i++)
		{
			for (j = 0; j <= b - 1; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (q = 0, p = b - 1; p >= 0, q <= a - 1; p--, q++)
		{

			for (i = b - 1 - p; i <= p; i++)
			{
				if (array[q][i] == -1)
				{
					break;
					k = 0;
				}
				System.out.print(array[q][i]);
				System.out.print("\n");
				System.out.print("\n");
				array[q][i] = -1;
			}
			for (i = q + 1; i <= a - 1 - q; i++)
			{
				if (array[i][p] == -1)
				{
					break;
					k = 0;
				}
				System.out.print(array[i][p]);
				System.out.print("\n");
				System.out.print("\n");
				array[i][p] = -1;
			}
			for (i = p - 1; i >= b - 1 - p; i--)
			{
				if (array[a - 1 - q][i] == -1)
				{
					break;
					k = 0;
				}
				System.out.print(array[a - 1 - q][i]);
				System.out.print("\n");
				System.out.print("\n");
				array[a - 1 - q][i] = -1;
			}
			for (i = a - 2 - q; i >= q; i--)
			{
				if (array[i][b - 1 - p] == -1)
				{
					break;
					k = 0;
				}
				System.out.print(array[i][b - 1 - p]);
				System.out.print("\n");
				System.out.print("\n");
				array[i][b - 1 - p] = -1;
			}
			for (i = 0; i <= a - 1; i++)
			{
				for (j = 0; j <= b - 1; j++)
				{
					if (array[i][j] != -1)
					{
						x = x * 0;
					}
				}
			}
			if (x == 1)
			{
				break;
			}
			x = 1;
		}
		return 0;
	}


}

