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
		int by;
		int bm;
		int bd;
		by = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int ey;
		int em;
		int ed;
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int i = by + 1; i < ey; i++)
		{
			int leap = (i % 400 == 0) || (i % 100 != 0 && i % 4 == 0);
			sum = sum + (leap == 1 ? 366 : 365);
		}
		int temp = by == ey != 0 ? em : 12;
		for (int i = bm; i <= temp; i++)
		{
			int leapb = (by % 400 == 0) || (by % 100 != 0 && by % 4 == 0);
			if (i == 2)
			{
				if (leapb != 0)
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}
			switch (i)
			{

				case 1:
					sum += 31;
					break;
				case 3:
					sum += 31;
					break;
				case 5:
					sum += 31;
					break;
				case 7:
					sum += 31;
					break;
				case 8:
					sum += 31;
					break;
				case 10:
					sum += 31;
					break;
				case 12:
					sum += 31;
					break;
				case 4:
					sum += 30;
					break;
				case 6:
					sum += 30;
					break;
				case 9:
					sum += 30;
					break;
				case 11:
					sum += 30;
					break;
			}
		}
		sum -= bd;
		temp = by == ey != 0 ? bm : 1;
		for (int i = temp; i <= em - 1; i++)
		{
			int leape = (ey % 400 == 0) || (ey % 100 != 0 && ey % 4 == 0);
			if (i == 2)
			{
				if (leape != 0)
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}
			switch (i)
			{
				case 1:
					sum += 31;
					break;
				case 3:
					sum += 31;
					break;
				case 5:
					sum += 31;
					break;
				case 7:
					sum += 31;
					break;
				case 8:
					sum += 31;
					break;
				case 10:
					sum += 31;
					break;
				case 12:
					sum += 31;
					break;
				case 4:
					sum += 30;
					break;
				case 6:
					sum += 30;
					break;
				case 9:
					sum += 30;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


