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
	//ORIGINAL LINE: unsigned int a,b,c,n,d,D,x;
	int a;
	int b;
	int c;
	int n;
	int d;
	int D;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
	{
	switch (b)
	{
	case 1:
		d = 0;
		break;
	case 2:
		d = 31;
		break;
	case 3:
		d = 60;
		break;
	case 4:
		d = 91;
		break;
	case 5:
		d = 121;
		break;
	case 6:
		d = 152;
		break;
	case 7:
		d = 182;
		break;
	case 8:
		d = 213;
		break;
	case 9:
		d = 244;
		break;
	case 10:
		d = 274;
		break;
	case 11:
		d = 305;
		break;
	case 12:
		d = 335;
		break;
	}
	n = d + c;
	D = (a - 1) + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400 + n;
	x = D % 7;
	}
	else
	{
	switch (b)
	{
	case 1:
		d = 0;
		break;
	case 2:
		d = 31;
		break;
	case 3:
		d = 59;
		break;
	case 4:
		d = 90;
		break;
	case 5:
		d = 120;
		break;
	case 6:
		d = 151;
		break;
	case 7:
		d = 181;
		break;
	case 8:
		d = 212;
		break;
	case 9:
		d = 243;
		break;
	case 10:
		d = 273;
		break;
	case 11:
		d = 304;
		break;
	case 12:
		d = 334;
		break;
	}
	n = d + c;
	D = (a - 1) + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400 + n;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


