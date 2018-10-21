//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int y;
		int m;
		int d;
		int i;
		int j;
		int k;
		int n;
		int y1;
		int a = -1;
		int mo;
		int z;
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
		y1 = (y % 400);
		if (y1 != 0)
		{
		for (i = 0;i < y1;i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				a++;
			}
			else
			{
				a = a;
			}
		}
		j = (366 * a);
		k = 365 * (y1 - a - 1);
		if (((y1 % 4 == 0) && (y1 % 100 != 0)) || (y1 % 400 == 0))
		{
			switch (m)
			{
			case 1:
				mo = d;
				break;
			case 2:
				mo = 31 + d;
				break;
			case 3:
				mo = 60 + d;
				break;
			case 4:
				mo = 91 + d;
				break;
			case 5:
				mo = 121 + d;
				break;
			case 6:
				mo = 152 + d;
				break;
			case 7:
				mo = 182 + d;
				break;
			case 8:
				mo = 213 + d;
				break;
			case 9:
				mo = 244 + d;
				break;
			case 10:
				mo = 274 + d;
				break;
			case 11:
				mo = 305 + d;
				break;
			case 12:
				mo = 335 + d;
				break;
			}
		}
			else
			{
				switch (m)
				{
			case 1:
				mo = d;
				break;
			case 2:
				mo = 31 + d;
				break;
			case 3:
				mo = 59 + d;
				break;
			case 4:
				mo = 90 + d;
				break;
			case 5:
				mo = 120 + d;
				break;
			case 6:
				mo = 151 + d;
				break;
			case 7:
				mo = 181 + d;
				break;
			case 8:
				mo = 212 + d;
				break;
			case 9:
				mo = 243 + d;
				break;
			case 10:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


