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
		int i;
		int j;
		int g;
		int sumy1;
		int sumy2;
		int summ1;
		int summ2;
		int h;
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
		sumy1 = 0;
		for (i = 1;i <= a - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				g = 1;
			}
			else
			{
				g = 0;
			}
			sumy1 = sumy1 + g;
		}
		sumy1 = sumy1 + 365 * (a - 1);
		sumy2 = 0;
		for (i = 1;i <= d - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				g = 1;
			}
			else
			{
				g = 0;
			}
			sumy2 = sumy2 + g;
		}
		sumy2 = sumy2 + 365 * (d - 1);
		/*???*/

		if (b == 1)
		{
			summ1 = 0;
		}
		if (b == 2)
		{
			summ1 = 31;
		}
		if (b == 3)
		{
			summ1 = 31 + 28;
		}
		if (b == 4)
		{
			summ1 = 31 + 28 + 31;
		}
		if (b == 5)
		{
			summ1 = 31 + 28 + 31 + 30;
		}
		if (b == 6)
		{
			summ1 = 31 + 28 + 31 + 30 + 31;
		}
		if (b == 7)
		{
			summ1 = 31 + 28 + 31 + 30 + 31 + 30;
		}
		if (b == 8)
		{
			summ1 = 31 + 28 + 31 + 30 + 31 + 30 + 31;
		}
		if (b == 9)
		{
			summ1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		}
		if (b == 10)
		{
			summ1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		}
		if (b == 11)
		{
			summ1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		}
		if (b == 12)
		{
			summ1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}
		if (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && (b >= 3))
		{
			g = 1;
		}
		else
		{
			g = 0;
		}
		summ1 = summ1 + g;
		if (e == 1)
		{
			summ2 = 0;
		}
		if (e == 2)
		{
			summ2 = 31;
		}
		if (e == 3)
		{
			summ2 = 31 + 28;
		}
		if (e == 4)
		{
			summ2 = 31 + 28 + 31;
		}
		if (e == 5)
		{
			summ2 = 31 + 28 + 31 + 30;
		}
		if (e == 6)
		{
			summ2 = 31 + 28 + 31 + 30 + 31;
		}
		if (e == 7)
		{
			summ2 = 31 + 28 + 31 + 30 + 31 + 30;
		}
		if (e == 8)
		{
			summ2 = 31 + 28 + 31 + 30 + 31 + 30 + 31;
		}
		if (e == 9)
		{
			summ2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		}
		if (e == 10)
		{
			summ2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


