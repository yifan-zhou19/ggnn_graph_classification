package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int[] b = new int[6];
		int[] c = new int[6];
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= 5;i++)
		{
			b[i] = 1;
			for (j = 1;j <= 5;j++)
			{
				if (a[i][j] > a[i][b[i]])
				{
					b[i] = j;
				}
			}
		}
		for (j = 1;j <= 5;j++)
		{
			c[j] = 1;
			for (i = 1;i <= 5;i++)
			{
				if (a[i][j] < a[c[j]][j])
				{
					c[j] = i;
				}
			}
		}
		j = 0;
		for (i = 1;i <= 5;i++)
		{
			if (i == c[b[i]])
			{
				j = 1;
				System.out.print(i);
				System.out.print(' ');
				System.out.print(b[i]);
				System.out.print(' ');
				System.out.print(a[i][b[i]]);
				System.out.print("\n");
			}
		}
		if (j == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

