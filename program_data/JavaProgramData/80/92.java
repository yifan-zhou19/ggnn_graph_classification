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
		int sty;
		int std;
		int ey;
		int ed;
		int dy;
		int ry;
		int m;
		int m1;
		int stm;
		int em;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sty = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			stm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			std = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		ry = 0;
		dy = sty;
		while (dy < ey)
		{
			if ((dy % 4 == 0 && dy % 100 != 0) || (dy % 400 == 0))
			{
				ry = ry + 1;
			}
			dy++;
		}
		if ((sty % 4 == 0 && sty % 100 != 0) || (sty % 400 == 0))
		{
			if (stm == 1)
			{
				m = 0;
			}
			else if (stm == 2)
			{
				m = 31;
			}
			else if (stm == 3)
			{
				m = 60;
			}
			else if (stm == 4)
			{
				m = 91;
			}
			else if (stm == 5)
			{
				m = 121;
			}
			else if (stm == 6)
			{
				m = 152;
			}
			else if (stm == 7)
			{
				m = 182;
			}
			else if (stm == 8)
			{
				m = 213;
			}
			else if (stm == 9)
			{
				m = 244;
			}
			else if (stm == 10)
			{
				m = 274;
			}
			else if (stm == 11)
			{
				m = 305;
			}
			else if (stm == 12)
			{
				m = 335;
			}
			else
			{
				System.out.print("error");
			}
		}
		else
		{
			if (stm == 1)
			{
				m = 0;
			}
			else if (stm == 2)
			{
				m = 31;
			}
			else if (stm == 3)
			{
				m = 59;
			}
			else if (stm == 4)
			{
				m = 90;
			}
			else if (stm == 5)
			{
				m = 120;
			}
			else if (stm == 6)
			{
				m = 151;
			}
			else if (stm == 7)
			{
				m = 181;
			}
			else if (stm == 8)
			{
				m = 212;
			}
			else if (stm == 9)
			{
				m = 243;
			}
			else if (stm == 10)
			{
				m = 273;
			}
			else if (stm == 11)
			{
				m = 304;
			}
			else if (stm == 12)
			{
				m = 334;
			}
			else
			{
				System.out.print("error");
			}
		}
		if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
		{
			if (em == 1)
			{
				m1 = 0;
			}
			else if (em == 2)
			{
				m1 = 31;
			}
			else if (em == 3)
			{
				m1 = 60;
			}
			else if (em == 4)
			{
				m1 = 91;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


