package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		switch (month)
		{
		case 1:
		{
			n = day;
			break;
		}

		case 2:
		{
			n = 31 + day;
			  break;
		}

		case 3:
		{
			n = 59 + day;
					  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					  {
				n = n + 1;
					  }
					   else
					   {
				n = n;
					   }

			  break;
		}
		case 4:
		{
			n = 90 + day;
			  break;
		}
		case 5:
		{
			n = 120 + day;
			  break;
		}
		case 6:
		{
			n = 151 + day;
			  break;
		}
		case 7:
		{
			n = 181 + day;
			  break;
		}
		case 8:
		{
			n = 212 + day;
			  break;
		}
		case 9:
		{
			n = 243 + day;
			  break;
		}
		case 10:
		{
			n = 273 + day;
			  break;
		}
		case 11:
		{
			n = 304 + day;
			  break;
		}
		case 12:
		{
			n = 334 + day;
			  break;
		}
		}
		System.out.printf("%d\n",n);
			 return 0;
	}
}

