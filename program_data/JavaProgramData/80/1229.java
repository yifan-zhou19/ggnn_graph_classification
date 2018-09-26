//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	/********************************************************************
	file base:	main
	file ext:	cpp
	author:		cromwell
	
	purpose:	??????????? 
	*********************************************************************/
	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int i;
		int j = 0;
		int sum;
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
		int[] b = {31, 60, 91, 121, 152, 181, 213, 244, 274, 305, 335, 366};
		if (startyear != endyear && startyear + 1 != endyear)
		{
			for (i = startyear + 1;i < endyear;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					j++;
				}
			}
			if (startyear % 4 == 0 && startyear % 100 != 0 || startyear % 400 == 0)
			{
				if (endyear % 4 == 0 && endyear % 100 != 0 || endyear % 400 == 0)
				{
					if (startmonth != 1)
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + j + b[11] - b[startmonth - 2] - startday + b[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + j + b[11] - b[startmonth - 2] - startday + endday;
						}
					}
					else
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + j + b[11] - startday + b[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + j + b[11] - startday + endday;
						}
					}
				}
				else
				{
					if (startmonth != 1)
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + j + b[11] - b[startmonth - 2] - startday + a[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + j + b[11] - b[startmonth - 2] - startday + endday;
						}
					}
					else
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + j + b[11] - startday + a[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + j + b[11] - startday + endday;
						}
					}
				}
			}
			else
			{
				if (endyear % 4 == 0 && endyear % 100 != 0 || endyear % 400 == 0)
				{
					if (startmonth != 1)
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + j + a[11] - a[startmonth - 2] - startday + b[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + j + a[11] - a[startmonth - 2] - startday + endday;
						}
					}
					else
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + j + a[11] - startday + b[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + j + a[11] - startday + endday;
						}
					}
				}
				else
				{
					if (startmonth != 1)
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + j + a[11] - a[startmonth - 2] - startday + a[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + j + a[11] - a[startmonth - 2] - startday + endday;
						}
					}
					else
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + j + a[11] - startday + a[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + j + a[11] - startday + endday;
						}
					}
				}
			}
		}
		if (startyear + 1 == endyear)
		{
			if (startyear % 4 == 0 && startyear % 100 != 0 || startyear % 400 == 0)
			{
				if (endyear % 4 == 0 && endyear % 100 != 0 || endyear % 400 == 0)
				{
					if (startmonth != 1)
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + b[11] - b[startmonth - 2] - startday + b[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + b[11] - b[startmonth - 2] - startday + endday;
						}
					}
					else
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + b[11] - startday + b[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + b[11] - startday + endday;
						}
					}
				}
				else
				{
					if (startmonth != 1)
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + b[11] - b[startmonth - 2] - startday + a[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + b[11] - b[startmonth - 2] - startday + endday;
						}
					}
					else
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + b[11] - startday + a[endmonth - 2] + endday;
						}
						else
						{
							sum = (endyear - startyear - 1) * 365 + b[11] - startday + endday;
						}
					}
				}
			}
			else
			{
				if (endyear % 4 == 0 && endyear % 100 != 0 || endyear % 400 == 0)
				{
					if (startmonth != 1)
					{
						if (endmonth != 1)
						{
							sum = (endyear - startyear - 1) * 365 + a[11] - a[startmonth - 2] - startday + b[endmonth - 2] + endday;
						}
						else
						{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


