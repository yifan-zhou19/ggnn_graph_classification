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
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int i = 0;
		int j = 0;
		int m = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		n = -sd + ed;
		while (i <= sm - 1)
		{
		   switch (i)
		   {
			case 0:
				n = n;
				break;
			case 1:
				n = n - 31;
				break;
			case 2:
				n = n - 30;
				break;
			case 3:
				n = n - 31;
				break;
			case 4:
				n = n - 30;
				break;
			case 5:
				n = n - 31;
				break;
			case 6:
				n = n - 30;
				break;
			case 7:
				n = n - 31;
				break;
			case 8:
				n = n - 31;
				break;
			case 9:
				n = n - 30;
				break;
			case 10:
				n = n - 31;
				break;
			case 11:
				n = n - 30;
				break;
		   }

			i = i + 1;
		}
		if (((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0)) && sm >= 3)
		{
			n = n + 1;
		}
		while (j <= em - 1)
		{
			switch (j)
			{
			case 0:
				n = n;
				break;
			case 1:
				n = n + 31;
				break;
			case 2:
				n = n + 30;
				break;
			case 3:
				n = n + 31;
				break;
			case 4:
				n = n + 30;
				break;
			case 5:
				n = n + 31;
				break;
			case 6:
				n = n + 30;
				break;
			case 7:
				n = n + 31;
				break;
			case 8:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


