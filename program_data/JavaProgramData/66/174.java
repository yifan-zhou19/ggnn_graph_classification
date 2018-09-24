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
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a,b,c;
			int a;
			int b;
			int c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  c = Integer.parseInt(tempVar3);
	  }
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int d,m;
	 int d;
	 int m;
	 if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
	 {
			switch (b)
			{
			   case 1:
				   m = 0;
				   break;
			   case 2:
				   m = 31;
				   break;
			   case 3:
				   m = 31 + 29;
				   break;
			   case 4:
				   m = 31 + 29 + 31;
				   break;
			   case 5:
				   m = 31 + 29 + 31 + 30;
				   break;
			   case 6:
				   m = 31 + 29 + 31 + 30 + 31;
				   break;
			   case 7:
				   m = 31 + 29 + 31 + 30 + 31 + 30;
				   break;
			   case 8:
				   m = 31 + 29 + 31 + 30 + 31 + 30 + 31;
				   break;
			   case 9:
				   m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				   break;
			   case 10:
				   m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				   break;
			   case 11:
				   m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				   break;
			   case 12:
				   m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				   break;
			}
	 d = m + c;
	 }
	else
	{
		switch (b)
		{
			   case 1:
				   m = 0;
				   break;
			   case 2:
				   m = 31;
				   break;
			   case 3:
				   m = 31 + 28;
				   break;
			   case 4:
				   m = 31 + 28 + 31;
				   break;
			   case 5:
				   m = 31 + 28 + 31 + 30;
				   break;
			   case 6:
				   m = 31 + 28 + 31 + 30 + 31;
				   break;
			   case 7:
				   m = 31 + 28 + 31 + 30 + 31 + 30;
				   break;
			   case 8:
				   m = 31 + 28 + 31 + 30 + 31 + 30 + 31;
				   break;
			   case 9:
				   m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				   break;
			   case 10:
				   m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				   break;
			   case 11:
				   m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				   break;
			   case 12:
				   m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				   break;
		}
	 d = m + c;
	};
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int x,sum,f;
	 int x;
	 int sum;
	 int f;
	x = (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


