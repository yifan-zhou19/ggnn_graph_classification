package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6]; //??????a?6??6??????????max???min??????????????????hl???????????????????????
		int i;
		int j;
		int[] max = {0, 0, 0, 0, 0, 0};
		int[] min = new int[6];
		int[] h = new int[6];
		int[] l = new int[6];
		for (i = 1;i <= 5;i++) //???h?i????-1
		{
			h[i] = 1;
			l[i] = 1;
		}
		for (i = 1;i <= 5;i++) //??????
		{
			for (j = 1;j <= 5;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= 5;i++) //????????????????
		{
			min[i] = a[1][i];
		}
		for (i = 1;i <= 5;i++) //????????????????????????
		{
			for (j = 1;j <= 5;j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					h[i] = j;
				}
				if (a[j][i] < min[i])
				{
					min[i] = a[j][i];
					l[i] = j;
				}
			}
		}
		int x;
		int y;
		int m = 0;
		for (i = 1;i <= 5;i++) //???????
		{
			for (j = 1;j <= 5;j++)
			{
				if (h[i] == j && l[j] == i)
				{
					x = i;
					y = j;
					m = m + 1;
				}
			}
		}
		if (m == 0) //?????
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		else
		{
			System.out.print(x);
			System.out.print(" ");
			System.out.print(y);
			System.out.print(" ");
			System.out.print(max[x]);
			System.out.print("\n");
		}
		return 0;
	}
}

