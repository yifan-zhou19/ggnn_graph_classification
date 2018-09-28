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
	 int y2;
	 int m1;
	 int m2;
	 int d1;
	 int d2;
	 int x;
	 int n1;
	 int n2;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 y1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m1 = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 d1 = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 y2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 m2 = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead();
	 if (tempVar6 != null)
	 {
		 d2 = Integer.parseInt(tempVar6);
	 }
	 if (y1 == y2 && m1 == m2)
	 {
		 x = Math.abs(d1 - d2);
	 }
	 if (y1 == y2 && m1 != m2)
	  {
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
		   if (m1 == 1)
		   {
			   n1 = d1;
		   }
		   if (m2 == 1)
		   {
			   n2 = d2;
		   }
		   if (m1 == 2)
		   {
			   n1 = d1 + 31;
		   }
		   if (m2 == 2)
		   {
			   n2 = d2 + 31;
		   }
		   if (m1 == 3)
		   {
			   n1 = d1 + 60;
		   }
		   if (m2 == 3)
		   {
			   n2 = d2 + 60;
		   }
		   if (m1 == 4)
		   {
			   n1 = d1 + 91;
		   }
		   if (m2 == 4)
		   {
			   n2 = d2 + 91;
		   }
		   if (m1 == 5)
		   {
			   n1 = d1 + 121;
		   }
		   if (m2 == 5)
		   {
			   n2 = d2 + 121;
		   }
		   if (m1 == 6)
		   {
			   n1 = d1 + 152;
		   }
		   if (m2 == 6)
		   {
			   n2 = d2 + 152;
		   }
		   if (m1 == 7)
		   {
			   n1 = d1 + 182;
		   }
		   if (m2 == 7)
		   {
			   n2 = d2 + 182;
		   }
		   if (m1 == 8)
		   {
			   n1 = d1 + 213;
		   }
		   if (m2 == 8)
		   {
			   n2 = d2 + 213;
		   }
		   if (m1 == 9)
		   {
			   n1 = d1 + 244;
		   }
		   if (m2 == 9)
		   {
			   n2 = d2 + 244;
		   }
		   if (m1 == 10)
		   {
			   n1 = d1 + 274;
		   }
		   if (m2 == 10)
		   {
			   n2 = d2 + 274;
		   }
		   if (m1 == 11)
		   {
			   n1 = d1 + 305;
		   }
		   if (m2 == 11)
		   {
			   n2 = d2 + 305;
		   }
		   if (m1 == 12)
		   {
			   n1 = d1 + 335;
		   }
		   if (m2 == 12)
		   {
			   n2 = d2 + 335;
		   }
		}
		 else
		  {
		   if (m1 == 1)
		   {
			   n1 = d1;
		   }
		   if (m2 == 1)
		   {
			   n2 = d2;
		   }
		   if (m1 == 2)
		   {
			   n1 = d1 + 31;
		   }
		   if (m2 == 2)
		   {
			   n2 = d2 + 31;
		   }
		   if (m1 == 3)
		   {
			   n1 = d1 + 59;
		   }
		   if (m2 == 3)
		   {
			   n2 = d2 + 59;
		   }
		   if (m1 == 4)
		   {
			   n1 = d1 + 90;
		   }
		   if (m2 == 4)
		   {
			   n2 = d2 + 90;
		   }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


