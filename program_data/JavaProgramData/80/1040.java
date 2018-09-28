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
	 int y1;
	 int y2;
	 int m1;
	 int m2;
	 int d1;
	 int d2;
	 int year;
	 int m;
	 int d;
	 int t;
	 int te;
	 int ta;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 y1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 m1 = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 d1 = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 y2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 m2 = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ");
	 if (tempVar6 != null)
	 {
		 d2 = Integer.parseInt(tempVar6);
	 }
	 t = (y2 - y1) * 365;
	 te = d1;
	 m1 = m1 - 1;
	 switch (m1)
	 {
	 case 11:
		 te = te+30;
	 case 10:
		 te = te+31;
	 case 9:
		 te = te+30;
	 case 8:
		 te = te+31;
	 case 7:
		 te = te+31;
	 case 6:
		 te = te+30;
	 case 5:
		 te = te+31;
	 case 4:
		 te = te+30;
	 case 3:
		 te = te+31;
	 case 2:
		 te = te+28;
	 case 1:
		 te = te+31;
	 case 0:
		 ;
	 }
	 ta = d2;
	 m2 = m2 - 1;
	 switch (m2)
	 {
	 case 11:
		 ta = ta + 30;
	 case 10:
		 ta = ta + 31;
	 case 9:
		 ta = ta + 30;
	 case 8:
		 ta = ta + 31;
	 case 7:
		 ta = ta + 31;
	 case 6:
		 ta = ta + 30;
	 case 5:
		 ta = ta + 31;
	 case 4:
		 ta = ta + 30;
	 case 3:
		 ta = ta + 31;
	 case 2:
		 ta = ta + 28;
	 case 1:
		 ta = ta + 31;
	 case 0:
		 ;
	 }
	 t = t - te + ta;
	 year = y1;
	 while (year < y2)
	 {
	 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	 {
		 ++t;
	 }
	 ++year;
	 }
	 year = y1;
	 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	 {
	   if (m1 > 2)
	   {
		   t = t - 1;
	   }
	 }
	 year = y2;
	 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	 {
	   if (m2 > 2)
	   {
		   t = t + 1;
	   }
	 }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


