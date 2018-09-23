package <missing>;

public class GlobalMembers
{
	public static int x1 = 0;
	public static int x2 = 0;
	public static int y1 = 0;
	public static int y2 = 0;
	public static int tag = 0;
	public static int sum = 0;
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					x1 = j;
					y1 = i;
					while (a[y1][j] == 0)
					{
						j++;
					}
					x2 = j - 1;
					while (a[i][x1] == 0)
					{
						i++;
					}
					y2 = i - 1;
					tag = 1;
					break;
				}
			}
			if (tag != 0)
			{
				break;
			}
		}
		if (tag == 0)
		{
			System.out.print(0);
			System.out.print("\n");
			return 0;
		}
			sum = (x2 - x1 - 1) * (y2 - y1 - 1);
			System.out.print(sum);
			System.out.print("\n");
			return 0;
	}

}

