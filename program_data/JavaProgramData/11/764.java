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
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (y % 4 == 0)
		{
				  if (y % 100 == 0)
				  {
							  if (y % 400 == 0)
							  {
							  j = 1;
							  }
							  else
							  {
							  j = 0;
							  }
				  }
				  else
				  {
				  j = 1;
				  }

		}
		else
		{
		j = 0;
		}
		if (j == 1)
		{
			switch (m)
			{
				   case 1:
					   System.out.printf("%d",d);
					   break;
			   case 2:
				   System.out.printf("%d",d + 31);
				   break;
			   case 3:
				   System.out.printf("%d",d + 60);
				   break;
			   case 4:
				   System.out.printf("%d",d + 91);
				   break;
			   case 5:
				   System.out.printf("%d",d + 121);
				   break;
			   case 6:
				   System.out.printf("%d",d + 152);
				   break;
			   case 7:
				   System.out.printf("%d",d + 182);
				   break;
			   case 8:
				   System.out.printf("%d",d + 213);
				   break;
			   case 9:
				   System.out.printf("%d",d + 244);
				   break;
			   case 10:
				   System.out.printf("%d",d + 274);
				   break;
			   case 11:
				   System.out.printf("%d",d + 305);
				   break;
			   case 12:
				   System.out.printf("%d",d + 335);
				   break;
			}
		}



		if (j == 0)
		{
			switch (m)
			   {
				   case 1:
					   System.out.printf("%d",d);
					   break;
			   case 2:
				   System.out.printf("%d",d + 31);
				   break;
			   case 3:
				   System.out.printf("%d",d + 59);
				   break;
			   case 4:
				   System.out.printf("%d",d + 90);
				   break;
			   case 5:
				   System.out.printf("%d",d + 120);
				   break;
			   case 6:
				   System.out.printf("%d",d + 151);
				   break;
			   case 7:
				   System.out.printf("%d",d + 181);
				   break;
			   case 8:
				   System.out.printf("%d",d + 212);
				   break;
			   case 9:
				   System.out.printf("%d",d + 243);
				   break;
			   case 10:
				   System.out.printf("%d",d + 273);
				   break;
			   case 11:
				   System.out.printf("%d",d + 304);
				   break;
			   case 12:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


