package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int s;
		int sum1 = 0;
		int sum2 = 0;
		int i;
		int[][] md =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= y1 - 1; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum1 = sum1 + 366;
			}
			else
			{
				sum1 = sum1 + 365;
			}
		}
		for (i = 1; i <= m1 - 1;i++)
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				sum1 = sum1 + md[1][i];
			}
			else
			{
				sum1 = sum1 + md[0][i];
			}
		}
		  sum1 = sum1 + d1;

		for (i = 1; i <= y2 - 1; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum2 = sum2 + 366;
			}
			else
			{
				sum2 = sum2 + 365;
			}
		}
		for (i = 1; i <= m2 - 1;i++)
		{
			if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
			{
				sum2 = sum2 + md[1][i];
			}
			else
			{
				sum2 = sum2 + md[0][i];
			}
		}
		  sum2 = sum2 + d2;
		  s = sum2 - sum1;
		if (s >= 0)
		{
			System.out.print(s);
			System.out.print("\n");
		}
		else
		{
			System.out.print(-s);
			System.out.print("\n");
		}
		return 0;
	}





}

