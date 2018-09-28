//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	//?????
	public static int Main()
	{
		int[] y = new int[10000];
		int[] m1 = new int[10000];
		int[] m2 = new int[10000];
		int n;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			if (y[i] % 4 == 0 && y[i] % 100 != 0 || y[i] % 400 == 0)
			{
				switch (m1[i])
				{
				case 1:
					m1[i] = 1;
					break;
				case 2:
					m1[i] = 31 + 1;
					break;
				case 3:
					m1[i] = 31 + 29 + 1;
					break;
				case 4:
					m1[i] = 31 + 29 + 31 + 1;
					break;
				case 5:
					m1[i] = 31 + 29 + 31 + 30 + 1;
					break;
				case 6:
					m1[i] = 31 + 29 + 31 + 30 + 31 + 1;
					break;
				case 7:
					m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 1;
					break;
				case 8:
					m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 1;
					break;
				case 9:
					m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 1;
					break;
				case 10:
					m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 1;
					break;
				case 11:
					m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 1;
					break;
				case 12:
					m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 1;
					break;
				}
				switch (m2[i])
				{
				case 1:
					m2[i] = 1;
					break;
				case 2:
					m2[i] = 31 + 1;
					break;
				case 3:
					m2[i] = 31 + 29 + 1;
					break;
				case 4:
					m2[i] = 31 + 29 + 31 + 1;
					break;
				case 5:
					m2[i] = 31 + 29 + 31 + 30 + 1;
					break;
				case 6:
					m2[i] = 31 + 29 + 31 + 30 + 31 + 1;
					break;
				case 7:
					m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 1;
					break;
				case 8:
					m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 1;
					break;
				case 9:
					m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 1;
					break;
				case 10:
					m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 1;
					break;
				case 11:
					m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 1;
					break;
				case 12:
					m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 1;
					break;
				}
				if ((m1[i] - m2[i]) % 7 == 0)
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
			else
			{
				switch (m1[i])
			{
				case 1:
					m1[i] = 1;
					break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


