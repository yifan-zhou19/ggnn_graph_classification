//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int year;
		int a;
		int b;
		int c;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		year = sy;
		c = (ey - sy) * 365;
		switch (sm)
		{
		case 1:
			a = sd;
			break;
		case 2:
			a = sd + 31;
			break;
		case 3:
			a = sd + 59;
			break;
		case 4:
			a = sd + 90;
			break;
		case 5:
			a = sd + 120;
			break;
		case 6:
			a = sd + 151;
			break;
		case 7:
			a = sd + 181;
			break;
		case 8:
			a = sd + 212;
			break;
		case 9:
			a = sd + 243;
			break;
		case 10:
			a = sd + 273;
			break;
		case 11:
			a = sd + 304;
			break;
		default:
			a = sd + 334;
		}
	   switch (em)
		{
		case 1:
			b = ed;
			break;
		case 2:
			b = ed + 31;
			break;
		case 3:
			b = ed + 59;
			break;
		case 4:
			b = ed + 90;
			break;
		case 5:
			b = ed + 120;
			break;
		case 6:
			b = ed + 151;
			break;
		case 7:
			b = ed + 181;
			break;
		case 8:
			b = ed + 212;
			break;
		case 9:
			b = ed + 243;
			break;
		case 10:
			b = ed + 273;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


