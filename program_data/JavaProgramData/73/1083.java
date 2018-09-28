package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] flag = new int[5];
		int max;
		int maxj;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = (*(a + i) + 0);
			maxj = 0;
			for (j = 1;j < 5;j++)
			{
				if (*(*(a + i) + j) > max)
				{
					max = (*(a + i) + j);
					maxj = j;
				}
			}
			if (*(*(a + 0) + maxj) >= max != 0 && *(*(a + 1) + maxj) >= max != 0 && *(*(a + 2) + maxj) >= max != 0 && *(*(a + 3) + maxj) >= max != 0 && *(*(a + 4) + maxj) >= max)
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(maxj + 1);
				System.out.print(' ');
				System.out.print(max);
				System.out.print("\n");
			}
			else
			{
				flag[i] = 0;
			}
		}
		if (flag[0] == 0 && flag[1] == 0 && flag[2] == 0 && flag[3] == 0 && flag[4] == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}


}

