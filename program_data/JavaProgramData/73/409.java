package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int x;
		int y;
		int[] max = new int[6];
		int[] maxx = new int[6];
		int[] maxy = new int[6];
		int yy;
		int i;
		for (y = 1;y <= 5;y++)
		{
			for (x = 1;x <= 5;x++)
			{
				a[x][y] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (y = 1;y <= 5;y++)
		{
			for (x = 1;x <= 5;x++)
			{
				if (a[x][y] > max[y])
				{
					max[y] = a[x][y];
					maxx[y] = x;
					maxy[y] = y;
				}
			}
		}
		for (y = 1;y <= 5;y++)
		{
			for (yy = 1;yy <= 5;yy++)
			{
				if (max[y] > a[maxx[y]][yy])
				{
					max[y] = 0;
					break;
				}
			}
		}
		i = 1;
		for (y = 1;y <= 5;y++)
		{
			if (max[y] != 0)
			{
				System.out.print(maxy[y]);
				System.out.print(" ");
				System.out.print(maxx[y]);
				System.out.print(" ");
				System.out.print(max[y]);
				i = 0;
			}
		}
		if (i == 1)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

