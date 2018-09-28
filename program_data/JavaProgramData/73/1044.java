package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int[] x = new int[5];
		int[] y = new int[5];
		int[] big = new int[5];
		int[] small = new int[5];
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= 4;i++)
		{
			x[i] = 0;
			big[i] = a[i][0];
			for (j = 0;j <= 4;j++)
			{
			 if (a[i][j] > big[i])
			 {
					big[i] = a[i][j];
					x[i] = j;
			 }
			}
		}
		for (j = 0;j <= 4;j++)
		{
			y[j] = 0;
			small[j] = a[0][j];
			for (i = 0;i <= 4;i++)
			{
			 if (a[i][j] < small[j])
			 {
					small[j] = a[i][j];
					y[j] = i;
			 }
			}
		}
		int flag = 0;
		for (i = 0;i <= 4;i++)
		{
			if (y[x[i]] == i)
			{
					flag = 1;
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print(x[i] + 1);
					System.out.print(' ');
					System.out.print(a[i][x[i]]);
					System.out.print("\n");
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

