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
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int x;
		int y;
		int z;
		int n;
		x = 0;
		y = 0;
		z = 0;
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
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}

		for (;a < d;)
		{
				  if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
				  {
				  x = x + 366;
				  }
				  else
				  {
				  x = x + 365;
				  }
				  a++;
		}

		if (b <= e)
		{
				  for (;b < e;)
				  {
							   switch (b)
							   {
										 case 1:
											 y = y + 31;
											 break;
										 case 3:
											 y = y + 31;
											 break;
										 case 5:
											 y = y + 31;
											 break;
										 case 7:
											 y = y + 31;
											 break;
										 case 8:
											 y = y + 31;
											 break;
										 case 10:
											 y = y + 31;
											 break;
										 case 12:
											 y = y + 31;
											 break;
										 case 4:
											 y = y + 30;
											 break;
										 case 6:
											 y = y + 30;
											 break;
										 case 9:
											 y = y + 30;
											 break;
										 case 11:
											 y = y + 30;
											 break;
										 default:
											 if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
											 {

																					 y = y + 29;
											 }


												 else
												 {
													 y = y + 28;
												 }

							   }
							   b++;
				  }
		}
		else
		{
				  for (;e < b;)
				  {
							   switch (e)
							   {
										 case 1:
											 y = y - 31;
											 break;
										 case 3:
											 y = y - 31;
											 break;
										 case 5:
											 y = y - 31;
											 break;
										 case 7:
											 y = y - 31;
											 break;
										 case 8:
											 y = y - 31;
											 break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


