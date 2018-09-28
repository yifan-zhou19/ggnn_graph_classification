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
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int day;
		int a;
		int b;
		int c;
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
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

		day = 0;

		if ((sy + 1) < ey)
		{
		  for (i = sy + 1;i < ey;i++)
		  {
			  a = i % 4;
			  if (a == 0)
			  {
				b = i % 100;
				if (b == 0)
				{
					c = i % 400;
					if (c == 0)
					{
						day = day + 366;
					}
					else
					{
						day = day + 365;
					}
				}
				else
				{
					day = day + 366;
				}
			  }
			  else
			  {
				  day = day + 365;
			  }
		  }

		for (i = sm;i <= 12;i++)
		{
			if (i == 2)
			{
				day = day + 28;
			}
			else if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				day = day + 31;
			}
			else if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
			{
				day = day + 30;
			}
		}
		day = day - sd;
		if (em > 1)
		{
		for (i = 1;i < em;i++)
		{
			if (i == 2)
			{
				day = day + 28;
			}
			else if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				day = day + 31;
			}
			else if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
			{
				day = day + 30;
			}
		}
		}
		day = day + ed;
		if (sm <= 2)
		{
		  a = sy % 4;
			  if (a == 0)
			  {
				b = sy % 100;
				if (b == 0)
				{
					c = sy % 400;
					if (c == 0)
					{
						day = day + 1;
					}
					else
					{
						day = day;
					}
				}
				else
				{
					day = day + 1;
				}
			  }
			  else
			  {
				  day = day;
			  }
		}
		if (em > 2)
		{
			a = ey % 4;
			  if (a == 0)
			  {
				b = ey % 100;
				if (b == 0)
				{
					c = ey % 400;
					if (c == 0)
					{
						day = day + 1;
					}
					else
					{
						day = day;
					}
				}
				else
				{
					day = day + 1;
				}
			  }
			  else
			  {
				  day = day;
			  }
		}
		}
		else if (sy + 1 == ey)
		{
			 for (i = sm;i <= 12;i++)
		{
			if (i == 2)
			{
				day = day + 28;
			}
			else if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				day = day + 31;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


