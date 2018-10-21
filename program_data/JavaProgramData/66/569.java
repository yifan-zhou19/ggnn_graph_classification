package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long year,month,date;
		int year;
		int month;
		int date;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long i,days,total=0;
		int i;
		int days;
		int total = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long sumrun=0;
		int sumrun = 0;
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
			 date = Integer.parseInt(tempVar3);
		 }


		 days = (year - 1) * (365 % 7) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;


		 if (month == 1)
		 {
			 total = days + date;
		 }
		 else
		 {
			 for (i = 1;i < month;i++)
			 {

					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						total += 31;
					}
					else if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						total += 30;
					}
					else
					{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					total += 29;
				}
				else

				{
					total += 28;
				}
					}
			 }

			 total = total + days + date;
		 }

		 if (total % 7 == 1)
		 {
			 System.out.print("Mon.");
		 }
		 if (total % 7 == 2)
		 {
			 System.out.print("Tue.");
		 }
		 if (total % 7 == 3)
		 {
			 System.out.print("Wed.");
		 }
		 if (total % 7 == 4)
		 {
			 System.out.print("Thu.");
		 }
		 if (total % 7 == 5)
		 {
			 System.out.print("Fri.");
		 }
		 if (total % 7 == 6)
		 {
			 System.out.print("Sat.");
		 }
		 if (total % 7 == 0)
		 {
			 System.out.print("Sun.\n");
		 }
		 return 0;
	}
}

