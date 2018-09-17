package <missing>;

public class GlobalMembers
{
	public static int cnt_row(int a)
	{
		int cnt = 0;
		while (a != 0)
		{
			a = a / 2;
			cnt++;
		}
		return cnt;
	}
	public static int Main() //???
	{
		int x;
		int y;
		int i;
		int p;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x < y)
		{
			int temp;
			temp = x;
			x = y;
			y = temp;
		}
		p = cnt_row(x) - cnt_row(y); //???x?y?????????????
		for (i = 0; i < p; i++)
		{
			x = x / 2;
		}
		while (x != y) //xy???????????????????
		{
			if (x % 2 == 0)
			{
			   x = x / 2;
			}
			else
			{
				x = (x - 1) / 2;
			}
		if (y % 2 == 0)
		{
			   y = y / 2;
		}
			else
			{
				y = (y - 1) / 2;
			}
		}
		System.out.print(x);
		return 0;
	}
}

