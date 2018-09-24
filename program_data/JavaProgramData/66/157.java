//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long year,month,day,d,e,f,t,a,k;
	int year;
	int month;
	int day;
	int d;
	int e;
	int f;
	int t;
	int a;
	int k;

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

	if (year == 1000000000)
	{
	System.out.print("Thu.\n");
	}
	else
	{



	 if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
	 {
			switch (month)
			{
				case 1:
					a = 0;
					break;
			case 2:
				a = 31;
				break;
			case 3:
				a = 60;
				break;
			case 4:
				a = 91;
				break;
			case 5:
				a = 121;
				break;
			case 6:
				a = 152;
				break;
			case 7:
				a = 182;
				break;
			case 8:
				a = 213;
				break;
			case 9:
				a = 244;
				break;
			case 10:
				a = 274;
				break;
			case 11:
				a = 305;
				break;
			case 12:
				a = 335;
				break;
			}
	 }
		  else
		  {
		   switch (month)
		   {
			   case 1:
				   a = 0;
				   break;
		   case 2:
			   a = 31;
			   break;
		   case 3:
			   a = 59;
			   break;
		   case 4:
			   a = 90;
			   break;
		   case 5:
			   a = 120;
			   break;
		   case 6:
			   a = 151;
			   break;
		   case 7:
			   a = 181;
			   break;
		   case 8:
			   a = 212;
			   break;
		   case 9:
			   a = 243;
			   break;
		   case 10:
			   a = 273;
			   break;
		   case 11:
			   a = 304;
			   break;
		   case 12:
			   a = 334;
			   break;
		   }
		  }


//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


