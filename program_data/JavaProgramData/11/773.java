package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int year;
	 int month;
	 int day;
	 int x = 0;
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
	 if (month == 2)
	 {
	   x = 31 + day;
	   System.out.printf("%d",x);
	 }
	 else if (month == 1)
	 {
		 x = day;
		 System.out.printf("%d",x);
	 }
	 else
	 {
		 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		 {
			 switch (month)
			 {
					case 3:
						x = 31 + 29;
						break;
					case 4:
						x = 31 + 29 + 31;
						break;

					case 5:
						x = 31 + 29 + 31 + 30;
						break;

					case 6:
						x = 31 + 29 + 31 + 30 + 31;
						break;

					case 7:
						x = 31 + 29 + 31 + 30 + 31 + 30;
						break;

					case 8:
						x = 31 + 29 + 31 + 30 + 31 + 30 + 31;
						break;

					case 9:
						x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
						break;


					case 10:
						x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
						break;


					case 11:
						x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
						break;
					case 12:
						x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
						break;
			 }
		 }
			   else
			   {
					  switch (month)
					  {
					case 3:
						x = 31 + 28;
						break;
					case 4:
						x = 31 + 28 + 31;
						break;

					case 5:
						x = 31 + 28 + 31 + 30;
						break;

					case 6:
						x = 31 + 28 + 31 + 30 + 31;
						break;

					case 7:
						x = 31 + 28 + 31 + 30 + 31 + 30;
						break;

					case 8:
						x = 31 + 28 + 31 + 30 + 31 + 30 + 31;
						break;

					case 9:
						x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
						break;


					case 10:
						x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
						break;


					case 11:
						x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
						break;
					case 12:
						x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
						break;
					  }
			   }
				 x = x + day;

				  System.out.printf("%d",x);
	 }
	}

}

