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
	//ORIGINAL LINE: unsigned long nian,yue,ri,run,tian,xq;
		int nian;
		int yue;
		int ri;
		int run;
		int tian;
		int xq;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nian = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			yue = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			ri = Integer.parseInt(tempVar3);
		}
		run = (nian - 1) / 4 - (nian - 1) / 100 + (nian - 1) / 400;
		if (nian % 4 == 0 && nian % 100 != 0 || nian % 100 == 0 && nian % 400 == 0)
		{
			switch (yue)
			{
			case 1:
				tian = 0;
				break;
			case 2:
				tian = 31;
				break;
			case 3:
				tian = 60;
				break;
			case 4:
				tian = 91;
				break;
			case 5:
				tian = 121;
				break;
			case 6:
				tian = 152;
				break;
			case 7:
				tian = 182;
				break;
			case 8:
				tian = 213;
				break;
			case 9:
				tian = 244;
				break;
			case 10:
				tian = 274;
				break;
			case 11:
				tian = 305;
				break;
			case 12:
				tian = 335;
				break;
			}
		}
		else
		{
			switch (yue)
			{
			case 1:
				tian = 0;
				break;
			case 2:
				tian = 31;
				break;
			case 3:
				tian = 59;
				break;
			case 4:
				tian = 90;
				break;
			case 5:
				tian = 120;
				break;
			case 6:
				tian = 151;
				break;
			case 7:
				tian = 181;
				break;
			case 8:
				tian = 212;
				break;
			case 9:
				tian = 243;
				break;
			case 10:
				tian = 273;
				break;
			case 11:
				tian = 304;
				break;
			case 12:
				tian = 334;
				break;
			}
		}
		tian = (nian - 1) + run + tian + ri;
		xq = (tian % 7);
		switch (xq)
		{
		   case 0:
			   System.out.print("Sun.\n");

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


