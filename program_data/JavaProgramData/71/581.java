package <missing>;

public class GlobalMembers
{
	//???
	public static int fun(int n)
	{
		if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
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
		int n = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			int year = 0;
			int mon1 = 0;
			int mon2 = 0;
			int sum = 0;
			int j = 0;
			int temp = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] mon = {0, 31, 28 + fun(year), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (mon2 < mon1)
			{
				temp = mon1;
				mon1 = mon2;
				mon2 = temp;
			}
			for (j = mon1; j < mon2; j++)
			{
				sum += mon[j];
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}



}

