package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int line = 0;
		int row = 0;
		int[] imax = new int[6];
		int[] jmin = {2146796, 2146796, 2146796, 2146796, 2146796, 2146796};
		int[][] a = new int[6][6];
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				if (a[i][j] > imax[i])
				{
					imax[i] = a[i][j];
				}
				if (a[i][j] < jmin[j])
				{
					jmin[j] = a[i][j];
				}
			}
		}
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				if (imax[i] == jmin[j])
				{
					line = i;
					row = j;
				}
			}
		}
		if (imax[line] == jmin[row] && line != 0 && row != 0)
		{
			System.out.print(line);
			System.out.print(" ");
			System.out.print(row);
			System.out.print(" ");
			System.out.print(imax[line]);
		}
		else
		{
			System.out.print("not found");
		}
		return 0;
	}
}

