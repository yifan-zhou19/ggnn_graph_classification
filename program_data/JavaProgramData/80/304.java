//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int[] year = new int[2];
	public static int[] month = new int[2];
	public static int[] day = new int[2];
	public static int i;
	public static int days = 0;
	public static int k = 0;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day[0] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year[1] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month[1] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day[1] = Integer.parseInt(tempVar6);
		}
		for (i = year[0] + 1;i < year[1];i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
			days += 366;
			}
			else
			{
				days += 365;
			}
		}
		if (year[0] != year[1])
		{
			  for (i = month[0] + 1;i <= 12;i++)
			  {
				 switch (i)
				 {
				  case 1:
			  case 3:
		  case 5:
	  case 7:
	case 8:
	case 10:
	case 12:
		days += 31;
		break;
				  case 2:
					  if ((year[0] % 4 == 0 && year[0] % 100 != 0) || (year[0] % 400 == 0))
					  {
						 days += 29;
					  }
						 else
						 {
							 days += 28;
						 }
					  break;
				  default:
					  days += 30;
				 }
			  }
			  for (i = 1;i <= month[1] - 1;i++)
			  {
				 switch (i)
				 {
				  case 1:
			  case 3:
		  case 5:
	  case 7:
	case 8:
	case 10:
	case 12:
		days += 31;
		break;
				  case 2:
					  if ((year[1] % 4 == 0 && year[1] % 100 != 0) || (year[1] % 400 == 0))
					  {
						 days += 29;
					  }
						 else
						 {
							 days += 28;
						 }
					  break;
				  default:
					  days += 30;
				 }
			  }
			  for (k = 0;k < 2;k++)
			  {
				  switch (month[k])
				  {
				  case 1:
			  case 3:
		  case 5:
	  case 7:
	case 8:
	case 10:
	case 12:
		days += (int)Math.abs(31 * (int)Math.abs(k - 1) - day[k]);
		break;
				  case 2:
					  if ((year[k] % 4 == 0 && year[k] % 100 != 0) || (year[k] % 400 == 0))
					  {
						 days += (int)Math.abs(29 * (int)Math.abs(k - 1) - day[k]);
					  }
						 else
						 {
							 days += (int)Math.abs(28 * (int)Math.abs(k - 1) - day[k]);
						 }
					  break;
				  default:
					  days += (int)Math.abs(30 * (int)Math.abs(k - 1) - day[k]);
				  }
			  }
		}
		else if (month[0] != month[1])
			   {
						for (i = month[0] + 1;i <= month[1] - 1;i++)
						{
						  switch (i)
						  {
						  case 1:
					  case 3:
				  case 5:
			  case 7:
		  case 8:
	  case 10:
	case 12:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


