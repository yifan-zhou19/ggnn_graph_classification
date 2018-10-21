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
		int n;
		int i;
		int k;
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
		n = 0;
		k = 0;
		for (i = a;i <= d - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				k = k + 1;
			}
		}
		n = (d - a) * 365 + k;
		if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
		{
			switch (e)
			{
			case 1:
				n = n;
				break;
			case 2:
				n = n + 31;
				break;
			case 3:
				n = n + 31 + 29;
				break;
			case 4:
				n = n + 31 + 29 + 31;
				break;
			case 5:
				n = n + 31 + 29 + 31 + 30;
				break;
			case 6:
				n = n + 31 + 29 + 31 + 30 + 31;
				break;
			case 7:
				n = n + 31 + 29 + 31 + 30 + 31 + 30;
				break;
			case 8:
				n = n + 31 + 29 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				n = n + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				n = n + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				n = n + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				n = n + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			}
		}
		else
		{
		switch (e)
			{
			case 1:
				n = n;
				break;
			case 2:
				n = n + 31;
				break;
			case 3:
				n = n + 31 + 28;
				break;
			case 4:
				n = n + 31 + 28 + 31;
				break;
			case 5:
				n = n + 31 + 28 + 31 + 30;
				break;
			case 6:
				n = n + 31 + 28 + 31 + 30 + 31;
				break;
			case 7:
				n = n + 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 8:
				n = n + 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


