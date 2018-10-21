package <missing>;

public class GlobalMembers
{
	public static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int is_leap_year(int y)
	{
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int j;
		int year;
		int m1;
		int m2;
		int max;
		int min;
		int sum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			max = (m1 > m2) ? m1 : m2;
			min = (m1 < m2) ? m1 : m2;
			sum = 0;
			if (is_leap_year(year) != 0)
			{
				days[1]++; // ???2?????
			}
			for (j = min - 1; j < max - 1; j++)
			{
				sum += days[j];
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			if (is_leap_year(year) != 0)
			{
				days[1]--; // ???2?????
			}
		}
	return 0;
	}

}

