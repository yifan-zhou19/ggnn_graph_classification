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
		int year;
		int month;
		int day;
		int b;
		int i;
		for (i = 1;i <= 5;++i)
		{
		int count = new int(int month,int year,int day);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		b = count(month, year, day);
		System.out.printf("%d\n",b);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b = Integer.parseInt(tempVar4);
		}
		return 0;
	}

		public static int count(int month,int year,int day)
		{
			int a;
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				switch (month)
				{
				case 1:
				a = day;
				break;
				case 2:
				a = 31 + day;
				break;
				case 3:
				a = 60 + day;
				break;
				case 4:
				a = 91 + day;
				break;
				case 5:
					a = 121 + day;
					break;
				case 6:
					a = 152 + day;
					break;
				case 7:
					a = 182 + day;
					break;
				case 8:
					a = 213 + day;
					break;
				case 9:
					a = 244 + day;
					break;
				case 10:
					a = 274 + day;
					break;
				case 11:
					a = 305 + day;
					break;
				case 12:
					a = 335 + day;
					break;
				}
			}
			else
			{
				switch (month)
				{
				case 1:
				a = day;
				break;
				case 2:
				a = 31 + day;
				break;
				case 3:
				a = 59 + day;
				break;
				case 4:
				a = 90 + day;
				break;
				case 5:
					a = 120 + day;
					break;
				case 6:
					a = 151 + day;
					break;
				case 7:
					a = 181 + day;
					break;
				case 8:
					a = 212 + day;
					break;
				case 9:
					a = 243 + day;
					break;
				case 10:
					a = 273 + day;
					break;
				case 11:
					a = 304 + day;
					break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


