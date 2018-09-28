//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int a = 0;
	public static int b = 0;
	public static int c = 0;
	public static int d = 0;
	public static int e = 0;
	public static void one(char x)
	{
		char y;
		switch (x)
		{
		case 'A':
			y = '0';
			break;
		case 'B':
			y = '0';
			break;
		case 'C':
			a = 5;
			c = 1;
			y = 'C';
			break;
		case 'D':
			if (c != 1)
			{
					 d = 1;
					 y = 'D';
			}
				 else
				 {
					 y = '0';
				 }
				 break;
		case 'E':
			y = '0';
			break;
		}
		if (y == '0')
		{
			one(x + 1);
		}
	}
	public static void two(char x)
	{
		char y;
		switch (x)
		{
		case 'A':
			if (a == 1 || e != 1)
			{
					 y = '0';
			}
				 else
				 {
					 a = 2;
					 y = 'A';
				 }
				 break;
		case 'B':
			if (b == 1)
			{
					 y = '0';
			}
				 else
				 {
					 b = 2;
					 y = 'B';
				 }
				 break;
		case 'C':
			if (c == 1)
			{
					 y = '0';
			}
				 else
				 {
					 c = 2;
					 a = 5;
					 y = 'C';
				 }
				 break;
		case 'D':
			if (c == 1 || d == 1)
			{
					 y = '0';
			}
				 else
				 {
					 d = 2;
					 y = 'D';
				 }
				 break;
		case 'E':
			y = '0';
			break;
		}
		if (y == '0')
		{
			two(x + 1);
		}
	}
	public static void three(char x)
	{
		char y;
		switch (x)
		{
		case 'A':
			if (a == 1 || a == 2 || c == 1 || c == 2 || e == 1)
			{
					 y = '0';
			}
				 else
				 {
					 a = 3;
					 y = 'A';
				 }
				 break;
		case 'B':
			if (b == 1 || b == 2)
			{
					 y = '0';
			}
			else
			{
				b = 3;
				y = 'B';
			}
			break;
		case 'C':
			if (c == 1 || c == 2 || a == 5 || (d != 1 && d != 2))
			{
					 y = '0';
			}
			else
			{
				c = 3;
				y = 'C';
			}
			break;
		case 'D':
			if (d == 1 || d == 2 || e == 1 || e == 2 || c != 1)
			{
					 y = '0';
			}
			else
			{
				d = 3;
				y = 'D';
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
