package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		int[] bz = {100, 50, 20, 10, 5, 1};
		int y;
		int i;
		int[] num = new int[6];
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = money;
		for (i = 0;i < 6;i++)
		{
			if (y < bz[i])
			{
				num[i] = 0;
				continue;
			}
			else
			{
				num[i] = (y / bz[i]);
				y = y % bz[i];
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

