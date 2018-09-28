package <missing>;

public class GlobalMembers
{
	public static int leapyear(int y)
	{
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int monthday(int y, int m)
	{
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
		{
			return 31;
		}
		else if (m == 2)
		{
			return 28 + leapyear(y);
		}
		else
		{
			return 30;
		}
	}

	public static void Main()
	{

		int n;
		int year;
		int month1;
		int month2;
		int i;
		int j;
		int temp;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
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
			if (month1 > month2)
			{ //?????
				temp = month1;
				month1 = month2;
				month2 = temp;
			}

			for (j = month1;j < month2;j++) //??????????????
			{
				sum += monthday(year, j);
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			sum = 0;
		}
	}
}

