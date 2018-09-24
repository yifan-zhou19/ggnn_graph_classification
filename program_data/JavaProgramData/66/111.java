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
		 int sumyearday = 0;
		 int i;
		 int j;
			  if (year > 400)
			  {
				   year = 400 + (year - 400) % 400;
			  }
		 for (i = 1;i < year;i++)
		 {
			 if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
			 {
				  sumyearday = sumyearday + (366 % 7);
			 }
			 else
			 {
				  sumyearday = sumyearday + (365 % 7);
			 }
		 }
		 int[] mday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 int total = 0;
		 for (j = 0;j < month - 1;j++)
		 {
			 total = total + mday[j];
		 }
		 if ((year % 4 == 0 && year % 100 != 0 && month >= 3) || (year % 400 == 0 && month >= 3))
		 {
			 total = total + 1;
		 }
		 int days;
		 days = sumyearday + total % 7 + day % 7;
		 int result;
		 result = days % 7;
		 if (result == 1)
		 {
			 System.out.print("Mon.\n");
		 }
		 else if (result == 2)
		 {
			 System.out.print("Tue.\n");
		 }
		 else if (result == 3)
		 {
			 System.out.print("Wed.\n");
		 }
		 else if (result == 4)
		 {
			 System.out.print("Thu.\n");
		 }
		 else if (result == 5)
		 {
			 System.out.print("Fri.\n");
		 }
		 else if (result == 6)
		 {
			 System.out.print("Sat.\n");
		 }
		 else if (result == 0)
		 {
			 System.out.print("Sun.\n");
		 }
		 return 0;
	 }


}

