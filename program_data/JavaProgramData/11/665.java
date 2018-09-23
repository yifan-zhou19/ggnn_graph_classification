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
		int y1;
		int m;
		int d;
		int no;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		no = 0;
		if (y1 % 4 == 0)
		{
			if (y1 % 400 == 0)
			{
				switch (m)
				{
				case 1:
					no = d;
					break;
				case 2:
					no = d + 31;
					break;
				case 3:
					no = d + 60;
					break;
				case 4:
					no = d + 91;
					break;
				case 5:
					no = d + 121;
					break;
				case 6:
					no = d + 152;
					break;
				case 7:
					no = d + 182;
					break;
				case 8:
					no = d + 213;
					break;
				case 9:
					no = d + 243;
					break;
				case 10:
					no = d + 274;
					break;
				case 11:
					no = d + 304;
					break;
				case 12:
					no = d + 335;
					break;
				}
			}
			else
			{
				if (y1 % 100 == 0)
				{
					switch (m)
					{
					case 1:
						no = d;
						break;
					case 2:
						no = d + 31;
						break;
					case 3:
						no = d + 59;
						break;
					case 4:
						no = d + 90;
						break;
					case 5:
						no = d + 120;
						break;
					case 6:
						no = d + 151;
						break;
					case 7:
						no = d + 181;
						break;
					case 8:
						no = d + 212;
						break;
					case 9:
						no = d + 243;
						break;
					case 10:
						no = d + 273;
						break;
					case 11:
						no = d + 304;
						break;
					case 12:
						no = d + 334;
						break;
					}
				}
				else
				{
					switch (m)
					{
					case 1:
						no = d;
						break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


