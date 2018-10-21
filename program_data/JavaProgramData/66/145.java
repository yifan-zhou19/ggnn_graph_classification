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
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a,m,d,i,d1,d2,t;
	   int a;
	   int m;
	   int d;
	   int i;
	   int d1;
	   int d2;
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
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
	   d1 = a / 4 - a / 100 + a / 400;
	   if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
	   {
		switch (m)
		{
	   case 1:
		   d2 = -1;
		   break;
	   case 2:
		   d2 = 30;
		   break;
	   case 3:
		   d2 = 59;
		   break;
	   case 4:
		   d2 = 90;
		   break;
	   case 5:
		   d2 = 120;
		   break;
	   case 6:
		   d2 = 151;
		   break;
	   case 7:
		   d2 = 181;
		   break;
	   case 8:
		   d2 = 212;
		   break;
	   case 9:
		   d2 = 243;
		   break;
	   case 10:
		   d2 = 273;
		   break;
	   case 11:
		   d2 = 304;
		   break;
	   case 12:
		   d2 = 334;
		   break;
		}
		i = (a - 1) + d1 + d2 + d;
	   }
	   else
	   {
		switch (m)
		{
	   case 1:
		   d2 = 0;
		   break;
	   case 2:
		   d2 = 31;
		   break;
	   case 3:
		   d2 = 59;
		   break;
	   case 4:
		   d2 = 90;
		   break;
	   case 5:
		   d2 = 120;
		   break;
	   case 6:
		   d2 = 151;
		   break;
	   case 7:
		   d2 = 181;
		   break;
	   case 8:
		   d2 = 212;
		   break;
	   case 9:
		   d2 = 243;
		   break;
	   case 10:
		   d2 = 273;
		   break;
	   case 11:
		   d2 = 304;
		   break;
	   case 12:
		   d2 = 334;
		   break;
		}
		   i = (a - 1) + d1 + d2 + d;
	   }
		t = i % 7;
		 switch (t)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


