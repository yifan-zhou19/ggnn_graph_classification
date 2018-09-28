package <missing>;

public class GlobalMembers
{
	public static int max(int[][] array, int n)
	{
		int t = array[n][0];
		int i;
		for (i = 0;i < 5;i++)
		{
			if (t < array[n][i])
			{
			t = array[n][i];
			}
			else
			{
				;
			}
		}
		return t;
	}
	public static int min(int[][] array, int n)
	{
		int t = array[0][n];
		int i;
		for (i = 0;i < 5;i++)
		{
			if (t > array[i][n])
			{
			t = array[i][n];
			}
			else
			{
				;
			}
		}
		return t;
	}
	public static int Main()
	{
		int max = new int(int array[5][5],int x);
		int min = new int(int array[5][5],int x);
		int[][] a = new int[5][5];
		int i;
		int j;
		int t;
		int count = 0;
		int andian;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
			System.out.print("\n");
		}
		for (t = 0;t < 5;t++)
		{
			andian = max(a, t);
			for (i = 0;i < 5;i++)
			{
				if (andian == min(a, i))
				{
					System.out.printf("%d %d %d\n",t + 1,i + 1,andian);
					break;
				}
				else
				{
				count++;
				}
			}
		}
		if (count == 25)
		{
		System.out.print("not found\n");
		}

		return 0;
	}
}

