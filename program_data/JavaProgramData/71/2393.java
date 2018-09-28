//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int p(int a,int b,int c)
	{
	int i;
	int x = 0;
	for (i = 1;i < a;i++)
	{
	if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
	{
	x += 366;
	}
	else
	{
		x += 365;
	}
	}
	if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
	{
	switch (b)
	{
	case 2:
		x += 31;
		break;
	case 3:
		x += 60;
		break;
	case 4:
		x += 91;
		break;
	case 5:
		x += 121;
		break;
	case 6:
		x += 152;
		break;
	case 7:
		x += 182;
		break;
	case 8:
		x += 213;
		break;
	case 9:
		x += 244;
		break;
	case 10:
		x += 274;
		break;
	case 11:
		x += 305;
		break;
	case 12:
		x += 335;
		break;
	}
	}
	else
	{
	switch (b)
	{
	case 2:
		x += 31;
		break;
	case 3:
		x += 59;
		break;
	case 4:
		x += 90;
		break;
	case 5:
		x += 120;
		break;
	case 6:
		x += 151;
		break;
	case 7:
		x += 181;
		break;
	case 8:
		x += 212;
		break;
	case 9:
		x += 243;
		break;
	case 10:
		x += 273;
		break;
	case 11:
		x += 304;
		break;
	case 12:
		x += 334;
		break;
	}
	}
	x += c;
	return (x);
	}
	public static void Main()
	{
		int a;
		int b;
		int t;
		int e;
		int x;
		int i;
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


