package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] days = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int year = 0;
		int month1 = 0;
		int month2 = 0;
		int i = 0;
		int j = 0;
		int n = 0;
		int mid = 0;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{
				days[1] = 29;
			}
			else
			{
				days[1] = 28;
			}
			if (month1 > month2)
			{
				mid = month1;
				month1 = month2;
				month2 = mid;
			}
			total = days[month1 - 1];
			for (j = 0;j < month2 - month1 - 1;j++)
			{
				total += days[month1 + j];
			}
			if (i != n - 1)
			{
				if (total % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			if (i == n - 1)
			{
				if (total % 7 == 0)
				{
					System.out.print("YES");
				}
				else
				{
					System.out.print("NO");
				}
			}
		}
	}

}

