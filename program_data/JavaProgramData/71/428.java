package <missing>;

public class GlobalMembers
{
	public static int day(int y,int m)
	{
		int flag;
		int days = 0;
		int i;
		if ((y % 100 != 0 && y % 4 == 0) || y % 400 == 0)
		{
			flag = 1;
		}
		else
		{
			flag = 0;
		}
		int[] month = {0, 31, 28 + flag, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i < m;i++)
		{
			days += month[i];
		}
		return days;
	}

	public static int Main()
	{
	   int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   while (n-- != 0)
	   {
	   int y;
	   int m1;
	   int m2;
	   int s;
	   y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   s = Math.abs(day(y, m1) - day(y, m2));
	   if (s % 7 == 0)
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

