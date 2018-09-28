package <missing>;

public class GlobalMembers
{
	public static int[] day0 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] day1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void judge(int i,int x,int y)
	{
		if (x == y)
		{
			System.out.print("Data Error");
			System.out.print("\n");
		}
		int ds = 0;
		if (i == 1)
		{
			if (x < y)
			{
				for (int j = x;j < y;j++)
				{
					ds = ds + day1[j];
				}
			}
			else
			{
				for (int j = y;j < x;j++)
				{
					ds = ds + day1[j];
				}
			}
			if (ds % 7 == 0)
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
		else
		{
			if (x < y)
			{
				for (int j = x;j < y;j++)
				{
					ds = ds + day0[j];
				}
			}
			else
			{
				for (int j = y;j < x;j++)
				{
					ds = ds + day0[j];
				}
			}
			if (ds % 7 == 0)
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
	}
	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				judge(1, month1, month2);
			}
			else
			{
				judge(0, month1, month2);
			}
			n--;
		}
		return 0;
	}

}

