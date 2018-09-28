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
		int j;
		int i;
		int k;
		int l;
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
		k = 0;
		a = a % 400 + 400;
		for (i = 1;i <= (a - 1);i++)
		{
			if (i % 4 != 0)
			{
				k = k + 1;
			}
			else
			{
				if ((i % 100 == 0) && (i % 400 != 0))
				{
					k = k + 1;
				}
				else
				{
					k = k + 2;
				}
			}
			if (k == 7)
			{
				k = 0;
			}
		}
		if (a % 4 != 0)
		{
			l = 28;
		}
		else
		{
			if ((a % 100 == 0) && (a % 400 != 0))
			{
				l = 28;
			}
			else
			{
				l = 29;
			}
		}
		for (j = 1;j <= b - 1;j++)
		{
			switch (j)
			{
			case 1:
				k = k + 31;
				break;
			case 2:
				k = k + l;
				break;
			case 3:
				k = k + 31;
				break;
			case 4:
				k = k + 30;
				break;
			case 5:
				k = k + 31;
				break;
			case 6:
				k = k + 30;
				break;
			case 7:
				k = k + 31;
				break;
			case 8:
				k = k + 31;
				break;
			case 9:
				k = k + 30;
				break;
			case 10:
				k = k + 31;
				break;
			case 11:
				k = k + 30;
				break;
			case 12:
				k = k + 31;
				break;
			}
			if (k > 6)
			{
				k = k % 7;
			}
		}
		k = k + c;
		if (k > 6)
		{
			k = k % 7;
		}
		switch (k)
		{
		case 0:
			System.out.print("Sun.\n");
			break;
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


