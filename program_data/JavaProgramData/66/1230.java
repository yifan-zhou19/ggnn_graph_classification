package <missing>;

public class GlobalMembers
{
	public static int RunNian(int year)
	{
	 int result;
	 if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	 {
	  result = 1;
	 }
	 else
	 {
	  result = 0;
	 }
		  return result;
	}
	public static int DiJiTian(int year, int month, int day)
	{
	 int result = 0;
	 for (int i = 1; i < month; i++)
	 {
	  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	  {
	   result += 31;
	  }
	  else if (i == 4 || i == 6 || i == 9 || i == 11)
	  {
	   result += 30;
	  }
	  else if (i == 2)
	  {
	   if (RunNian(year) != 0)
	   {
		result += 29;
	   }
	  else
	  {
		result += 28;
	  }
	  }
	 }
	 result += day;
	 return result;
	}
	public static int Main()
	{
			int y;
			int m;
			int d;
			int d2;
			int d3;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				y = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			d2 = (y - 1) + (y - 1) / 400 * 97 + (y - 1) % 400 / 100 * 24 + (y - 1) % 100 / 4;
			d2 = d2 % 7;
			d3 = DiJiTian(y, m, d) % 7;
			d2 = (d2 + d3) % 7;
			if (d2 == 0)
			{
					System.out.print("Sun.");
			}
			if (d2 == 1)
			{
					System.out.print("Mon.");
			}
			if (d2 == 2)
			{
					System.out.print("Tue.");
			}
			if (d2 == 3)
			{
					System.out.print("Wed.");
			}
			if (d2 == 4)
			{
					System.out.print("Thu.");
			}
			if (d2 == 5)
			{
					System.out.print("Fri.");
			}
			if (d2 == 6)
			{
					System.out.print("Sat.");
			}

			return 0;
	}

}

