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
			 if (year % 400 == 0)
			 {
				if (month == 1)
				{
				System.out.printf("%d",day);
				}
				if (month == 2)
				{
				 System.out.printf("%d",day + 31);
				}
				if (month == 3)
				{
				 System.out.printf("%d",day + 60);
				}
				if (month == 4)
				{
				 System.out.printf("%d",day + 91);
				}
				if (month == 5)
				{
				 System.out.printf("%d",day + 121);
				}
				if (month == 6)
				{
				 System.out.printf("%d",day + 152);
				}
				if (month == 7)
				{
				 System.out.printf("%d",day + 182);
				}
				if (month == 8)
				{
				  System.out.printf("%d",day + 213);
				}
				if (month == 9)
				{
				 System.out.printf("%d",day + 244);
				}
				if (month == 10)
				{
				 System.out.printf("%d",day + 274);
				}
				if (month == 11)
				{
				 System.out.printf("%d",day + 305);
				}
				if (month == 12)
				{
				System.out.printf("%d",day + 335);
				}
			 }
			 else if (year % 4 == 0 && year % 100 != 0)
			 {
				if (month == 1)
				{
				System.out.printf("%d",day);
				}
				if (month == 2)
				{
				 System.out.printf("%d",day + 31);
				}
				if (month == 3)
				{
				 System.out.printf("%d",day + 60);
				}
				if (month == 4)
				{
				 System.out.printf("%d",day + 91);
				}
				if (month == 5)
				{
				 System.out.printf("%d",day + 121);
				}
				if (month == 6)
				{
				 System.out.printf("%d",day + 152);
				}
				if (month == 7)
				{
				 System.out.printf("%d",day + 182);
				}
				if (month == 8)
				{
				  System.out.printf("%d",day + 213);
				}
				if (month == 9)
				{
				 System.out.printf("%d",day + 244);
				}
				if (month == 10)
				{
				 System.out.printf("%d",day + 274);
				}
				if (month == 11)
				{
				 System.out.printf("%d",day + 305);
				}
				if (month == 12)
				{
				System.out.printf("%d",day + 335);
				}
			 }
			   else
			   {
				 if (month == 1)
				 {
				System.out.printf("%d",day);
				 }
				if (month == 2)
				{
				 System.out.printf("%d",day + 31);
				}
				if (month == 3)
				{
				 System.out.printf("%d",day + 59);
				}
				if (month == 4)
				{
				 System.out.printf("%d",day + 90);
				}
				if (month == 5)
				{
				 System.out.printf("%d",day + 120);
				}
				if (month == 6)
				{
				 System.out.printf("%d",day + 151);
				}
				if (month == 7)
				{
				 System.out.printf("%d",day + 181);
				}
				if (month == 8)
				{
				  System.out.printf("%d",day + 212);
				}
				if (month == 9)
				{
				 System.out.printf("%d",day + 243);
				}
				if (month == 10)
				{
				 System.out.printf("%d",day + 273);
				}
				if (month == 11)
				{
				 System.out.printf("%d",day + 304);
				}
				if (month == 12)
				{
				System.out.printf("%d",day + 334);
				}
			   }

	}

}

