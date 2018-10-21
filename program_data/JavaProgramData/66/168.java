package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int year,month,day,sum=0,i,x;
		int year;
		int month;
		int day;
		int sum = 0;
		int i;
		int x;
		int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
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
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			sum = year / 4 - year / 100 + year / 400 - 1;
			sum = sum + (year - 1) % 7 * 365;
			for (i = 0;i < month;i++)
			{
				 sum = sum + a[i];
			}
			sum = sum + day - 1;
		}
		else
		{
			sum = year / 4 - year / 100 + year / 400;
			sum = sum + (year - 1) % 7 * 365;
			for (i = 0;i < month;i++)
			{
				 sum = sum + b[i];
			}
			sum = sum + day - 1;
		}
		x = sum % 7;
		switch (x)
		{
		   case 0:
			   System.out.print("Mon.\n");
			   break;
		   case 1:
			   System.out.print("Tue.\n");
			   break;
		   case 2:
			   System.out.print("Wed.\n");
			   break;
		   case 3:
			   System.out.print("Thu.\n");
			   break;
		   case 4:
			   System.out.print("Fri.\n");
			   break;
		   case 5:
			   System.out.print("Sat.\n");
			   break;
		   default:
			   System.out.print("Sun.\n");
		}
		return 0;
	}


}

