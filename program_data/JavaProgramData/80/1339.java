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
		int x;
		int y;
		int z;
		int sum1 = 0;
		int sum2 = 0;
		int t = 0;
		int u = 0;
		int m = 0;
		int n = 0;
		int final;
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
			String tempVar4 = ConsoleInput.scanfRead("\n");
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				y = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				z = Integer.parseInt(tempVar6);
			}

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop1:
	m = m + 1;
					if (m == a)
					{
					   t = t;
					}
				   else
				   {
					 if (m % 4 == 0)
					 {
						  if (m % 100 != 0)
						  {
							  t = t + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							  goto loop1;
						  }
						  else
						  {
							  if (m % 400 == 0)
							  {
								  t = t + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								  goto loop1;
							  }
							  else
							  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								  goto loop1;
							  }
						  }
					 }
					 else
					 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						 goto loop1;
					 }
				   }




//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop2:
	n = n + 1;
					 if (n == x)
					 {
						u = u;
					 }
					else
					{
						if (n % 4 == 0)
						{
							if (n % 100 != 0)
							{
								u = u + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto loop2;
							}
							else
							{
								 if (n % 400 == 0)
								 {
									u = u + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
									goto loop2;
								 }
								 else
								 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
									 goto loop2;
								 }
							}
						}

					  else
					  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						  goto loop2;
					  }
					}
		 sum1 = (a - 1) * 365 + t;
		 sum2 = (x - 1) * 365 + u;
	switch (b)
		 {
		 case 1:
			 sum1 = sum1 + 0;
			 break;
		 case 2:
			 sum1 = sum1 + 31;
			 break;
		 case 3:
			 sum1 = sum1 + 59;
			 break;
		 case 4:
			 sum1 = sum1 + 90;
			 break;
		 case 5:
			 sum1 = sum1 + 120;
			 break;
		 case 6:
			 sum1 = sum1 + 151;
			 break;
		 case 7:
			 sum1 = sum1 + 181;
			 break;
		 case 8:
			 sum1 = sum1 + 212;
			 break;
		 case 9:
			 sum1 = sum1 + 243;
			 break;
		 case 10:
			 sum1 = sum1 + 273;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


