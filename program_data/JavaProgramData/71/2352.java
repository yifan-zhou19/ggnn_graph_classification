//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	//?????? 
	//???2012.10.23 
	//?????? 

	public static int Main()
	{
		int i;
		int n;
		int y;
		int m1;
		int m2;
		int d1;
		int d2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) //?????
			{
				switch (m1)
				{
					case 1:
						d1 = 1;
						break;
					case 2:
						d1 = 32;
						break;
					case 3:
						d1 = 61;
						break;
					case 4:
						d1 = 92;
						break;
					case 5:
						d1 = 122;
						break;
					case 6:
						d1 = 153;
						break;
					case 7:
						d1 = 183;
						break;
					case 8:
						d1 = 214;
						break;
					case 9:
						d1 = 245;
						break;
					case 10:
						d1 = 275;
						break;
					case 11:
						d1 = 306;
						break;
					case 12:
						d1 = 336;
						break;
				}
				switch (m2)
				{
					case 1:
						d2 = 1;
						break;
					case 2:
						d2 = 32;
						break;
					case 3:
						d2 = 61;
						break;
					case 4:
						d2 = 92;
						break;
					case 5:
						d2 = 122;
						break;
					case 6:
						d2 = 153;
						break;
					case 7:
						d2 = 183;
						break;
					case 8:
						d2 = 214;
						break;
					case 9:
						d2 = 245;
						break;
					case 10:
						d2 = 275;
						break;
					case 11:
						d2 = 306;
						break;
					case 12:
						d2 = 336;
						break;
				}
				if ((d1 - d2) % 7 == 0)
				{
				System.out.print("YES");
				System.out.print("\n");
				}
				else
				{
				System.out.print("NO");
				System.out.print("\n");
				}
			}
			else //??????
			{
				switch (m1)
				{
					case 1:
						d1 = 1;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


