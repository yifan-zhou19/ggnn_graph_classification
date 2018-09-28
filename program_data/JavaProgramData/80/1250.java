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
			int year1;
			int month1;
			int day1;
			int year2;
			int month2;
			int day2;
			int passday1;
			int passday2;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				year1 = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				month1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				day1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				year2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				month2 = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				day2 = Integer.parseInt(tempVar6);
			}

			int Feb1; //???????????????
			int Feb2;
			int passday = 0;
			int i;

			if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0)
			{
				Feb1 = 29;
			}
			else
			{
				Feb1 = 28;
			}
			if ((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0)
			{
				Feb2 = 29;
			}
			else
			{
				Feb2 = 28; //?????????????????29????28?
			}

			/*???????????????????????????????????*/
			switch (month1)
			{
		case 1:
					passday1 = 337 + Feb1 - day1;
					break;
			case 2:
					passday1 = 306 + Feb1 - day1;
					break;
			case 3:
					passday1 = 306 - day1;
					break;
			case 4:
					passday1 = 275 - day1;
					break;
			case 5:
					passday1 = 245 - day1;
					break;
			case 6:
					passday1 = 214 - day1;
					break;
			case 7:
					passday1 = 184 - day1;
					break;
			case 8:
					passday1 = 153 - day1;
					break;
			case 9:
					passday1 = 122 - day1;
					break;
			case 10:
					passday1 = 92 - day1;
					break;
			case 11:
					passday1 = 61 - day1;
					break;
			case 12:
					passday1 = 31 - day1;
					break;
			} //???????????????????????????????????????+???????+?31-????????????

			for (i = year1 + 1;i < year2;i++)
			{
					//printf("add: %d %d %d",year1,year2,i);
					if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
					{
						passday += 366;
					}
					else
					{
						passday += 365;
					}
			} //????????????????

			switch (month2)
			{
			case 1:
					passday2 = day2;
					break;
			case 2:
					passday2 = 31 + day2;
					break;
			case 3:
					passday2 = 31 + Feb2 + day2;
					break;
			case 4:
					passday2 = 62 + Feb2 + day2;
					break;
			case 5:
					passday2 = 92 + Feb2 + day2;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


