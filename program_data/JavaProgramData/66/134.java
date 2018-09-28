//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: int day(unsigned long y,int m,int d)
	public static int day(int y,int m,int d)
	{
	  int t;
	  int i;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
		  switch (m)
		  {
			case 1:
				t = d;
				break;
			case 2:
				t = d + 31;
				break;
			case 3:
				t = d + 60;
				break;
			case 4:
				t = d + 91;
				break;
			case 5:
				t = d + 121;
				break;
			case 6:
				t = d + 152;
				break;
			case 7:
				t = d + 182;
				break;
			case 8:
				t = d + 213;
				break;
			case 9:
				t = d + 244;
				break;
			case 10:
				t = d + 274;
				break;
			case 11:
				t = d + 305;
				break;
			case 12:
				t = d + 335;
				break;
		  }
		}
		else
		{
		  switch (m)
		  {
			case 1:
				t = d;
				break;
			case 2:
				t = d + 31;
				break;
			case 3:
				t = d + 59;
				break;
			case 4:
				t = d + 90;
				break;
			case 5:
				t = d + 120;
				break;
			case 6:
				t = d + 151;
				break;
			case 7:
				t = d + 181;
				break;
			case 8:
				t = d + 212;
				break;
			case 9:
				t = d + 243;
				break;
			case 10:
				t = d + 273;
				break;
			case 11:
				t = d + 304;
				break;
			case 12:
				t = d + 334;
				break;
		  }
		}
	  return (t);
	}

	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: int day(unsigned long,int,int);
	 int day = new int(int,int,int);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long y;
	 int y;
	 int m;
	 int d;
	 int w;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 y = Integer.parseInt(tempVar);
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
	 w = (day(y, m, d) + y - 1 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400) % 7;
	 switch (w)
	  {
	   case 1:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


