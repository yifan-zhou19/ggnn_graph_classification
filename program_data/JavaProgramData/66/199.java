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
	 int x;
	 int y;
	 int z;
	 int a;
	 int c;
	 int d;
	 int e;
	 int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}

	 a = (x - 1) / 4 + (x - 1) / 400 - (x - 1) / 100;
	 c = x + a - 1;
		 if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		 {
	   switch (y)
	   {
	   case 1:
		   d = z;
		   break;
	   case 2:
		   d = z + 3;
		   break;
	   case 3:
		   d = z + 4;
		   break;
	   case 4:
		   d = z;
		   break;
	   case 5:
		   d = z + 2;
		   break;
	   case 6:
		   d = z + 5;
		   break;
	   case 7:
		   d = z;
		   break;
	   case 8:
		   d = z + 3;
		   break;
	   case 9:
		   d = z + 6;
		   break;
	   case 10:
		   d = z + 1;
		   break;
	   case 11:
		   d = z + 4;
		   break;
	   case 12:
		   d = z + 6;
	   }
		 }
		 else
		 {
			 switch (y)
			 {
	   case 1:
		   d = z;
		   break;
	   case 2:
		   d = z + 3;
		   break;
	   case 3:
		   d = z + 4 + 6;
		   break;
	   case 4:
		   d = z + 6;
		   break;
	   case 5:
		   d = z + 2 + 6;
		   break;
	   case 6:
		   d = z + 5 + 6;
		   break;
	   case 7:
		   d = z + 6;
		   break;
	   case 8:
		   d = z + 3 + 6;
		   break;
	   case 9:
		   d = z + 6 + 6;
		   break;
	   case 10:
		   d = z + 1 + 6;
		   break;
	   case 11:
		   d = z + 4 + 6;
		   break;
	   case 12:
		   d = z + 6 + 6;
			 }
		 }

		 e = c + d;
		m = e % 7;

		switch (m)
		{
		  case 1:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


