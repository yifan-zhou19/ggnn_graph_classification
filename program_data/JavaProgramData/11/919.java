package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int mounth;
		int day;
		int count = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mounth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			count = 1;
		}
		else
		{
			count = 0;
		}
		if (count == 1)
		{
			switch (mounth)
			{
			case 1:
				t = day;
				break;
			case 2:
				t = 31 + day;
				break;
			case 3:
				t = 60 + day;
				break;
			case 4:
				t = 91 + day;
				break;
			case 5:
				t = 121 + day;
				break;
			case 6:
				t = 152 + day;
				break;
			case 7:
				t = 182 + day;
				break;
			case 8:
				t = 213 + day;
				break;
			case 9:
				t = 244 + day;
				break;
			case 10:
				t = 274 + day;
				break;
			case 11:
				t = 305 + day;
				break;
			case 12:
				t = 335 + day;
				break;

			}
		}
		if (count == 0)
		{
			switch (mounth)
			{
			case 1:
				t = day;
				break;
			case 2:
				t = 31 + day;
				break;
			case 3:
				t = 59 + day;
				break;
			case 4:
				t = 90 + day;
				break;
			case 5:
				t = 120 + day;
				break;
			case 6:
				t = 151 + day;
				break;
			case 7:
				t = 181 + day;
				break;
			case 8:
				t = 212 + day;
				break;
			case 9:
				t = 243 + day;
				break;
			case 10:
				t = 273 + day;
				break;
			case 11:
				t = 304 + day;
				break;
			case 12:
				t = 334 + day;
				break;
			}
		}
		System.out.printf("%d",t);

	}

}

