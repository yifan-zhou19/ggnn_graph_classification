//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void f1(int y1, int m1, int d1, int y2, int m2, int d2)
	{
		int a;
		int i;
		int j = 0;
		int x1;
		int x2;
		for (i = 1;i < y1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				j++;
			}

		}
		x1 = (y1 - 1) * 365 + j;
		j = 0;
		for (i = 1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				j++;
			}

		}
		x2 = (y2 - 1) * 365 + j;


		int t;
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			switch (m1)
			{
			case 1 :
				m1 = 1;
				break;
			case 2 :
				m1 = 32;
				break;
			case 3 :
				m1 = 61;
				break;
			case 4 :
				m1 = 92;
				break;
			case 5 :
				m1 = 122;
				break;
			case 6 :
				m1 = 153;
				break;
			case 7 :
				m1 = 183;
				break;
			case 8 :
				m1 = 214;
				break;
			case 9 :
				m1 = 245;
				break;
			case 10 :
				m1 = 275;
				break;
			case 11 :
				m1 = 306;
				break;
			case 12 :
				m1 = 336;
				break;
			}

		}
		else
		{
			switch (m1)
			{
			case 1 :
				m1 = 1;
				break;
			case 2 :
				m1 = 32;
				break;
			case 3 :
				m1 = 60;
				break;
			case 4 :
				m1 = 91;
				break;
			case 5 :
				m1 = 121;
				break;
			case 6 :
				m1 = 152;
				break;
			case 7 :
				m1 = 182;
				break;
			case 8 :
				m1 = 213;
				break;
			case 9 :
				m1 = 244;
				break;
			case 10 :
				m1 = 274;
				break;
			case 11 :
				m1 = 305;
				break;
			case 12 :
				m1 = 335;
				break;
			}

		}
		x1 = x1 + m1 + d1 - 1;
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			switch (m2)
			{
			case 1 :
				m2 = 1;
				break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


