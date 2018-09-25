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
		int m;
		int d;
		int s;
		int er;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (y % 400 == 0)
		{
			er = 29;
			switch (m)
			{
			case 1:
				s = d;
				System.out.printf("%d\n",s);
				break;
			case 2:
				s = 31 + d;
				System.out.printf("%d\n",s);
				break;
			case 3:
				s = 31 + er + d;
				System.out.printf("%d\n",s);
				break;
			case 4:
				s = 31 * 2 + er + d;
				System.out.printf("%d\n",s);
				break;
			case 5:
				s = 31 * 2 + er + 30 + d;
				System.out.printf("%d\n",s);
				break;
			case 6:
				s = 31 * 3 + er + 30 + d;
				System.out.printf("%d\n",s);
				break;
			case 7:
				s = 31 * 3 + er + 30 * 2 + d;
				System.out.printf("%d\n",s);
				break;
			case 8:
				s = 31 * 4 + er + 30 * 2 + d;
				System.out.printf("%d\n",s);
				break;
			case 9:
				s = 31 * 5 + er + 30 * 2 + d;
				System.out.printf("%d\n",s);
				break;
			case 10:
				s = 31 * 5 + er + 30 * 3 + d;
				System.out.printf("%d\n",s);
				break;
			case 11:
				s = 31 * 6 + er + 30 * 3 + d;
				System.out.printf("%d\n",s);
				break;
			case 12:
				s = 31 * 6 + er + 30 * 4 + d;
				System.out.printf("%d\n",s);
			}
		}
		else
		{
			er = 28;
			switch (m)
			{
			case 1:
				s = d;
				System.out.printf("%d\n",s);
				break;
			case 2:
				s = 31 + d;
				System.out.printf("%d\n",s);
				break;
			case 3:
				s = 31 + er + d;
				System.out.printf("%d\n",s);
				break;
			case 4:
				s = 31 * 2 + er + d;
				System.out.printf("%d\n",s);
				break;
			case 5:
				s = 31 * 2 + er + 30 + d;
				System.out.printf("%d\n",s);
				break;
			case 6:
				s = 31 * 3 + er + 30 + d;
				System.out.printf("%d\n",s);
				break;
			case 7:
				s = 31 * 3 + er + 30 * 2 + d;
				System.out.printf("%d\n",s);
				break;
			case 8:
				s = 31 * 4 + er + 30 * 2 + d;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


