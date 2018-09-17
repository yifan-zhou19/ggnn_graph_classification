//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int y;
		int m;
		int d;
		int a;
		int i;
		int ans;
		for (i = 1;i <= 5;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		if (y % 4 != 0)
		{
			a = 1;
		}
			else if (y % 100 != 0)
			{
				a = 0;
			}
				else if (y % 400 != 0)
				{
					 a = 1;
				}
					 else
					 {
					 a = 0;
					 }
		if (a != 0)
		{
			switch (m)
			{
			  case 1:
				  ans = d;
				  break;
			  case 2:
				  ans = 31 + d;
				  break;
			  case 3:
				  ans = 59 + d;
				  break;
			  case 4:
				  ans = 90 + d;
				  break;
			  case 5:
				  ans = 120 + d;
				  break;
			  case 6:
				  ans = 151 + d;
				  break;
			  case 7:
				  ans = 181 + d;
				  break;
			  case 8:
				  ans = 212 + d;
				  break;
			  case 9:
				  ans = 243 + d;
				  break;
			  case 10:
				  ans = 273 + d;
				  break;
			  case 11:
				  ans = 304 + d;
				  break;
			  case 12:
				  ans = 334 + d;
				  break;
			}
		}
			else
			{
			  switch (m)
			  {
				case 1:
					ans = d;
					break;
				case 2:
					ans = 31 + d;
					break;
				case 3:
					ans = 60 + d;
					break;
				case 4:
					ans = 91 + d;
					break;
				case 5:
					ans = 121 + d;
					break;
				case 6:
					ans = 152 + d;
					break;
				case 7:
					ans = 182 + d;
					break;
				case 8:
					ans = 213 + d;
					break;
				case 9:
					ans = 244 + d;
					break;
				case 10:
					ans = 274 + d;
					break;
				case 11:
					ans = 305 + d;
					break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


