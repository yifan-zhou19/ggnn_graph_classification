//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int X1(int y,int z) //?????????????????
	{
		int j;
		switch (y) //?????????????
		{
		  case 1:
			  j = z;
			  break;
		  case 2:
			  j = 31 + z;
			  break;
		  case 3:
			  j = 59 + z;
			  break;
		  case 4:
			  j = 90 + z;
			  break;
		  case 5:
			  j = 120 + z;
			  break;
		  case 6:
			  j = 151 + z;
			  break;
		  case 7:
			  j = 181 + z;
			  break;
		  case 8:
			  j = 212 + z;
			  break;
		  case 9:
			  j = 243 + z;
			  break;
		  case 10:
			  j = 273 + z;
			  break;
		  case 11:
			  j = 304 + z;
			  break;
		  default:
			  j = 334 + z;
			  break;
		}
		return (j);
	}
	public static int X2(int y,int z) //????????????????
	{
		int j;
		switch (y) //?????????????
		{
		  case 1:
			  j = z;
			  break;
		  case 2:
			  j = 31 + z;
			  break;
		  case 3:
			  j = 60 + z;
			  break;
		  case 4:
			  j = 91 + z;
			  break;
		  case 5:
			  j = 121 + z;
			  break;
		  case 6:
			  j = 152 + z;
			  break;
		  case 7:
			  j = 182 + z;
			  break;
		  case 8:
			  j = 213 + z;
			  break;
		  case 9:
			  j = 244 + z;
			  break;
		  case 10:
			  j = 274 + z;
			  break;
		  case 11:
			  j = 305 + z;
			  break;
		  default:
			  j = 335 + z;
			  break;
		}
		return (j);
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		int num;
		if (y % 100 == 0)
		{ //?????????
		   if (y % 400 == 0) //???????
		   {
			  num = X2(m, d);
		   }
		   else
		   {
			   num = X1(m, d);
		   }
		}
		else
		{
		   if (y % 4 == 0) //???????
		   {
			 num = X2(m, d);
		   }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


