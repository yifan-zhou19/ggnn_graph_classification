package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int year;
		int month;
		int date;
		int num;
		for (i = 1;i <= 5;i++)
		{
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
				 date = Integer.parseInt(tempVar3);
			 }
		switch (month)
		{
		case 1:
			num = 0;
			break;
		case 2:
			num = 31;
			break;
			 case 3:
				 num = 59;
				 break;
		case 4:
			num = 90;
			break;
		case 5:
			num = 120;
			break;
		case 6:
			num = 151;
			break;
		case 7:
			num = 181;
			break;
		case 8:
			num = 212;
			break;
		case 9:
			num = 243;
			break;
		case 10:
			num = 273;
			break;
		case 11:
			num = 304;
			break;
		case 12:
			num = 334;
			break;
		}
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month > 2)
		{
			num += 1;
		}
		num += date;
		System.out.printf("%d\n",num);
		}

		return 0;
	}
}

