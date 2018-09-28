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
		int a;
		int b;
		int c;
		int d;
		int B;
		int C;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0))
			{
				if (b > c)
				{
					d = c;
					c = b;
					b = d;
				}
				switch (b)
				{
					case 1:
						B = 0;
						break;
						{
					case 2:
						B = 31;
						break;
						}
						{
					case 3:
						B = 60;
						break;
			}
			{
					case 4:
						B = 91;
						break;
			}
			{
					case 5:
						B = 121;
						break;
			}
			{
					case 6:
						B = 152;
						break;
			}
			{
					case 7:
						B = 182;
						break;
			}
			{
					case 8:
						B = 213;
						break;
			}
			{
					case 9:
						B = 244;
						break;
			}
			{
					case 10:
						B = 274;
						break;
			}
			{
					case 11:
						B = 305;
						break;
			}
			{
					default:
						B = 335;
						break;
			}
				}
				switch (c)
				{
					case 1:
						C = 0;
						break;
						{
					case 2:
						C = 31;
						break;
						}
						{
					case 3:
						C = 60;
						break;
			}
			{
					case 4:
						C = 91;
						break;
			}
			{
					case 5:
						C = 121;
						break;
			}
			{
					case 6:
						C = 152;
						break;
			}
			{
					case 7:
						C = 182;
						break;
			}
			{
					case 8:
						C = 213;
						break;
			}
			{
					case 9:
						C = 244;
						break;
			}
			{
					case 10:
						C = 274;
						break;
			}
			{
					case 11:
						C = 305;
						break;
			}
			{
					default:
						C = 335;
						break;
			}
				}
				if ((C - B) % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


