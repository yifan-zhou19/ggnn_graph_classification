package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] year = new int[5];
	int[] month = new int[5];
	int[] day = new int[5];
	int m;
	int tianshu;
	int i;
	for (i = 0;i <= 4;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i <= 4;i++)
	{
		switch (month[i])
		{
				case 1:
					m = 0;
					break;
		case 2:
			m = 31;
			break;
		case 3:
			m = 59;
			break;
			case 4:
				m = 90;
				break;
		case 5:
			m = 120;
			break;
		case 6:
			m = 151;
			break;
		case 7:
			m = 181;
			break;
		case 8:
			m = 212;
			break;
		case 9:
			m = 243;
			break;
		case 10:
			m = 273;
			break;
		case 11:
			m = 304;
			break;
		case 12:
			m = 334;
			break;
		}
			if ((year[i] % 400 == 0) || (year[i] % 4 == 0 && year[i] % 100 != 0))
			{
			  if (m > 31)
			  {
				  m = m + 1;
			  }
			}
	tianshu = m + day[i];
	System.out.printf("%d\n",tianshu);
	}
	return 0;
	}
}

