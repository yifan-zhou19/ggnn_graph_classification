package <missing>;

public class GlobalMembers
{
	public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int isleapyear(int year)
	{
	  return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public static int Main()
	{

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int year, month, day,b,c,d,e;
	  int year;
	  int month;
	  int day;
	  int b;
	  int c;
	  int d;
	  int e;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int f;
	  int f;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  year = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  month = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  day = Integer.parseInt(tempVar3);
	  }
	  int n = 0;
	  int i;
	  for (i = 1; i < month; i++)
	  {
		n = n + days[i];
	  }
	  n = n + day;
	  b = (int)(year / 4);
	  c = (int)(year / 100);
	  d = (int)(year / 400);
	  if (isleapyear(year) == 0)
	  {
	  e = b + d - c;
	  f = e * 2 + (year - e-1) * 1 + n;
	  }
	 if (isleapyear(year) != 0)
	 {
	   e = b + d - c;
	   if (month == 1 || month == 2)
	   {
	   f = (e-1) * 2 + (year - e) * 1 + n;
	   }
	   else
	   {
	   f = (e-1) * 2 + (year - e) * 1 + n + 1;
	   }
	 }
	  if (f % 7 == 1)
	  {
	  System.out.print("Mon.\n");
	  }
	  if (f % 7 == 2)
	  {
	  System.out.print("Tue.\n");
	  }
	  if (f % 7 == 3)
	  {
	  System.out.print("Wed.\n");
	  }
	  if (f % 7 == 4)
	  {
	  System.out.print("Thu.\n");
	  }
	  if (f % 7 == 5)
	  {
	  System.out.print("Fri.\n");
	  }
	  if (f % 7 == 6)
	  {
	  System.out.print("Sat.\n");
	  }
	  if (f % 7 == 0)
	  {
	  System.out.print("Sun.\n");
	  }
	}
}

