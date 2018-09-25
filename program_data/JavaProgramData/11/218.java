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
		int month;
		int day;
		int a;
		int all;
		int[] m1 = new int[5];
		int[] m2 = new int[5];
		int[] m3 = new int[5];
		int i;
		for (i = 0;i <= 4;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m1[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m2[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m3[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i <= 4;i++)
		{
			year = m1[i];
			month = m2[i];
			day = m3[i];
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			switch (month)
			{
			case 1:
				a = 366;
				break;
			case 2:
				a = 335;
				break;
			case 3:
				a = 306;
				break;
			case 4:
				a = 275;
				break;
			case 5:
				a = 245;
				break;
			case 6:
				a = 214;
				break;
			case 7:
				a = 184;
				break;
			case 8:
				a = 153;
				break;
			case 9:
				a = 122;
				break;
			case 10:
				a = 92;
				break;
			case 11:
				a = 61;
				break;
			case 12:
				a = 31;
				break;
			}
			all = 366 - a + day;

		}
		else
		{
			switch (month)
			{
			case 1:
				a = 365;
				break;
			case 2:
				a = 334;
				break;
			case 3:
				a = 306;
				break;
			case 4:
				a = 275;
				break;
			case 5:
				a = 245;
				break;
			case 6:
				a = 214;
				break;
			case 7:
				a = 184;
				break;
			case 8:
				a = 153;
				break;
			case 9:
				a = 122;
				break;
			case 10:
				a = 92;
				break;
			case 11:
				a = 61;
				break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


