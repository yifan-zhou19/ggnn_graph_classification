package <missing>;

public class GlobalMembers
{
	public static final String[] WeekDay = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

	public static int Main()
	{
	  int y;
	  int m;
	  int d;
	  int res;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  y = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  d = Integer.parseInt(tempVar3);
	  }
	  res = 0;
	  // count years. note that 365 % 7 = 1, 366 % 7 = 2 and year xx00 has only 365 days xx % 4 != 0
	  res += (y - 1) * 1 % 7;
	  res += (y - 1) / 4 % 7;
	  res -= (y - 1) / 100 % 7;
	  res += (y - 1) / 400 % 7;

	  // count months
	  //Assume February has 30 days. 30 % 7 = 2; 31 % 7 = 3;
	  //After August
	  if (m > 8)
	  {
		res += (m - 7) / 2 * 3 + (m - 8) / 2 * 2;
		res += 3 * 2 + 4 * 3;
	  }
	  else
	  {
	  res += (m - 1) / 2 * 2 + m / 2 * 3;
	  }
	  //February
	  if (m > 2)
	  {
	  if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
	  {
		  res -= 1;
	  }
	  else
	  {
		  res -= 2;
	  }
	  }
	  res %= 7;

	  //count days
	  res += d - 1;
	  res %= 7;

	  System.out.printf("%s.\n", WeekDay[res]);
	}

}

