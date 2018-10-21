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
		int a1;
		int a2;
		int a3;
		int b1;
		int b2;
		int b3;
		int t1;
		int t2;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a2 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a3 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b1 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			b3 = Integer.parseInt(tempVar6);
		}
		if ((a1 % 4 == 0 && a1 % 100 != 0) || (a1 % 400 == 0))
		{
			if (a2 <= 2)
			{
				t1 = (a2 - 1) * 31 + a3;
			}
			else if (a2 <= 7)
			{
				if (a2 % 2 == 1)
				{
					t1 = (a2 - 2) / 2 * 61 + a3 + 60;
				}
				else
				{
					t1 = ((a2 - 2) / 2 - 1) * 61 + a3 + 31 + 60;
				}
			}
			else if (a2 > 7)
			{
				if (a2 % 2 == 1)
				{
					t1 = 213 + ((a2 - 7) / 2 - 1) * 61 + 31 + a3;
				}
				else
				{
					t1 = 213 + (a2 - 7) / 2 * 61 + a3;
				}
			}
			if ((b1 % 4 == 0 && b1 % 100 != 0) || (b1 % 400 == 0))
			{
				if (b2 <= 2)
				{
					t2 = (b2 - 1) * 31 + b3;
				}
				else if (b2 <= 7)
				{
					if (b2 % 2 == 1)
					{
						t2 = (b2 - 2) / 2 * 61 + b3 + 60;
					}
					else
					{
						t2 = ((b2 - 2) / 2 - 1) * 61 + b3 + 31 + 60;
					}
				}
				else if (b2 > 7)
				{
					if (b2 % 2 == 1)
					{
						t2 = 213 + ((b2 - 7) / 2 - 1) * 61 + 31 + b3;
					}
					else
					{
						t2 = 213 + (b2 - 7) / 2 * 61 + b3;
					}
				}
			d = (b1 - a1) * (366 + 365 * 3) / 4 + t2 - t1;
			}
			else
			{
				if (b2 <= 2)
				{
					t2 = (b2 - 1) * 31 + b3;
				}
				else if (b2 <= 7)
				{
					if (b2 % 2 == 1)
					{
						t2 = (b2 - 2) / 2 * 61 + b3 + 60 - 1;
					}
					else
					{
						t2 = ((b2 - 2) / 2 - 1) * 61 + b3 + 31 + 60 - 1;
					}
				}
				else if (b2 > 7)
				{
					if (b2 % 2 == 1)
					{
						t2 = 213 + ((b2 - 7) / 2 - 1) * 61 + 31 + b3 - 1;
					}
					else
					{
						t2 = 213 + (b2 - 7) / 2 * 61 + b3 - 1;
					}
				}
			d = ((b1 - a1) / 4) * (366 + 365 * 3) + (b1 - a1 - ((b1 - a1) / 4) * 4) * 366 + t2 - t1;
			}

		}
		else
		{
			if (a2 <= 2)
			{
				t1 = (a2 - 1) * 31 + a3;
			}
			else if (a2 <= 7)
			{
				if (a2 % 2 == 1)
				{
					t1 = (a2 - 2) / 2 * 61 + a3 + 60 - 1;
				}
				else
				{
					t1 = ((a2 - 2) / 2 - 1) * 61 + a3 + 31 + 60 - 1;
				}
			}
			else if (a2 > 7)
			{
				if (a2 % 2 == 1)
				{
					t1 = 213 + ((a2 - 7) / 2 - 1) * 61 + 31 + a3 - 1;
				}
				else
				{
					t1 = 213 + (a2 - 7) / 2 * 61 + a3 - 1;
				}
			}
			if ((b1 % 4 == 0 && b1 % 100 != 0) || (b1 % 400 == 0))
			{
				if (b2 <= 2)
				{
					t2 = (b2 - 1) * 31 + b3;
				}
				else if (b2 <= 7)
				{
					if (b2 % 2 == 1)
					{
						t2 = (b2 - 2) / 2 * 61 + b3 + 60;
					}
					else
					{
						t2 = ((b2 - 2) / 2 - 1) * 61 + b3 + 31 + 60;
					}
				}
				else if (b2 > 7)
				{
					if (b2 % 2 == 1)
					{
						t2 = 213 + ((b2 - 7) / 2 - 1) * 61 + 31 + b3;
					}
					else
					{
						t2 = 213 + (b2 - 7) / 2 * 61 + b3;
					}
				}
			d = ((b1 - a1) / 4) * (366 + 365 * 3) + (b1 - a1 - ((b1 - a1) / 4) * 4) * 365 + t2 - t1;
			}
			else
			{
				if (b2 <= 2)
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


