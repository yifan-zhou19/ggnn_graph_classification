package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n = 0;
		int year = 0;
		int month1 = 0;
		int month2 = 0;
		int num = 0;
		int[] a = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int min = new int(int x, int y);
		int max = new int(int x, int y);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) //????
			{
				a[1] = 29;
			}
			else
			{
				a[1] = 28;
			}
			for (j = min(month1, month2) - 1;j < max(month1, month2) - 1;j++) //???????????
			{
				num += a[j];
			}
			if (num % 7 == 0)
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
	public static int min(int x, int y) //?????
	{
		if (x > y)
		{
			return (y);
		}
		else
		{
			return (x);
		}
	}
	public static int max(int x, int y) //?????
	{
		if (x > y)
		{
			return (x);
		}
		else
		{
			return (y);
		}
	}
}

