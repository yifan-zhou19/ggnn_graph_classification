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
		int r = 0;
		int a;
		int z;
		int i;

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
		r = 0;
		while (y > 2000)
		{
			y = y - 2000;
		}
		for (i = 1;i < y;i++)
		{
			if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
			{
				r++;
			}
			else
			{
				continue;
			}
		}
		z = (y - 1) * 365 + r;

		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		{
				switch (m)
				{
				case 1:
					z = z + d;
					break;
				case 2:
					z += 31 + d;
					break;
				case 3:
					z = z + 31 + 29 + d;
					break;
				case 4:
					z += 31 + 29 + 31 + d;
					break;
				case 5:
					z += 31 + 29 + 31 + 30 + d;
					break;
				case 6:
					z += 31 + 29 + 31 + 30 + 31 + d;
					break;
				case 7:
					z += 31 + 29 + 31 + 30 + 31 + 30 + d;
					break;
				case 8:
					z += 31 + 29 + 31 + 30 + 31 + 30 + 31 + d;
					break;
				case 9:
					z += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d;
					break;
				case 10:
					z += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
					break;
				case 11:
					z += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
					break;
				case 12:
					z += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
					break;
				}
		}
		else
		{
				switch (m)
				{
				case 1:
					z = z + d;
					break;
				case 2:
					z += 31 + d;
					break;
				case 3:
					z = z + 31 + 28 + d;
					break;
				case 4:
					z += 31 + 28 + 31 + d;
					break;
				case 5:
					z += 31 + 28 + 31 + 30 + d;
					break;
				case 6:
					z += 31 + 28 + 31 + 30 + 31 + d;
					break;
				case 7:
					z += 31 + 28 + 31 + 30 + 31 + 30 + d;
					break;
				case 8:
					z += 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
					break;
				case 9:
					z += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
					break;
				case 10:
					z += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
					break;
				case 11:
					z += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


