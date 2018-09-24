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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct
	//	 {
	////C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	////ORIGINAL LINE: unsigned int year;
	//		uint year;
	//		int month;
	//		int date;
	//		int dayoftheyear;
	//	}
	//	nn;
		 int week = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int sum=0;
		 int sum = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 nn.year = tempVar;
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 nn.month = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 nn.date = tempVar3;
		 }
		 sum = (nn.year - 1) + (nn.year - 1) / 4 - (nn.year - 1) / 100 + (nn.year - 1) / 400;


		if (((nn.year % 4 == 0) && (nn.year % 100 != 0)) || (nn.year % 400 == 0))
		{

			   switch (nn.month)
			   {
				case 1:
				nn.dayoftheyear = nn.date;
				break;
				case 2:
				nn.dayoftheyear = nn.date + jan;
				break;
				case 3:
				nn.dayoftheyear = nn.date + jan + feb + 1;
				break;
				case 4:
				nn.dayoftheyear = nn.date + jan + feb + mar + 1;
				break;
				case 5:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + 1;
				break;
				case 6:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + 1;
				break;
				case 7:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + 1;
				break;
				case 8:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + 1;
				break;
				case 9:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + aug + 1;
				break;
				case 10:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + aug + sep + 1;
				break;
				case 11:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + aug + sep + oct + 1;
				break;
				case 12:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov + 1;
				break;
			   }
		}
			   else
			   {

				switch (nn.month)
				{
				case 1:
				nn.dayoftheyear = nn.date;
				break;
				case 2:
				nn.dayoftheyear = nn.date + jan;
				break;
				case 3:
				nn.dayoftheyear = nn.date + jan + feb;
				break;
				case 4:
				nn.dayoftheyear = nn.date + jan + feb + mar;
				break;
				case 5:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr;
				break;
				case 6:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may;
				break;
				case 7:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun;
				break;
				case 8:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul;
				break;
				case 9:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + aug;
				break;
				case 10:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + aug + sep;
				break;
				case 11:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + aug + sep + oct;
				break;
				case 12:
				nn.dayoftheyear = nn.date + jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov;
				break;
				}

			   }
			   sum += nn.dayoftheyear;
			   week = sum % 7;
			   switch (week)
			   {
			   case 0:
				   System.out.print("Sun.");
				   break;
			   case 1:
				   System.out.print("Mon.");
				   break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


