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
	int year;
	int mouth;
	int day;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		year = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		mouth = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		day = Integer.parseInt(tempVar3);
	}
	if (year % 4 == 0)
	{
	switch (mouth)
	{
	case 1:
		n = day;
		System.out.printf("%d",n);
		break;
	case 2:
		n = 31 + day;
		System.out.printf("%d",n);
		break;
	case 3:
		n = 60 + day;
		System.out.printf("%d",n);
		break;
	case 4:
		n = 91 + day;
		System.out.printf("%d",n);
		break;
	case 5:
		n = 121 + day;
		System.out.printf("%d",n);
		break;
	case 6:
		n = 152 + day;
		System.out.printf("%d",n);
		break;
	case 7:
		n = 182 + day;
		System.out.printf("%d",n);
		break;
	case 8:
		n = 213 + day;
		System.out.printf("%d",n);
		break;
	case 9:
		n = 244 + day;
		System.out.printf("%d",n);
		break;
	case 10:
		n = 274 + day;
		System.out.printf("%d",n);
		break;
	case 11:
		n = 305 + day;
		System.out.printf("%d",n);
		break;
	case 12:
		n = 335 + day;
		System.out.printf("%d",n);
		break;
	}
	}
	else
	{
	switch (mouth)
	{
	case 1:
		n = day;
		System.out.printf("%d",n);
		break;
	case 2:
		n = 31 + day;
		System.out.printf("%d",n);
		break;
	case 3:
		n = 59 + day;
		System.out.printf("%d",n);
		break;
	case 4:
		n = 90 + day;
		System.out.printf("%d",n);
		break;
	case 5:
		n = 120 + day;
		System.out.printf("%d",n);
		break;
	case 6:
		n = 151 + day;
		System.out.printf("%d",n);
		break;
	case 7:
		n = 181 + day;
		System.out.printf("%d",n);
		break;
	case 8:
		n = 212 + day;
		System.out.printf("%d",n);
		break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


