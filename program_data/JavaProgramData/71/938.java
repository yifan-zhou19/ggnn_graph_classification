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
		int n;
		int a;
		int i;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			{
				if (b == 1)
				{
				   d = 1;
				}
				else if (b == 2)
				{
				   d = 31 + 1;
				}
				else if (b == 3)
				{
				   d = 31 + 29 + 1;
				}
				else if (b == 4)
				{
					d = 31 + 29 + 31 + 1;
				}
				else if (b == 5)
				{
				   d = 31 + 29 + 31 + 30 + 1;
				}
				else if (b == 6)
				{
				   d = 31 + 29 + 31 + 30 + 31 + 1;
				}
				else if (b == 7)
				{
					d = 31 + 29 + 31 + 30 + 31 + 30 + 1;
				}
			   else if (b == 8)
			   {
				   d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 1;
			   }
				else if (b == 9)
				{
					d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 1;
				}
			   else if (b == 10)
			   {
				   d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 1;
			   }
			   else if (b == 11)
			   {
				   d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 1;
			   }
			   else if (b == 12)
			   {
				   d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 1;
			   }

				if (c == 1)
				{
				e = 1;
				}
			else if (c == 2)
			{
				e = 31 + 1;
			}
			else if (c == 3)
			{
				e = 31 + 29 + 1;
			}
			else if (c == 4)
			{
				e = 31 + 29 + 31 + 1;
			}
			else if (c == 5)
			{
				e = 31 + 29 + 31 + 30 + 1;
			}
			else if (c == 6)
			{
				e = 31 + 29 + 31 + 30 + 31 + 1;
			}
			else if (c == 7)
			{
				e = 31 + 29 + 31 + 30 + 31 + 30 + 1;
			}
			else if (c == 8)
			{
				e = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 1;
			}
			else if (c == 9)
			{
				e = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 1;
			}
			else if (c == 10)
			{
				e = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 1;
			}
			else if (c == 11)
			{
				e = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 1;
			}
			else if (c == 12)
			{
				e = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 1;
			}
			}
			else
			{
			if (b == 1)
			{
				d = 1;
			}
			else if (b == 2)
			{
				d = 31 + 1;
			}
			else if (b == 3)
			{
				d = 31 + 28 + 1;
			}
			else if (b == 4)
			{
				d = 31 + 28 + 31 + 1;
			}
			else if (b == 5)
			{
				d = 31 + 28 + 31 + 30 + 1;
			}
			else if (b == 6)
			{
				d = 31 + 28 + 31 + 30 + 31 + 1;
			}
			else if (b == 7)
			{
				d = 31 + 28 + 31 + 30 + 31 + 30 + 1;
			}
			else if (b == 8)
			{
				d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 1;
			}
			else if (b == 9)
			{
				d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 1;
			}
			else if (b == 10)
			{
				d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 1;
			}
			else if (b == 11)
			{
				d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 1;
			}
			else if (b == 12)
			{
				d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 1;
			}
			if (c == 1)
			{
				e = 1;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


