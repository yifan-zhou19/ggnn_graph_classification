package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int i;
		int s = 1;
		for (i = 1;i <= n;i++)
		{
			s = s * 2;
		}
		return s;
	}
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int nx;
		int ny;
		int[] x_row = new int[10];
		int[] y_row = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 1;1;i++)
		{
			if (x < f(i))
			{
				break;
			}
		}
		nx = i;
		for (i = 1;1;i++)
		{
			if (y < f(i))
			{
				break;
			}
		}
		ny = i;
		x_row[0] = x;
		y_row[0] = y;
		for (i = 1;1;i++)
		{
			x_row[i] = f(nx - i - 1) - 1 + (x_row[i - 1] - f(nx - i) + 1 + (x_row[i - 1] - f(nx - i) + 1) % 2) / 2;
			if (x_row[i] == 1)
			{
				break;
			}
		}
		for (i = 1;1;i++)
		{
			y_row[i] = f(ny - i - 1) - 1 + (y_row[i - 1] - f(ny - i) + 1 + (y_row[i - 1] - f(ny - i) + 1) % 2) / 2;
			if (y_row[i] == 1)
			{
				break;
			}
		}
		for (i = 0;i < nx;i++)
		{
			for (j = 0;j < ny;j++)
			{
				if (y_row[j] == x_row[i])
				{
					break;
				}
			}
			if (y_row[j] == x_row[i])
			{
				break;
			}
		}
		System.out.printf("%d\n",y_row[j]);
		return 0;
	}
}

