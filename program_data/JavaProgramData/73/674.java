package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int b = 0;
		for (int i = 0;i < 5;++i)
		{
			for (int j = 0;j < 5;++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < 5;++i)
		{
			int max1 = a[i][0];
			int y1 = 0;
			int x1 = -1;
			for (int j = 1;j < 5;++j)
			{
				if (a[i][j] > max1)
				{
					max1 = a[i][j];
					y1 = j;
				}
			}
			for (int j = 0;j < 5;++j)
			{
				if (a[j][y1] < a[i][y1])
				{
				x1 = i;
				break;
				}
			}
			if (x1 == -1)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(y1 + 1);
				System.out.print(" ");
				System.out.print(a[i][y1]);
				b = 1;
			}
		}
		if (b == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

