package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row = 0;
		int col = 0;
		int[][] num = new int[110][110];
		(int)(*p)[110];
		int i;
		int j;
		int a = 1;
		int b = col - 1;
		int c;
		int d;
		p = num;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i < col;i++)
		{
			a = 1;
			c = i;
			System.out.print((*(p) + i));
			System.out.print("\n");
			while (i - 1 >= 0 && a < row)
			{
				System.out.print((*(p + a) + i - 1));
				System.out.print("\n");
				a++;
				i--;
			}
			i = c;
		}
		for (j = 1;j < row;j++)
		{
			b = col - 1;
			d = j;
			System.out.print((*(p + j) + col - 1));
			System.out.print("\n");
			while (j + 1 < row && b - 1 >= 0)
			{
				System.out.print((*(p + j + 1) + b - 1));
				System.out.print("\n");
				j++;
				b--;
			}
			j = d;
		}
			return 0;
	}

}

