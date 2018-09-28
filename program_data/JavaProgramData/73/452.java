package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] min = new int[5];
		int i;
		int j;
		int flag = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				max[i] = a[i][0];
				min[j] = a[0][j];
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max[i])
				{
				   max[i] = a [i][j];
				}
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
			}
		}
			for (i = 0; i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (a[i][j] == max[i] && a[i][j] == min[j])
					{
					   System.out.print(i + 1);
					   System.out.print(" ");
					   System.out.print(j + 1);
					   System.out.print(" ");
					   System.out.print(a[i][j]);
					   flag = 1;
					   break;
					}
				}
			}
				if (flag == 0)
				{
					System.out.print("not found");
				}
		return 0;
	}
}

