package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[5][5];
		int[] min = new int[5];
		int[] max = new int[5];
		int[] imax = new int[5];
		int[] imin = new int[5];
		int i;
		int j;
		char flag = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			imax[i] = array[i][0];
			max[i] = 0;
			for (j = 1;j < 5;j++)
			{
				if (array[i][j] > imax[i])
				{
					imax[i] = array[i][j];
					max[i] = j;
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			imin[j] = array[0][j];
			min[j] = 0;
			for (i = 1;i < 5;i++)
			{
				if (array[i][j] < imin[j])
				{
					imin[j] = array[i][j];
					min[j] = i;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (min[max[i]] == i)
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(max[i] + 1);
				System.out.print(' ');
				System.out.print(imax[i]);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

