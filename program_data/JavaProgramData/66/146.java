package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int year,month,date,a,b;
	int year;
	int month;
	int date;
	int a;
	int b;
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
		date = Integer.parseInt(tempVar3);
	}
	a = (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
	switch (month)
	{
			   case 2:
			   case 3:
				   a += 3;
				   break;
			   case 4:
				   a += 6;
				   break;
		  case 5:
			  a += 8;
			  break;
		  case 6:
			  a += 11;
			  break;
		  case 7:
			  a += 13;
			  break;
		  case 8:
			  a += 16;
			  break;
		  case 9:
			  a += 19;
			  break;
		  case 10:
			  a += 21;
			  break;
		  case 11:
			  a += 24;
			  break;
		  case 12:
			  a += 26;
			  break;
	}
	if (month >= 3 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
	{
		a += 1;
	}

	a += date;
	b = a % 7;

	switch (b)
	{
		  case 1 :
			  System.out.print("Mon.\n");
			  break;
		  case 2 :
			  System.out.print("Tue.\n");
			  break;
		  case 3 :
			  System.out.print("Wed.\n");
			  break;
		  case 4 :
			  System.out.print("Thu.\n");
			  break;
		  case 5 :
			  System.out.print("Fri.\n");
			  break;
		  case 6 :
			  System.out.print("Sat.\n");
			  break;
		  case 0 :
			  System.out.print("Sun.\n");
			  break;
	}
	return 0;
	}


}

