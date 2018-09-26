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
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int r;
		int s;
		int s1;
		int s2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		if (y1 > y2)
		{
			r = y1;
			y1 = y2;
			y2 = r;
			r = m1;
			m1 = m2;
			m2 = r;
			r = d1;
			d1 = d2;
			d2 = r;
		}
		if (y1 == y2)
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				if (m1 == 1)
				{
					s1 = d1;
				}
				else if (m1 == 2)
				{
					s1 = d1 + 31;
				}
				else if (m1 == 3)
				{
					s1 = d1 + 60;
				}
				else if (m1 == 4)
				{
					s1 = d1 + 91;
				}
				else if (m1 == 5)
				{
					s1 = d1 + 121;
				}
				else if (m1 == 6)
				{
					s1 = d1 + 152;
				}
				else if (m1 == 7)
				{
					s1 = d1 + 182;
				}
				else if (m1 == 8)
				{
					s1 = d1 + 213;
				}
				else if (m1 == 9)
				{
					s1 = d1 + 244;
				}
				else if (m1 == 10)
				{
					s1 = d1 + 274;
				}
				else if (m1 == 11)
				{
					s1 = d1 + 305;
				}
				else if (m1 == 12)
				{
					s1 = d1 + 335;
				}
				if (m2 == 1)
				{
					s2 = d2;
				}
				else if (m2 == 2)
				{
					s2 = d2 + 31;
				}
				else if (m2 == 3)
				{
					s2 = d2 + 60;
				}
				else if (m2 == 4)
				{
					s2 = d2 + 91;
				}
				else if (m2 == 5)
				{
					s2 = d2 + 121;
				}
				else if (m2 == 6)
				{
					s2 = d2 + 152;
				}
				else if (m2 == 7)
				{
					s2 = d2 + 182;
				}
				else if (m2 == 8)
				{
					s2 = d2 + 213;
				}
				else if (m2 == 9)
				{
					s2 = d2 + 244;
				}
				else if (m2 == 10)
				{
					s2 = d2 + 274;
				}
				else if (m2 == 11)
				{
					s2 = d2 + 305;
				}
				else if (m2 == 12)
				{
					s2 = d2 + 335;
				}
				s = s2 - s1;
			}
			else
			{
				if (m1 == 1)
				{
					s1 = d1;
				}
				if (m1 == 2)
				{
					s1 = d1 + 31;
				}
				if (m1 == 3)
				{
					s1 = d1 + 59;
				}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


