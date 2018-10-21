package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i = 0;
		int j = 0;
		int temp;
		int max = 0;
		int min = 0;
		int got = 0;
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
				if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4])
				{
					temp = j;
				}
			}
			if (a[i][temp] <= a[0][temp] != 0 && a[i][temp] <= a[1][temp] != 0 && a[i][temp] <= a[2][temp] != 0 && a[i][temp] <= a[3][temp] != 0 && a[i][temp] <= a[4][temp])
			{
				got = 1;
				min = i;
				max = temp;
			}
		}
		if (got == 1)
		{
			System.out.print(min + 1);
			System.out.print(" ");
			System.out.print(max + 1);
			System.out.print(" ");
			System.out.print(a[min][max]);
		}
		else
		{
			System.out.print("not found");
		}
		return 0;
	}
}

