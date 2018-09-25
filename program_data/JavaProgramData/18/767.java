package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[110][110];
	public static int size;
	public static int zero()
	{
		int x;
		int y;
		int temp;
		for (x = 0;x < size;x++)
		{
			for (y = 1,temp = a[x][0];y < size;y++)
			{
				if (a[x][y] < temp)
				{
					temp = a[x][y];
				}
			}
			for (y = 0;y < size;y++)
			{
				a[x][y] -= temp;
			}
		}
		for (y = 0;y < size;y++)
		{
			for (x = 1,temp = a[0][y];x < size;x++)
			{
				if (a[x][y] < temp)
				{
					temp = a[x][y];
				}
			}
			for (x = 0;x < size;x++)
			{
				a[x][y] -= temp;
			}
		}
		temp = a[1][1];
		for (x = 1;x < size-1;x++)
		{
			for (y = 0;y < size;y++)
			{
				a[x][y] = a[x + 1][y];
			}
		}
		for (y = 1;y < size-1;y++)
		{
			for (x = 0;x < size-1;x++)
			{
				a[x][y] = a[x][y + 1];
			}
		}
		size -= 1;
		return temp;
	}
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			size = n;
			for (x = 0;x < n;x++)
			{
				for (y = 0;y < n;y++)
				{
					a[x][y] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			for (x = 1;x <= n - 1;x++)
			{
				sum += zero();
			}
			System.out.print(sum);
			System.out.print("\n");
			//cin.get();
			//cin.get();
		}
		return 0;
	}
}

