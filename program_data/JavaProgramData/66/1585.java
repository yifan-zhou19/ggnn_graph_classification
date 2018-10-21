package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int date = 0;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//int a[12]={3,0,3,2,3,2,3,3,2,3,2,3},b[12]={3,1,3,2,3,2,3,3,2,3,2,3};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y > 1)
		{
			date = y - 1 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
			if (m == 1)
			{
				date += d;
			}
			else
			{
				if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
				{
					for (int i = 0;i < m - 1;i++)
					{
						date += a[i];
					}
				}
				else
				{
					for (int i = 0;i < m - 1;i++)
					{
						date += b[i];
					}
				}
				date += d;
			}
			date = date % 7;
		}
		else
		{
			if (m == 1)
			{
				date += d;
			}
			else
			{
				for (int i = 0;i < m - 1;i++)
				{
					date += a[i];
				}
				date += d;
			}
			date = date % 7;
		}
		if (date == 1)
		{
			System.out.print("Mon.");
		}
		if (date == 2)
		{
			System.out.print("Tue.");
		}
		if (date == 3)
		{
			System.out.print("Wed.");
		}
		if (date == 4)
		{
			System.out.print("Thu.");
		}
		if (date == 5)
		{
			System.out.print("Fri.");
		}
		if (date == 6)
		{
			System.out.print("Sat.");
		}
		if (date == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

