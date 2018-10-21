package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] x_ = new int[100];
		int[] y_ = new int[100];
		int i = 0;
		int j = 0;
		int count_x = 0;
		int count_y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x == y)
		{
			System.out.printf("%d\n", x);
		}
		else
		{
			x_[0] = x;
			y_[0] = y;
			for (i = 0; x_[i] > 0; i++)
			{
				x_[i + 1] = x_[i] / 2;
				count_x++;
			}
			for (i = 0; y_[i] > 0; i++)
			{
				y_[i + 1] = y_[i] / 2;
				count_y++;
			}
			i = count_x;
			j = count_y;
			while (i >= 0 && j >= 0)
			{
				if (x_[i] == y_[j] && x_[i - 1] != y_[j - 1])
				{
					System.out.printf("%d\n", x_[i]);
				}
				i--;
				j--;
			}
		}
		return 0;
	}
}

