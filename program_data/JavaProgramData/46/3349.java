package <missing>;

public class GlobalMembers
{
	public static int[][] sign = new int[100][100];
	public static int[][] arr = new int[100][100];
	public static void right(int i,int j)
	{
		void down(int i,int j);
		System.out.printf("%d\n",arr[i][j]);
		sign[i][j] = 0;
		if (sign[i][j + 1] != 0)
		{
			right(i, j + 1);
		}
		else
		{
			if (sign[i + 1][j] != 0)
			{
				down(i + 1, j);
			}
		}
	}
	public static void left(int i,int j)
	{
		void up(int i,int j);
		System.out.printf("%d\n",arr[i][j]);
		sign[i][j] = 0;
		if (sign[i][j - 1] != 0 && j > 0)
		{
			left(i, j - 1);
		}
		else
		{
			if (sign[i - 1][j] != 0)
			{
				up(i - 1, j);
			}
		}
	}
	public static void up(int i,int j)
	{
		void right(int i,int j);
		System.out.printf("%d\n",arr[i][j]);
		sign[i][j] = 0;
		if (sign[i - 1][j] != 0 && i > 0)
		{
			up(i - 1, j);
		}
		else
		{
			if (sign[i][j + 1] != 0)
			{
				right(i, j + 1);
			}
		}
	}
	public static void down(int i,int j)
	{
		void left(int i,int j);
		System.out.printf("%d\n",arr[i][j]);
		sign[i][j] = 0;
		if (sign[i + 1][j] != 0)
		{
			down(i + 1, j);
		}
		else
		{
			if (sign[i][j - 1] != 0)
			{
				left(i, j - 1);
			}
		}
	}
	public static int Main()
	{
		void left(int i,int j);
		void right(int i,int j);
		void up(int i,int j);
		void down(int i,int j);
		int row;
		int col;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					arr[i][j] = Integer.parseInt(tempVar3);
				}
				sign[i][j] = 1;
			}
		}
		right(0, 0);
		return 0;
	}
}

