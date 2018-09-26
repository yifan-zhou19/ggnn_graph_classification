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
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int d1;
		int d2;
		int o;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("  ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			e = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			f = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			g = Integer.parseInt(tempVar6);
		}
		h = 0;
		j = 0;
		for (i = a + 1;i < e;i++) //??????????????????????
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				h = h + 1;
			}
			j = j + 1;
		}
		b -= 1;
		f -= 1;
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) //?????????????????????????
		{
			switch (b)
			{
				case 0:
					d1 = 0;
					break;
				case 1:
					d1 = 31;
					break;
				case 2:
					d1 = 29 + 31;
					break;
				case 3:
					d1 = 31 * 2 + 29;
					break;
				case 4:
					d1 = 30 + 31 * 2 + 29;
					break;
				case 5:
					d1 = 31 * 3 + 30 + 29;
					break;
				case 6:
					d1 = 30 * 2 + 31 * 3 + 29;
					break;
				case 7:
					d1 = 31 * 4 + 30 * 2 + 29;
					break;
				case 8:
					d1 = 31 * 5 + 30 * 2 + 29;
					break;
				case 9:
					d1 = 31 * 5 + 30 * 3 + 29;
					break;
				case 10:
					d1 = 31 * 6 + 30 * 3 + 29;
					break;
				case 11:
					d1 = 31 * 6 + 30 * 4 + 29;
					break;
				default:
					System.out.print("error\n");
			}
		}
		else
		{
			switch (b)
				{
				case 0:
					d1 = 0;
					break;
				case 1:
					d1 = 31;
					break;
				case 2:
					d1 = 28 + 31;
					break;
				case 3:
					d1 = 31 * 2 + 28;
					break;
				case 4:
					d1 = 30 + 31 * 2 + 28;
					break;
				case 5:
					d1 = 31 * 3 + 30 + 28;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


