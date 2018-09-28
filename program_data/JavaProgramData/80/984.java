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
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int s;
		int tem;
		int q;
		int w;
		int i;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		int days = new int(int x,int y,int z);
		if (a == d)
		{
			q = days(a, b, c);
			w = days(d, e, f);
			s = w - q;
		}
		else
		{
			q = days(a, b, c);
			w = days(d, e, f);
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			{
			s = 366 - q;
			for (i = a + 1;i <= d - 1;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					s = s + 366;
				}
				else
				{
					s = s + 365;
				}
			}
			s = s + w;
			}
		else
		{
			s = 365 - q;
			for (i = a + 1;i <= d - 1;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					s = s + 366;
				}
				else
				{
					s = s + 365;
				}
			}
			s = s + w;

		}


		}
		System.out.printf("%d",s);

		return 0;
	}
	public static int days(int x,int y,int z)
	{
		int tem;
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
			if (y == 1)
			{
				tem = z;
			}
			else if (y == 2)
			{
				tem = 31 + z;
			}
			else if (y == 3)
			{
				tem = 31 + 29 + z;
			}
			else if (y == 4)
			{
				tem = 31 + 29 + 31 + z;
			}
			else if (y == 5)
			{
				tem = 31 + 29 + 31 + 30 + z;
			}
			else if (y == 6)
			{
				tem = 31 + 29 + 31 + 30 + 31 + z;
			}
			else if (y == 7)
			{
				tem = 31 + 29 + 31 + 30 + 31 + 30 + z;
			}
			else if (y == 8)
			{
				tem = 31 + 29 + 31 + 30 + 31 + 30 + 31 + z;
			}
			else if (y == 9)
			{
				tem = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + z;
			}
			else if (y == 10)
			{
				tem = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + z;
			}
			else if (y == 11)
			{
				tem = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + z;
			}
			else
			{
				tem = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + z;
			}
		}
		else
		{
			if (y == 1)
			{
				tem = z;
			}
			else if (y == 2)
			{
				tem = 31 + z;
			}
			else if (y == 3)
			{
				tem = 31 + 28 + z;
			}
			else if (y == 4)
			{
				tem = 31 + 28 + 31 + z;
			}
			else if (y == 5)
			{
				tem = 31 + 28 + 31 + 30 + z;
			}
			else if (y == 6)
			{
				tem = 31 + 28 + 31 + 30 + 31 + z;
			}
			else if (y == 7)
			{
				tem = 31 + 28 + 31 + 30 + 31 + 30 + z;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


