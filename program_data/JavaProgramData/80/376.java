public class date
{
	public int year;
	public int month;
	public int day;
}

package <missing>;

public class GlobalMembers
{
	public static int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int count1(int a,int b)
	{
		int i;
		int s = 0;
		for (i = 1;i < a;i++)
		{
			s = s + m[i];
		}
		return s + b;
	}
	public static int count2(int a,int b)
	{
		int i;
		int s = 0;
		for (i = 1;i < a;i++)
		{
			if (i == 2)
			{
				s = s + m[i] + 1;
			}
			else
			{
				s = s + m[i];
			}
		}
		return s + b;
	}
	public static int Main()
	{
		int i;
		int x = 0;
		int[] day = new int[2];
		date start = new date();
		date end = new date();
		start.year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		start.month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		start.day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		end.year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		end.month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		end.day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = start.year;i < end.year;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				x = x + 366;
			}
			else
			{
				x = x + 365;
			}
		}
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		{
			x = x + count2(end.month, end.day) - count2(start.month, start.day);
		}
		else
		{
			x = x + count1(end.month, end.day) - count1(start.month, start.day);
		}
		System.out.print(x);
		System.out.print("\n");
		return 0;
	}
}

