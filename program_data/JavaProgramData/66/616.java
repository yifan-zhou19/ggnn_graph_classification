package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int year;
	  int month;
	  int day;
	  int days;
	  int a;
	  int b = 0;
	  int c = 0;
	  int d;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  year = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  month = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  day = Integer.parseInt(tempVar3);
	  }
	  a = year - 1;
	  days = a + a / 4 - a / 100 + a / 400;
	  for (int i = 1;i < month;i++)
	  {
	  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	  {
		b += 3;
	  }
	  else if (i == 4 || i == 6 || i == 9 || i == 11)
	  {
	  b += 2;
	  }
	  else if (i == 2)
	  {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
		  b += 1;
		}

	  }
	  }
	  d = (days + b + day) % 7;
	  if (d == 0)
	  {
		  System.out.print("Sun.");
	  }
	else if (d == 1)
	{
		System.out.print("Mon.");
	}
	else if (d == 2)
	{
		System.out.print("Tue.");
	}
	else if (d == 3)
	{
		System.out.print("Wed.");
	}
	else if (d == 4)
	{
		System.out.print("Thu.");
	}
	else if (d == 5)
	{
		System.out.print("Fri.");
	}
	else if (d == 6)
	{
		System.out.print("Sat.");
	}


	 return 0;
	}
}

