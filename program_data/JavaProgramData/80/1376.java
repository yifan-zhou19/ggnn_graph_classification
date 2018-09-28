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
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		if (a != d)
		{
			for (;a <= d - 1;a++)
			{
				if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
				{
					s = s + 366;
				}
			 else
			 {
				 s = s + 365;
			 }
			}
		}
		else
		{
			s = 0;
		}
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			{
				if (b == e)
				{
				 s = s + f - c;
				 System.out.printf("%d",s);
				}
				else
				{
					 switch (b)
					 {
			case 1:
			{
				if (e == 2)
				{
					s = s + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 3)
				{
					s = s + 31 + 29 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 4)
				{
					s = s + 31 + 29 + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 5)
				{
					s = s + 31 + 29 + 31 + 30 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 6)
				{
					s = s + 31 + 29 + 31 + 30 + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 7)
				{
					s = s + 31 + 29 + 31 + 30 + 31 + 30 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 8)
				{
					s = s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 9)
				{
					s = s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 10)
				{
					s = s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 11)
				{
					s = s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 12)
				{
					s = s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + f - c;
					System.out.printf("%d",s);
				}
				break;
			}
			case 2:
			{
				if (e == 1)
				{
					s = s - 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 3)
				{
					s = s + 29 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 4)
				{
					s = s + 29 + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 5)
				{
					s = s + 29 + 31 + 30 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 6)
				{
					s = s + 29 + 31 + 30 + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 7)
				{
					s = s + 29 + 31 + 30 + 31 + 30 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 8)
				{
					s = s + 29 + 31 + 30 + 31 + 30 + 31 + f - c;
					System.out.printf("%d",s);
				}
				if (e == 9)
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


