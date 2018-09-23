package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int i = 0;
		int j = 0;
		int temp;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (temp == 0)
				{
					break;
				}
			}
			if (j != n)
			{
				break;
			}
		}
		x1 = i;
		y1 = j;
		for (j++;j < n;j++)
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i++;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (temp == 0)
				{
					x2 = i;
					y2 = j;
				}
			}
		}
		System.out.print((x2 - x1 - 1) * (y2 - y1 - 1));
		return 0;
	}
}

