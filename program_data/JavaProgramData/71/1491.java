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
		int y;
		int m1;
		int m2;
		int n;
		int i;
		int j;
		int k;
		int t;
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
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				t = m1;
				m1 = m2;
				m2 = t;
			}
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				k = 0;
				for (j = m1;j < m2;j++)
				{
					switch (j)
					{
					case 1:
						k = k + 31;
						break;
					case 2:
						k = k + 29;
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
					}
				}
			}
			else
			{
				k = 0;
				for (j = m1;j < m2;j++)
				{
					switch (j)
					{
					case 1:
						k = k + 31;
						break;
					case 2:
						k = k + 28;
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

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


