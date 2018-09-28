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
		int n;
		int i;
		int e1;
		int e2;
		int c;
		int dat1;
		int dat2;
		int da1;
		int da2;
		i = 0;
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(year[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(month1[i]) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(month2[i]) = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if ((year[i] % 4 == 0 && year[i] % 100 != 0) || (year[i] % 100 == 0 && year[i] % 400 == 0))
			{
				e1 = month1[i];
				e2 = month2[i];
					if (e1 == 1)
					{
			da1 = 0;
					}
		else if (e1 == 2)
		{
			da1 = 31;
		}
		else if (e1 == 3)
		{
			da1 = 60;
		}
		else if (e1 == 4)
		{
			da1 = 91;
		}
		else if (e1 == 5)
		{
			da1 = 121;
		}
		else if (e1 == 6)
		{
			da1 = 152;
		}
		else if (e1 == 7)
		{
			da1 = 182;
		}
		else if (e1 == 8)
		{
			da1 = 213;
		}
		else if (e1 == 9)
		{
			da1 = 244;
		}
		else if (e1 == 10)
		{
			da1 = 274;
		}
		else if (e1 == 11)
		{
			da1 = 305;
		}
		else
		{
			da1 = 335;
		}
			if (e2 == 1)
			{
			da2 = 0;
			}
		else if (e2 == 2)
		{
			da2 = 31;
		}
		else if (e2 == 3)
		{
			da2 = 60;
		}
		else if (e2 == 4)
		{
			da2 = 91;
		}
		else if (e2 == 5)
		{
			da2 = 121;
		}
		else if (e2 == 6)
		{
			da2 = 152;
		}
		else if (e2 == 7)
		{
			da2 = 182;
		}
		else if (e2 == 8)
		{
			da2 = 213;
		}
		else if (e2 == 9)
		{
			da2 = 244;
		}
		else if (e2 == 10)
		{
			da2 = 274;
		}
		else if (e2 == 11)
		{
			da2 = 305;
		}
		else
		{
			da2 = 335;
		}
				c = da1 - da2;
				if (c % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				e1 = month1[i];
				e2 = month2[i];
		if (e1 == 1)
		{
			dat1 = 0;
		}
		else if (e1 == 2)
		{
			dat1 = 31;
		}
		else if (e1 == 3)
		{
			dat1 = 59;
		}
		else if (e1 == 4)
		{
			dat1 = 90;
		}
		else if (e1 == 5)
		{
			dat1 = 120;
		}
		else if (e1 == 6)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


