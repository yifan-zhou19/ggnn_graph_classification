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
		int i;
		int year;
		int month1;
		int month2;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				if (month1 == 1)
				{
					a = 1;
				}
				else if (month1 == 2)
				{
					a = 32;
				}
				else if (month1 == 3)
				{
					a = 61;
				}
				else if (month1 == 4)
				{
					a = 92;
				}
				else if (month1 == 5)
				{
					a = 122;
				}
				else if (month1 == 6)
				{
					a = 153;
				}
				else if (month1 == 7)
				{
					a = 183;
				}
				else if (month1 == 8)
				{
					a = 214;
				}
				else if (month1 == 9)
				{
					a = 245;
				}
				else if (month1 == 10)
				{
					a = 275;
				}
				else if (month1 == 11)
				{
					a = 306;
				}
				else if (month1 == 12)
				{
					a = 336;
				}
				if (month2 == 1)
				{
					b = 1;
				}
				else if (month2 == 2)
				{
					b = 32;
				}
				else if (month2 == 3)
				{
					b = 61;
				}
				else if (month2 == 4)
				{
					b = 92;
				}
				else if (month2 == 5)
				{
					b = 122;
				}
				else if (month2 == 6)
				{
					b = 153;
				}
				else if (month2 == 7)
				{
					b = 183;
				}
				else if (month2 == 8)
				{
					b = 214;
				}
				else if (month2 == 9)
				{
					b = 245;
				}
				else if (month2 == 10)
				{
					b = 275;
				}
				else if (month2 == 11)
				{
					b = 306;
				}
				else if (month2 == 12)
				{
					b = 336;
				}

				if ((a - b) % 7 == 0)
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
				if (month1 == 1)
				{
					a = 1;
				}
				else if (month1 == 2)
				{
					a = 32;
				}
				else if (month1 == 3)
				{
					a = 60;
				}
				else if (month1 == 4)
				{
					a = 91;
				}
				else if (month1 == 5)
				{
					a = 121;
				}
				else if (month1 == 6)
				{
					a = 152;
				}
				else if (month1 == 7)
				{
					a = 182;
				}
				else if (month1 == 8)
				{
					a = 213;
				}
				else if (month1 == 9)
				{
					a = 244;
				}
				else if (month1 == 10)
				{
					a = 274;
				}
				else if (month1 == 11)
				{
					a = 305;
				}
				else if (month1 == 12)
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


