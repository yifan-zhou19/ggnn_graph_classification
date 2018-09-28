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
		int a;
		int b;
		int c;
		int e;
		int f;
		int g;
		int m;
		int n;
		int t;
		int q;
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
		String tempVar4 = ConsoleInput.scanfRead("\n ");
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

		m = 0;
		n = 0;
		q = 0;

		if (b == 1)
		{
			n = 365 - c;
		}
		if (b == 2)
		{
			n = 365 - (31 + c);
		}
		if (b == 3)
		{
			n = 365 - (59 + c);
		}
		if (b == 4)
		{
			n = 365 - (90 + c);
		}
		if (b == 5)
		{
			n = 365 - (120 + c);
		}
		if (b == 6)
		{
			n = 365 - (151 + c);
		}
		if (b == 7)
		{
			n = 365 - (181 + c);
		}
		if (b == 8)
		{
			n = 365 - (212 + c);
		}
		if (b == 9)
		{
			n = 365 - (243 + c);
		}
		if (b == 10)
		{
			n = 365 - (273 + c);
		}
		if (b == 11)
		{
			n = 365 - (304 + c);
		}
		if (b == 12)
		{
			n = 365 - (334 + c);
		}
		else
		{
			;
		}

		if (f == 1)
		{
			m = g;
		}
		if (f == 2)
		{
			m = 31 + g;
		}
		if (f == 3)
		{
			m = 59 + g;
		}
		if (f == 4)
		{
			m = 90 + g;
		}
		if (f == 5)
		{
			m = 120 + g;
		}
		if (f == 6)
		{
			m = 151 + g;
		}
		if (f == 7)
		{
			m = 181 + g;
		}
		if (f == 8)
		{
			m = 212 + g;
		}
		if (f == 9)
		{
			m = 243 + g;
		}
		if (f == 10)
		{
			m = 273 + g;
		}
		if (f == 11)
		{
			m = 304 + g;
		}
		if (f == 12)
		{
			m = 334 + g;
		}
		else
		{
			;
		}

		q = m + n;
		if (a == e)
		{
			q = m - (365 - n);
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0) && b <= 2)
			{
				q = q + 1;
			}
			else
			{
				q = q;
			}
		}
		else
		{
			t = e - a - 1;
			q = q + 365 * t;
			do
				{
					if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
					{
					q = q + 1;
					a = a + 1;
					}
				else
				{
					a = a + 1;
				}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


