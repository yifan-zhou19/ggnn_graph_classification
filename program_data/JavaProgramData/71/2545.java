package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int min;
		int k;
		int day = 0;
		int n;
		int y;
		int m1;
		int m2;
		int i;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			day = 0;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
			{
				month[2] = 29;
			}
			else
			{
				month[2] = 28;
			}
			max = m1 > m2 != 0 ? m1 : m2;
			min = m1 < m2 != 0 ? m1 : m2;
			for (i = min; i < max; i++)
			{
				day += month[i];
			}
		if (day % 7 == 0)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
			n--;
		}



		return 0;
	}


}

