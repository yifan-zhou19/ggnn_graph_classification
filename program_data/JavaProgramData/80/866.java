//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int X1(int y,int z) //???????????????????
	{
		int j;
		switch (y) //?????????????
		{
		  case 1:
			  j = z - 1;
			  break;
		  case 2:
			  j = 31 + z - 1;
			  break;
		  case 3:
			  j = 59 + z - 1;
			  break;
		  case 4:
			  j = 90 + z - 1;
			  break;
		  case 5:
			  j = 120 + z - 1;
			  break;
		  case 6:
			  j = 151 + z - 1;
			  break;
		  case 7:
			  j = 181 + z - 1;
			  break;
		  case 8:
			  j = 212 + z - 1;
			  break;
		  case 9:
			  j = 243 + z - 1;
			  break;
		  case 10:
			  j = 273 + z - 1;
			  break;
		  case 11:
			  j = 304 + z - 1;
			  break;
		  default:
			  j = 334 + z - 1;
			  break;
		}
		return (j);
	}
	public static int X2(int y,int z) //??????????????????
	{
		int k;
		switch (y) //?????????????
		{
		  case 1:
			  k = z - 1;
			  break;
		  case 2:
			  k = 31 + z - 1;
			  break;
		  case 3:
			  k = 60 + z - 1;
			  break;
		  case 4:
			  k = 91 + z - 1;
			  break;
		  case 5:
			  k = 121 + z - 1;
			  break;
		  case 6:
			  k = 152 + z - 1;
			  break;
		  case 7:
			  k = 182 + z - 1;
			  break;
		  case 8:
			  k = 213 + z - 1;
			  break;
		  case 9:
			  k = 244 + z - 1;
			  break;
		  case 10:
			  k = 274 + z - 1;
			  break;
		  case 11:
			  k = 305 + z - 1;
			  break;
		  default:
			  k = 335 + z - 1;
			  break;
		}
		return (k);
	}
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int num = 0;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y1 == y2) //????????
		{
		   if (y1 % 100 == 0) //?????????
		   {
			  if (y1 % 400 == 0) //???????
			  {
				  num = num + X2(m2, d2) - X2(m1, d1);
			  }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


