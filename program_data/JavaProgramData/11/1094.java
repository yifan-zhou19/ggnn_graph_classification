package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int k;
		int leap = 0;
		int i;
		int sum = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			leap = 1;
		}
		for (i = 1;i < m;i++)
		{
			switch (i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				k = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				k = 30;
				break;
			case 2:
				if (leap == 1)
				{
						k = 29;
				}
					else
					{
						k = 28;
					}
					break;
			}
			sum += k;
		}
		System.out.print(sum + d);
		return 0;
	}
}

