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
		  int a;
		  int b;
		  int p;
		  int q;
		  a = 0,b = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  sy = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  sm = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  sd = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  ey = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  em = Integer.parseInt(tempVar5);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ");
		  if (tempVar6 != null)
		  {
			  ed = Integer.parseInt(tempVar6);
		  }
		  for (p = 0;p < sy;p++)
		  {
							if ((p % 4 == 0 && p % 100 != 0) || (p % 400 == 0))
							{
								a = a + 366;
							}
							else
							{
								a = a + 365;
							}
		  }
		  while (p == sy)
		  {
					   if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
					   {
						   if (sm == 1)
						   {
							   a = a + sd;
						   }
						   else if (sm == 2)
						   {
							   a = a + 31 + sd;
						   }
						   else if (sm == 3)
						   {
							   a = a + 31 + 29 + sd;
						   }
						   else if (sm == 4)
						   {
							   a = a + 31 + 29 + 31 + sd;
						   }
						   else if (sm == 5)
						   {
							   a = a + 31 + 29 + 31 + 30 + sd;
						   }
						   else if (sm == 6)
						   {
							   a = a + 31 + 29 + 31 + 30 + 31 + sd;
						   }
						   else if (sm == 7)
						   {
							   a = a + 31 + 29 + 31 + 30 + 31 + 30 + sd;
						   }
						   else if (sm == 8)
						   {
							   a = a + 31 + 29 + 31 + 30 + 31 + 30 + 31 + sd;
						   }
						   else if (sm == 9)
						   {
							   a = a + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + sd;
						   }
						   else if (sm == 10)
						   {
							   a = a + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + sd;
						   }
						   else if (sm == 11)
						   {
							   a = a + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + sd;
						   }
						   else
						   {
							   a = a + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + sd;
						   }
					   }
					   else
					   {
						   if (sm == 1)
						   {
							   a = a + sd;
						   }
						   else if (sm == 2)
						   {
							   a = a + 31 + sd;
						   }
						   else if (sm == 3)
						   {
							   a = a + 31 + 28 + sd;
						   }
						   else if (sm == 4)
						   {
							   a = a + 31 + 28 + 31 + sd;
						   }
						   else if (sm == 5)
						   {
							   a = a + 31 + 28 + 31 + 30 + sd;
						   }
						   else if (sm == 6)
						   {
							   a = a + 31 + 28 + 31 + 30 + 31 + sd;
						   }
						   else if (sm == 7)
						   {
							   a = a + 31 + 28 + 31 + 30 + 31 + 30 + sd;
						   }
						   else if (sm == 8)
						   {
							   a = a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + sd;
						   }
						   else if (sm == 9)
						   {
							   a = a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + sd;
						   }
						   else if (sm == 10)
						   {
							   a = a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + sd;
						   }
						   else if (sm == 11)
						   {
							   a = a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + sd;
						   }
						   else
						   {
							   a = a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + sd;
						   }
					   }
					   break;
		  }
		  for (q = 0;q < ey;q++)
		  {
							if ((q % 4 == 0 && q % 100 != 0) || (q % 400 == 0))
							{
								b = b + 366;
							}
							else
							{
								b = b + 365;
							}
		  }
		  while (q == ey)
			  {
					   if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
					   {
						   if (em == 1)
						   {
							   b = b + ed;
						   }
						   else if (em == 2)
						   {
							   b = b + 31 + ed;
						   }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


