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
	int year2;
	int month1;
	int month2;
	int day1;
	int day2;
	int sum1 = 0;
	int sum2 = 0;
	int leap1;
	int leap2;
	int c1;
	int c2;
	int a;
	int b;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		year1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		month1 = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		day1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead("\n");
	if (tempVar4 != null)
	{
		year2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		month2 = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		day2 = Integer.parseInt(tempVar6);
	}
	{
		switch (month1)
		{
	case 1:
		sum1 = 0;
		break;
	case 2:
		sum1 = 31;
		break;
	case 3:
		sum1 = 59;
		break;
	case 4:
		sum1 = 90;
		break;
	case 5:
		sum1 = 120;
		break;
	case 6:
		sum1 = 151;
		break;
	case 7:
		sum1 = 181;
		break;
	case 8:
		sum1 = 212;
		break;
	case 9:
		sum1 = 243;
		break;
	case 10:
		sum1 = 273;
		break;
	case 11:
		sum1 = 304;
		break;
	case 12:
		sum1 = 334;
		break;
	default:
		System.out.print("data error");
		break;
		}
	sum1 = sum1 + day1;
	if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
	{
	leap1 = 1;
	}
	else
	{
	leap1 = 0;
	}
	if (leap1 == 1 && month1 > 2)
	{
	sum1 = sum1 + 1;
	}
}
{
	switch (month2)
	{
	case 1:
		sum2 = 0;
		break;
	case 2:
		sum2 = 31;
		break;
	case 3:
		sum2 = 59;
		break;
	case 4:
		sum2 = 90;
		break;
	case 5:
		sum2 = 120;
		break;
	case 6:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


