package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int num = 0;
		int[] Ping = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
		{
			;
		}
		else
		{
			Ping[2]++;
		}
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < month ; i++)
		{
			num += Ping[i];
		}
	//	cout<<num+day<<endl;
		int year1 = (year - 1) % 400;
		num += year1 + year1 / 4 - year1 / 100 + day;
		switch (num % 7)
		{
		case 0:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		case 1:
			System.out.print("Mon.");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("Tue.");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("Wed.");
			System.out.print("\n");
			break;
		case 4:
			System.out.print("Thu.");
			System.out.print("\n");
			break;
		case 5:
			System.out.print("Fri.");
			System.out.print("\n");
			break;
		default:
			System.out.print("Sat.");
			System.out.print("\n");
			break;
		}

	}
}

