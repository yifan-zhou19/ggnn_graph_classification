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
	  int m1;
	  int d1;
	  int y2;
	  int m2;
	  int d2;
	  int D1 = 0;
	  int D2 = 0;
	  int D = 0;
	  int y;
	  int m;
	  int d;
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
	  String tempVar4 = ConsoleInput.scanfRead("\n");
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

	  y = y1 + 1;
	  while (y >= y1 + 1 && y <= y2 - 1)
	  {
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
		D = D + 366;
		}
		else
		{
			D = D + 365;
		}
		y++;
	  }

	 m = m1 - 1;
	 switch (m)
	 {
	  case 11:
		  D1 = D1 + 30;
	  case 10:
		  D1 = D1 + 31;
	  case 9:
		  D1 = D1 + 30;
	  case 8:
		  D1 = D1 + 31;
	  case 7:
		  D1 = D1 + 31;
	  case 6:
		  D1 = D1 + 30;
	  case 5:
		  D1 = D1 + 31;
	  case 4:
		  D1 = D1 + 30;
	  case 3:
		  D1 = D1 + 31;
	  case 2:
	  {
			  if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
			  {
			  D1 = D1 + 29;
			  }
			  else
			  {
				  D1 = D1 + 28;
			  }
	  }
	  case 1:
		  D1 = D1 + 31;
	  case 0:
		  break;
	 }
	 D1 = D1 + d1;

	 m = m2 - 1;
	 switch (m)
	 {
	  case 11:
		  D2 = D2 + 30;
	  case 10:
		  D2 = D2 + 31;
	  case 9:
		  D2 = D2 + 30;
	  case 8:
		  D2 = D2 + 31;
	  case 7:
		  D2 = D2 + 31;
	  case 6:
		  D2 = D2 + 30;
	  case 5:
		  D2 = D2 + 31;
	  case 4:
		  D2 = D2 + 30;
	  case 3:
		  D2 = D2 + 31;
	  case 2:
	  {
			  if ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)
			  {
			  D2 = D2 + 29;
			  }
			  else
			  {
				  D2 = D2 + 28;
			  }
	  }
	  case 1:
		  D2 = D2 + 31;
	  case 0:
		  break;
	 }
	  D2 = D2 + d2;


//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


