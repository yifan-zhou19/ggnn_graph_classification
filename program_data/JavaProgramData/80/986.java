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
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int t1;
		int t2;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		if (y1 == y2)
		{
			if (m2 == 1)
			{
				t2 = t + d2;
			}
			else if (m2 == 2)
			{
				t2 = t + 31 + d2;
			}
			else if (m2 == 3)
			{
				t2 = t + 59 + d2;
			}
			else if (m2 == 4)
			{
				t2 = t + 90 + d2;
			}
			else if (m2 == 5)
			{
				t2 = t + 120 + d2;
			}
			else if (m2 == 6)
			{
				t2 = t + 151 + d2;
			}
			else if (m2 == 7)
			{
				t2 = t + 181 + d2;
			}
			else if (m2 == 8)
			{
				t2 = t + 212 + d2;
			}
			else if (m2 == 9)
			{
				t2 = t + 243 + d2;
			}
			else if (m2 == 10)
			{
				t2 = t + 273 + d2;
			}
			else if (m2 == 11)
			{
				t2 = t + 304 + d2;
			}
			else if (m2 == 112)
			{
				t2 = t + 334 + d2;
			}
			if (m1 == 1)
			{
				t1 = t + d1;
			}
			else if (m1 == 2)
			{
				t1 = t + 31 + d1;
			}
			else if (m1 == 3)
			{
				t1 = t + 59 + d1;
			}
			else if (m1 == 4)
			{
				t1 = t + 90 + d1;
			}
			else if (m1 == 5)
			{
				t1 = t + 120 + d1;
			}
			else if (m1 == 6)
			{
				t1 = t + 151 + d1;
			}
			else if (m1 == 7)
			{
				t1 = t + 181 + d1;
			}
			else if (m1 == 8)
			{
				t1 = t + 212 + d1;
			}
			else if (m1 == 9)
			{
				t1 = t + 243 + d1;
			}
			else if (m1 == 10)
			{
				t1 = t + 273 + d1;
			}
			else if (m1 == 11)
			{
				t1 = t + 304 + d1;
			}
			else if (m1 == 12)
			{
				t1 = t + 334 + d1;
			}
			t = t2 - t1;
		}
		else
		{
		for (i = y1 + 1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				t = t + 366;
			}
			else
			{
				t = t + 365;
			}
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			if (m1 == 1)
			{
				t = t + 366 - d1;
			}
			else if (m1 == 2)
			{
				t = t + 366 - 31 - d1;
			}
			else if (m1 == 3)
			{
				t = t + 366 - 60 - d1;
			}
			else if (m1 == 4)
			{
				t = t + 366 - 91 - d1;
			}
			else if (m1 == 5)
			{
				t = t + 366 - 121 - d1;
			}
			else if (m1 == 6)
			{
				t = t + 366 - 152 - d1;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


