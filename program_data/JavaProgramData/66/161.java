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
	   int y;
	   int m;
	   int d;
	   int a;
	   int b;
	   int c;
	   int z;
	   int x1;
	   int x2;
	   int x3;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   y = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   d = Integer.parseInt(tempVar3);
	   }
	   a = (y - 1) / 4;
	   b = (y - 1) / 100;
	   c = (y - 1) / 400;
	   x1 = (365 % 7) * ((y - 1) % 7) + a - b + c;
	   x1 = x1 % 7;
	   if (y % 4 == 0)
	   {
		   switch (m)
		   {
		   case 1:
			   x2 = 0;
			   break;
		   case 2:
			   x2 = 31;
			   break;
		   case 3:
			   x2 = 60;
			   break;
		   case 4:
			   x2 = 91;
			   break;
		   case 5:
			   x2 = 121;
			   break;
		   case 6:
			   x2 = 152;
			   break;
		   case 7:
			   x2 = 182;
			   break;
		   case 8:
			   x2 = 213;
			   break;
		   case 9:
			   x2 = 244;
			   break;
		   case 10:
			   x2 = 274;
			   break;
		   case 11:
			   x2 = 305;
			   break;
		   case 12:
			   x2 = 335;
			   break;
		   }
	   }
		  else
		  {
			  switch (m)
			  {
			  case 1:
				  x2 = 0;
				  break;
			  case 2:
				  x2 = 31;
				  break;
			  case 3:
				  x2 = 59;
				  break;
			  case 4:
				  x2 = 90;
				  break;
			  case 5:
				  x2 = 120;
				  break;
			  case 6:
				  x2 = 151;
				  break;
			  case 7:
				  x2 = 181;
				  break;
			  case 8:
				  x2 = 212;
				  break;
			  case 9:
				  x2 = 243;
				  break;
			  case 10:
				  x2 = 273;
				  break;
			  case 11:
				  x2 = 304;
				  break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


