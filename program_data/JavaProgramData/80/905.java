package <missing>;

public class GlobalMembers
{
	// ???????.cpp 


	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int i;
		int num = 0;
		int k;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0));
		for (i = y1; i < y2; i++)
		{
			num = num + 365 + ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0));
		}
		for (i = 1; i < m1; i++)
		{
			switch (i)
			{
			case 1:
				num = num - 31;
				break;
			case 2:
				num = num - (28 + k);
				break;
			case 3:
				num = num - 31;
				break;
			case 4:
				num = num - 30;
				break;
			case 5:
				num = num - 31;
				break;
			case 6:
				num = num - 30;
				break;
			case 7:
				num = num - 31;
				break;
			case 8:
				num = num - 31;
				break;
			case 9:
				num = num - 30;
				break;
			case 10:
				num = num - 31;
				break;
			case 11:
				num = num - 30;
				break;
			}
		}
		num = num - d1 + d2;
		k = ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0));
		for (i = 1; i < m2; i++)
		{
			switch (i)
			{
			case 1:
				num = num + 31;
				break;
			case 2:
				num = num + (28 + k);
				break;
			case 3:
				num = num + 31;
				break;
			case 4:
				num = num + 30;
				break;
			case 5:
				num = num + 31;
				break;
			case 6:
				num = num + 30;
				break;
			case 7:
				num = num + 31;
				break;
			case 8:
				num = num + 31;
				break;
			case 9:
				num = num + 30;
				break;
			case 10:
				num = num + 31;
				break;
			case 11:
				num = num + 30;
				break;
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}



}

