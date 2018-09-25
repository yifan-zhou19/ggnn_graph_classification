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
		int A;
		int B;
		int C;
		int d;
		int z;
		int leap;
		int i;
		i = 1;
	while (i <= 5)
		{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		A = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		B = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		C = Integer.parseInt(tempVar3);
	}
		if (A % 4 == 0)
		{
			if (A % 100 == 0)
			{
				if (A % 400 == 0)
				{
					leap = 1;
				}
				else
				{
					leap = 0;
				}
			}
			else
			{
				leap = 1;
			}
		}
		else
		{
		leap = 0;
		}
		if (leap != 0)
		{
			switch (B)
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
			z = d + C;
		}
		else
		{
		switch (B)
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

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


