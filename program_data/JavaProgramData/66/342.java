package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int month;
		int day;
		int k;
		int n;
		int[] l = new int[4];
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
		n = (year - 1) % 7 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		k = 2 * (month - 1); //??????30???????????//
		switch (month - 1) //??????30???//
		{
			case 1:
				k++;
				break;
			case 2:
				k--;
				break;
			case 5:
				k++;
				break;
			case 6:
				k++;
				break;
			case 7:
				k = k + 2;
				break;
			case 8:
				k = k + 3;
				break;
			case 9:
				k = k + 3;
				break;
			case 10:
				k = k + 4;
				break;
			case 11:
				k = k + 4;
				break;
		} //???????????????//
		l[2] = (n + k + day) % 7;
		if (year % 4 == 0) //???????????????2???28???????????????2?????1??//
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					if (month > 2)
					{
						l[2]++;
					}
				}
			}
			else
			{
					if (month > 2)
					{
						l[2]++;
					}
			}
		}
		l[3] = l[2] % 7; //????????//
		switch (l[3])
		{
			case 0:
				System.out.print("Sun.\n");
				break;
			case 1:
				System.out.print("Mon.\n");
				break;
			case 2:
				System.out.print("Tue.\n");
				break;
			case 3:
				System.out.print("Wed.\n");
				break;
			case 4:
				System.out.print("Thu.\n");
				break;
			case 5:
				System.out.print("Fri.\n");
				break;
			case 6:
				System.out.print("Sat.\n");
				break;
		}
	}

}

