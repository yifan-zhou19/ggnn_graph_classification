package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int[] mth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int leap;
		int sum = 0;
		int i;

		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0))
		{
			leap = 1;
		}
		else
		{
			leap = 0;
		}
		if (leap != 0)
		{
			mth[2] = 29;
		}

		for (i = 1;i <= m - 1;i++)
		{
			sum = sum + mth[i];
		}


		sum = sum + d;

		System.out.print(sum);
		return 0;
	}





}

