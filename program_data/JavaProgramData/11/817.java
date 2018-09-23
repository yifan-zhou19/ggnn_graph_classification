package <missing>;

public class GlobalMembers
{
	public static int leapyear(int year)
	{
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
		   return 1;
		}
		else
		{
		   return 0;
		}
	}
	   public static int Main()
	   {

		 int[] a = new int[12];
		 int i;
		 int Year;
		 int Month;
		 int Day;
		 int date = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 Year = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 Month = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 Day = Integer.parseInt(tempVar3);
		 }
		 if (leapyear(Year) == 1)
		 {
			   int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			   for (i = 0;i < (Month - 1);i++)
			   {
				  date = date + a[i];
			   }
			   date = date + Day;
			   System.out.printf("%d\n",date);
		 }
		 else if (leapyear(Year) == 0)
		 {
				int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			   for (i = 0;i < (Month - 1);i++)
			   {
				  date = date + a[i];
			   }
			   date = date + Day;
			   System.out.printf("%d\n",date);
		 }
	   }

}

