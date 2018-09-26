package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int y1;
		int y2;
		int d1;
		int d2;
		int m1;
		int m2;
		int i;
		int j;
		int[] u1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] u2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1; i < y2; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
			//cout << i << endl;
		}
		//cout << sum << endl;
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			for (j = 1; j < m1; j++)
			{
				sum -= u1[j];
			}
			sum -= d1;
		}
		else
		{
			for (j = 1; j < m1; j++)
			{
				sum -= u2[j];
			}
			sum -= d1;
		} //cout << sum << endl;
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			for (j = 1; j < m2; j++)
			{
				sum += u1[j];
			}
			sum += d2;
		}
		else
		{
			for (j = 1; j < m2; j++)
			{
				sum += u2[j];
			}
			sum += d2;
		}

		System.out.print(sum);
		System.out.print("\n");
	return 0;
	}
}

