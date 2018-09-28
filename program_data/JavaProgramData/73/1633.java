package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		int k;
		int p;
		p = 0;
		for (i = 0;i <= 4;i++)
		{
			c[i] = 0;
			b[i] = 0;
			for (j = 0;j <= 4;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= 4;i++)
		{
			max[i] = a[i][0];
			for (j = 1;j <= 4;j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					b[i] = j;
				}
			}
			for (k = 0;k <= 4;k++)
			{
				if (a[i][b[i]] <= a[k][b[i]])
				{
					c[i] = c[i] + 1;
				}
			}
			if (c[i] == 5)
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(b[i] + 1);
				System.out.print(' ');
				System.out.print(max[i]);
				System.out.print('\n');
			}
			else
			{
				p = p + 1;
			}
		}
		if (p == 5)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

