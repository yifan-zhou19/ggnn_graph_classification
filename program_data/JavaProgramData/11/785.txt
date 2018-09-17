package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int year;
	 int month;
	 int day;
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
	 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	 {
	   if (month == 1)
	   {
		System.out.printf("%d",day);
	   }
	   else if (month == 2)
	   {
		System.out.printf("%d",31 + day);
	   }
	   else if (month == 3)
	   {
		System.out.printf("%d",31 + 29 + day);
	   }
	   else if (month == 4)
	   {
		System.out.printf("%d",31 + 29 + 31 + day);
	   }
	   else if (month == 5)
	   {
		System.out.printf("%d",31 + 29 + 31 + 30 + day);
	   }
	   else if (month == 6)
	   {
		System.out.printf("%d",31 + 29 + 31 + 30 + 31 + day);
	   }
	   else if (month == 7)
	   {
		System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + day);
	   }
	   else if (month == 8)
	   {
		System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + day);
	   }
	   else if (month == 9)
	   {
		System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day);
	   }
	   else if (month == 10)
	   {
		System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day);
	   }
	   else if (month == 11)
	   {
		System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day);
	   }
	   else
	   {
		System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day);
	   }
	 }
	 else
	 {
	   if (month == 1)
	   {
		System.out.printf("%d",day);
	   }
	   else if (month == 2)
	   {
		System.out.printf("%d",31 + day);
	   }
	   else if (month == 3)
	   {
		System.out.printf("%d",31 + 28 + day);
	   }
	   else if (month == 4)
	   {
		System.out.printf("%d",31 + 28 + 31 + day);
	   }
	   else if (month == 5)
	   {
		System.out.printf("%d",31 + 28 + 31 + 30 + day);
	   }
	   else if (month == 6)
	   {
		System.out.printf("%d",31 + 28 + 31 + 30 + 31 + day);
	   }
	   else if (month == 7)
	   {
		System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + day);
	   }
	   else if (month == 8)
	   {
		System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + day);
	   }
	   else if (month == 9)
	   {
		System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day);
	   }
	   else if (month == 10)
	   {
		System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day);
	   }
	   else if (month == 11)
	   {
		System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day);
	   }
	   else
	   {
		System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day);
	   }
	 }
	 System.out.print("\n");
	  System.in.read();
	  return 0;
	}
}

