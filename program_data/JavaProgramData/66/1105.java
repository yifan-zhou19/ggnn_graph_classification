package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
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
	public static int DiJiTian(int year,int month, int day)
	{
		int result = 0;
		for (int i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 3;
			}
			 else if (i == 4 || i == 6 || i == 9 || i == 11)
			 {
				result += 2;
			 }
			 else if (i == 2)
			 {
				if (isRunNian(year) != 0)
				{
					result += 1;
				}
				else
				{
					result += 0;
				}
			 }
		}
		result += day;
		return result;
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 c = Integer.parseInt(tempVar3);
	 }
	 for (int i = 1;i <= (a + 399) % 400;i++)
	 {
		  if (isRunNian(i) != 0)
		  {
		  s += 2;
		  }
		  else
		  {
		  s += 1;
		  }
	 }
		  d = s + DiJiTian(a, b, c);
		  if (d % 7 == 1)
		  {
		  System.out.print("Mon.");
		  }
		  if (d % 7 == 2)
		  {
		  System.out.print("Tue.");
		  }
		  if (d % 7 == 3)
		  {
		  System.out.print("Wed.");
		  }
		  if (d % 7 == 4)
		  {
		  System.out.print("Thu.");
		  }
		  if (d % 7 == 5)
		  {
		  System.out.print("Fri.");
		  }
		  if (d % 7 == 6)
		  {
		  System.out.print("Sat.");
		  }
		  if (d % 7 == 0)
		  {
		  System.out.print("Sun.");
		  }
		  return 0;
	}


}

