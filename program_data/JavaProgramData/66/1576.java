package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int judge = 1;
		int[] dayofmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
	  int year;
	  int month;
	  int day;
	  year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int time = (year - 1) / 400;
	  for (int i = time * 400 + 1;i < year;i++)
	  {
	   if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
	   {
		   judge += 2;
	   }
	   else
	   {
		   judge += 1;
	   }
	  }


	  dayofmonth[1] = 28;
	  if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	  {
		  dayofmonth[1] = 29;
	  }
	  for (int i = 0;i < month - 1;i++)
	  {
		  judge += dayofmonth[i];
	  }
	  judge += day - 1;
	  int weekday = judge % 7;
	  switch (weekday)
	  {
	case 1:
		System.out.print("Mon.");
		System.out.print("\n");
		break;
	case 2:
		System.out.print("Tue.");
		System.out.print("\n");
		break;
	case 3:
		System.out.print("Wed.");
		System.out.print("\n");
		break;
	case 4:
		System.out.print("Thu.");
		System.out.print("\n");
		break;
	case 5:
		System.out.print("Fri.");
		System.out.print("\n");
		break;
	case 6:
		System.out.print("Sat.");
		System.out.print("\n");
		break;
	case 0:
		System.out.print("Sun.");
		System.out.print("\n");
		break;
	  }

	  return 0;
	}
}

