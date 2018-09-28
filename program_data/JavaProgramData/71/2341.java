package <missing>;

public class GlobalMembers
{
	public static int is_leap_year(int n)
	{
		if ((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0)))
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
		int n;
		int y;
		int m1;
		int m2;
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		int sum = 0;

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
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			sum = 0;
			if (is_leap_year(y) != 0) // if leap year
			{
				days[1] = 29;
			}
			else
			{
				days[1] = 28;
			}
			if (m1 > m2)
			{ // make sure m2 > m1
				j = m1;
				m1 = m2;
				m2 = j;
			}
			for (j = m1 - 1; j < (m2 - 1); j++)
			{
				sum += days[j];
			}
			if (sum % 7 == 0)
			{
				System.out.printf("%s\n", "YES");
			}
			else
			{
				System.out.printf("%s\n", "NO");
			}
		}

		return 0;
	}


}

